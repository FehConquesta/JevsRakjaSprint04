--Eduardo Bezerra - RM: 98890
--Jefferson Mendes de Farias Lima - RM: 552052
--Joao Vitor Vicente Benjamin - RM: 98938
--Luiz Felipe Biazzola Cavalcante - RM: 99250
--Silas Henrique da Silva Oliveira - RM: 98965


-- drop de todas as tabelas
drop table T_JR_ATENDIMENTO;
drop table T_JR_LOCALIZACAO;
drop table T_JR_MODAL;
drop table T_JR_PRESTADOR;
drop table T_JR_VEICULO_CLIENTE;
drop table T_JR_SEGURO;
drop table T_JR_CLIENTE;
drop table T_JR_ENDERECO;
drop table T_JR_fabricante;
drop table T_JR_IMPLEMENTO;

--criacaoo da tabela t_jr_fabricante
create table T_JR_FABRICANTE(
	id_fabricante numeric constraint PK_T_JR_FABRICANTE primary key,
	nome varchar(60) not null,
	modelo varchar(60) not null

);
--criacao da tabela t_jr_implemento
create table T_JR_IMPLEMENTO(
	id_implemento numeric constraint PK_T_JR_IMPLEMENTO primary key,
	tipo_implemento varchar(60) not null
);
--criacao da tabela t_jr_endereco
create table T_JR_ENDERECO(
	id_endereco numeric constraint PK_T_JR_ENDERECO primary key,
	cep varchar(60) not null,
	logradouro varchar(60) not null,
	numero numeric not null,
	complemento varchar(60),
	referencia varchar(60)
);
--criacao da tabela t_jr_cliente
create table T_JR_CLIENTE(
	id_cliente numeric constraint PK_T_JR_CLIENTE primary key,
	cpf varchar(60) not null,
	nome_completo varchar(60) not null,
	rg varchar(60) not null,
    id_endereco numeric not null,
	CONSTRAINT FK_T_JR_CLIENTE_T_JR_ENDERECO FOREIGN KEY (id_endereco) references T_JR_ENDERECO(id_endereco)

);
--criacao da tabela t_jr_seguro
create table T_JR_SEGURO(
	numero_apolice varchar(60) constraint PK_T_JR_SEGURO primary key,
    id_cliente numeric not null,
    CONSTRAINT FK_T_JR_SEGURO_T_JR_CLIENTE FOREIGN KEY (id_cliente) references T_JR_CLIENTE(id_cliente)
);
--criacao da tabela t_jr_veiculo_cliente
create table T_JR_VEICULO_CLIENTE(
	id_veiculo numeric constraint PK_T_JR_VEICULO_CLIENTE primary key,
	placa varchar(60) not null,
	ano numeric(4) not null,
	portas numeric,
	renavam numeric not null,
    numero_apolice varchar(60) not null,
    id_implemento numeric not null,
    id_fabricante numeric not null,
    id_cliente numeric not null,
	CONSTRAINT FK_T_JR_VEICULO_CLIENTE_T_JR_SEGURO FOREIGN KEY (numero_apolice) references T_JR_SEGURO(numero_apolice),
	CONSTRAINT FK_T_JR_VEICULO_CLIENTE_T_JR_IMPLEMENTO FOREIGN KEY (id_implemento) references T_JR_IMPLEMENTO(id_implemento),
	CONSTRAINT FK_T_JR_VEICULO_CLIENTE_T_JR_FABRICANTE FOREIGN KEY (id_fabricante) references T_JR_FABRICANTE(id_fabricante),
	CONSTRAINT FK_T_JR_VEICULO_CLIENTE_T_JR_CLIENTE FOREIGN KEY (id_cliente) references T_JR_CLIENTE(id_cliente)
);
--criacao da tabela t_jr_prestador
create table T_JR_PRESTADOR(
	id_prestador numeric constraint PK_T_JR_PRESTADOR primary key,
	cpf varchar(60) not null,
	nome_completo varchar(60) not null,
	rg varchar(60) not null,
    id_endereco numeric not null,
	CONSTRAINT FK_T_JR_PRESTADOR_T_JR_ENDERECO FOREIGN KEY (id_endereco) references T_JR_ENDERECO(id_endereco)
);
--criacao da tabela t_jr_modal
create table T_JR_MODAL(
	id_modal numeric constraint PK_T_JR_MODAL primary key,
	modelo varchar(60) not null,
	placa varchar(60) not null,
	disponibilidade numeric(1) not null,
    id_prestador numeric,
	CONSTRAINT FK_T_JR_MODAL_T_JR_PRESTADOR FOREIGN KEY (id_prestador) references T_JR_PRESTADOR(id_prestador)
);
--criacao da tabela t_jr_localizacao
create table T_JR_LOCALIZACAO(
	id_localizacao numeric constraint PK_T_JR_LOCALIZACAO primary key,
	nome_rodovia varchar(60) not null,
	km numeric(10) not null,
	cep varchar(60),
	referencia varchar(60)
);
--criacao da tabela t_jr_atendimento
create table T_JR_ATENDIMENTO(
	id_atendimento numeric constraint PK_T_JR_ATENDIMENTO primary key,
	data_atendimento date not null,
	pbtc numeric not null,
    id_localizacao numeric not null,
    id_cliente numeric not null,
    id_veiculo numeric not null,
    id_modal numeric not null,
	CONSTRAINT FK_T_JR_ATENTIMENTO_T_JR_LOCALIZACAO FOREIGN KEY (id_localizacao) references T_JR_LOCALIZACAO(id_localizacao),
	CONSTRAINT FK_T_JR_ATENTIMENTO_T_JR_CLIENTE FOREIGN KEY (id_cliente) references T_JR_CLIENTE(id_cliente),
	CONSTRAINT FK_T_JR_ATENTIMENTO_T_JR_VEICULO_CLIENTE FOREIGN KEY (id_veiculo) references T_JR_VEICULO_CLIENTE(id_veiculo),
	CONSTRAINT FK_T_JR_ATENTIMENTO_T_JR_MODAL FOREIGN KEY (id_modal) references T_JR_MODAL(id_modal)

);

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

--insert na tabela t_jr_fabricante
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo) VALUES(1,'Volvo','FMX');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo) VALUES(2,'SCANIA','P 420');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo) VALUES(3,'Mercedes','Actros Euro6');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo) VALUES(4,'Ford','Ranger');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo) VALUES(5,'Scania','F 340');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo) VALUES(6,'Volvo','FH');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo) VALUES(7,'Mercedes','Euro10');

--Select para mostrar como está a tabela apos os insert
select * from t_jr_fabricante;

--update da tabela t_jr_fabricante
update t_jr_fabricante
set nome = 'Renault'
where modelo = 'Euro10';

update t_jr_fabricante
set modelo = 'Master'
where nome = 'Renault';

update t_jr_fabricante
set modelo = 'FH 545'
where nome = 'Volvo' and id_fabricante = 6;

--Select para mostrar como está a tabela t_jr_fabricante apos os update
select * from t_jr_fabricante;

--Delete na tabela t_jr_fabricante
delete from t_jr_fabricante
where nome = 'Renault';

delete from t_jr_fabricante
where modelo = 'Ranger';

delete from t_jr_fabricante
where id_fabricante = 6;

--Select para mostrar como está a tabela t_jr_fabricante apos o delete
select * from t_jr_fabricante;

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------


--insert na tabela t_jr_implemento
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento) VALUES(1,'Carga Seca');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento) VALUES(2,'Bau');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento) VALUES(3,'Cegonha');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento) VALUES(4,'Graneleiro');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento) VALUES(5,'Tanque');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento) VALUES(6,'Refrigerado');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento) VALUES(7,'Carroceria Aberta');

--Select para mostrar como esta a tabela apos os insert
select * from t_jr_implemento;

--Update da tabela t_jr_implemento
update t_jr_implemento
set tipo_implemento = 'Congelado'
where tipo_implemento = 'Refrigerado';

update t_jr_implemento
set tipo_implemento = 'Refrigerado'
where id_implemento = '6';

update t_jr_implemento
set tipo_implemento = 'Granadeiro'
where id_implemento = '4';

--Select para mostrar como esta a tabela apos os update
select * from t_jr_implemento;

--Delete na tabela t_jr_implemento
delete from t_jr_implemento
where tipo_implemento = 'Granadeiro';

delete from t_jr_implemento
where tipo_implemento = 'Carroceria Aberta';

delete from t_jr_implemento
where id_implemento = 3;

--Select para mostrar como esta a tabela apos os delete
select * from t_jr_implemento;


--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

--insert na tabela t_jr_endereco
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia) VALUES(1,'03268-000','Rua dos animais', 35,'','Proximo a um pe de jabuticaba');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia) VALUES(2,'03269-050','Rua dos bichos', 74,'','');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia) VALUES(3,'03268-100','Rua Ananias', 351,'','Em frente ao bar do Gordo');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia) VALUES(4,'03268-001','Rua Poloni', 180,'Fica na Viela','');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia) VALUES(5,'03277-000','Rua da Luz', 21,'','Proximo ao Mercado do amor');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia) VALUES(6,'03268-666','Rua Osters', 101,'Fundos','Portao amarelo');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia) VALUES(7,'03666-000','Rua China', 69,'Casa 2','Casa do final da rua');

--Select para mostrar como esta a tabela apos o insert
select*from t_jr_endereco;

--Update da tabela t_jr_endereco
update t_jr_endereco
set referencia = 'Proximo a um pe de Jambo'
where cep = '03268-000';

update t_jr_endereco
set logradouro = 'Rua Chinatown'
where numero = 69;

update t_jr_endereco
set cep = '06890-000'
where id_endereco = 4;

--Select para mostrar como esta a tabela apos o update
select*from t_jr_endereco;

--delete da tabela t_jr_endereco
delete from t_jr_endereco
where referencia = 'Proximo a um pe de Jambo';

delete from t_jr_endereco
where logradouro = 'Rua Poloni';

delete from t_jr_endereco
where id_endereco = 7;

--Select para mostrar como esta a tabela apos os delete
select*from t_jr_endereco;


--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

-- Insert na tabela t_jr_cliente
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco) values (1,'321.365.525-29', 'Eduardo Bezerra', '32.954.589-6',2);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco) values (2,'321.666.525-29', 'Jefferson Mendes', '33.333.589-3',2);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco) values (3,'321.365.666-29', 'Joao Victor Benjamin', '32.222.229-2',3);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco) values (4,'321.365.525-66', 'Luiz Felipe Biazzola', '31.111.589-1',5);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco) values (5,'666.365.525-29', 'Silas Henrique', '32.544.111-6',6);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco) values (6,'333.322.525-22', 'Osmar Olindo', '34.444.589-4',5);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco) values (7,'111.365.111-29', 'Rebecca Chambers', '31.123.123-6',6);

--Select para mostrar como esta a tabela apos os insert
select * from t_jr_cliente;


--Alteracao da tabela t_jr_cliente
update t_jr_cliente
set nome_completo = 'Linda Silva'
where nome_completo = 'Osmar Olindo';

update t_jr_cliente
set cpf = '111.111.111-11'
where rg = '31.123.123-6';

update t_jr_cliente
set rg = '99.999.999-9'
where id_cliente = 3;


--Select para mostrar como esta a tabela apos os update
select * from t_jr_cliente;

--Delete da tabela t_jr_cliente;
delete from t_jr_cliente
where id_cliente = 7;

delete from t_jr_cliente
where id_cliente = 7;

delete from t_jr_cliente
where nome_completo = 'Linda Silva';

delete from t_jr_cliente
where cpf = '321.365.525-66';

--Select para mostrar como esta a tabela apos os delete
select * from t_jr_cliente;

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

--insert da tabela t_jr_seguro
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('5x43',1); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('zx99',2); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('7987',2); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('alp9',3); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('8761',1); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('pls1',5); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('cat3',5); 


--Select para mostrar como a tabela ficou apos os insert
select *from t_jr_seguro;

--Updates na tabela t_jr_seguro
update t_jr_seguro
set numero_apolice = 'H666'
where numero_apolice = 'cat3';

update t_jr_seguro
set numero_apolice = 'Osm9'
where numero_apolice = 'pls1';

update t_jr_seguro
set numero_apolice = 'INF3'
where id_cliente = 3;

--Select para mostrar como a tabela ficou apos os update
select *from t_jr_seguro;

--Delete na tabela t_jr_seguro;
delete from t_jr_seguro
where numero_apolice = 'Osm9';

delete from t_jr_seguro
where id_cliente = 3;

delete from t_jr_seguro
where numero_apolice = '5x43';

--Select para mostrar como a tabela ficou apos os delete
select *from t_jr_seguro;


--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

--insert na tabela t_jr_veiculo_cliente
insert into T_JR_VEICULO_CLIENTE values (1,'xxx-000',1993,2,1234556,'5c43',1,1,1);



--select para mostrar como esta a tabela t_jr_cliente
select * from t_jr_cliente;

-- update da tabela t_jr_cliente
UPDATE t_jr_cliente
SET nome_completo = 'Luiz Felipe Biazzola'
where nome_completo = 'Teste nome completo';

--select para mostrar como esta a tabela t_jr_cliente apos update
select * from t_jr_cliente;

--select para mostrar como esta a tabela t_jr_fabricante
select * from t_jr_fabricante;

--update da tabela t_jr_fabricante
UPDATE t_jr_fabricante
set modelo = 'Actros'
where id_fabricante = 3;

--select para mostrar como esta a tabela t_jr_fabricante apos update
select * from t_jr_fabricante;

--select para mostrar como esta a tabela t_jr_endereco
select * from t_jr_endereco;

--update da tabela t_jr_endereco
update t_jr_endereco
set complemento = 'Apt 91 bloco 3'
where id_endereco = 1;

--select para mostrar como esta a tabela t_jr_endereco apos update
select * from t_jr_endereco;

--select para mostrar como esta a tabela t_jr_fabricante antes do delete.
select * from t_jr_fabricante;


--delete de linhas tabela t_jr_fabricante

delete from t_jr_fabricante
where id_fabricante = 4;

--select para mostrar como esta a tabela t_jr_fabricante apos primeiro delete.
select * from t_jr_fabricante;

--delete de linhas tabela t_jr_fabricante
delete from t_jr_fabricante
where nome ='SCANIA';

--select para mostrar como esta a tabela t_jr_fabricante apos segundo delete.
select * from t_jr_fabricante;

--delete de linhas tabela t_jr_fabricante
delete from t_jr_fabricante
where modelo = 'Actros';

--select para mostrar como esta a tabela t_jr_fabricante apos terceiro delete.
select * from t_jr_fabricante;

--inserindo novamente os valores na tabela t_jr_fabricante para nao deixa-la vazia
--Foi inserido em ordem aleatoria os dados nao seguindo a ordem do id_fabricante

INSERT INTO t_jr_fabricante VALUES(3,'SCANIA','P 420');
INSERT INTO t_jr_fabricante VALUES(4,'Mercedes','Actros Euro6');
INSERT INTO t_jr_fabricante VALUES(2,'Mercedes','R440');

--select para mostrar a tabela com os id fora de ordem
select * from t_jr_fabricante;


-- insert de novas linhas na tabelat_jr_veiculo_cliente

insert into T_JR_VEICULO_CLIENTE values (2,'xxx-100',1992,4,1234556,'5c43',1,2,1);
insert into T_JR_VEICULO_CLIENTE values (3,'xxx-011',1992,6,1234556,'5c43',1,3,1);
insert into T_JR_VEICULO_CLIENTE values (4,'xxx-110',1999,4,1234556,'5c43',1,3,1);


--select para mostrar como esta a tabela t_jr_veiculo_cliente
select * from t_jr_veiculo_cliente;


--Relatorio utilizando classificacao de dados para mostrar pelo id_fabricante de maneira decrescente
select * from t_jr_fabricante
order by id_fabricante desc;

--Relatorio utilizando alguma funcao do tipo numerica simples para mostrar a media de portas dos veiculos
select avg(portas) as media_portas from t_jr_veiculo_cliente;

--Relatorio utilizando alguma funcao de grupo para agrupar a quantidade de veiculos por id_cliente
select id_cliente, count(*) as total_veiculos
from t_jr_veiculo_cliente
group by id_cliente;

--Relatorio utilizando sub consulta pegando o nome e modelo da tabela t_jr_fabricante onde o id_veiculo da tabelta t_jr_veiculo_cliente tem o ano de 1999
select nome,modelo
from t_jr_fabricante
where id_fabricante in (
    select id_veiculo
    from t_jr_veiculo_cliente
    where ano = 1999);



--Relatorio utilizando juncao de tabelas
select t_jr_cliente.nome_completo, t_jr_veiculo_cliente.id_fabricante
from t_jr_cliente
join t_jr_veiculo_cliente on t_jr_veiculo_cliente.id_cliente = t_jr_veiculo_cliente.id_cliente;