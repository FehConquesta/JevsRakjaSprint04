--Eduardo Bezerra - RM: 98890
--Jefferson Mendes de Farias Lima - RM: 552052
--Joao Vitor Vicente Benjamin - RM: 98938
--Luiz Felipe Biazzola Cavalcante - RM: 99250
--Silas Henrique da Silva Oliveira - RM: 98965


-----------------DROP DAS TABELAS UTILIZANDO DROP TABLE-------------------------
--------------------------------------------------------------------------------


--DROP DE TODAS AS TABELAS EM ORDEM DE EXCLUSAO
DROP TABLE T_JR_ATENDIMENTO;
DROP TABLE T_JR_LOCALIZACAO;
DROP TABLE T_JR_MODAL;
DROP TABLE T_JR_PRESTADOR;
DROP TABLE T_JR_VEICULO_CLIENTE;
DROP TABLE T_JR_SEGURO;
DROP TABLE T_JR_CLIENTE;
DROP TABLE T_JR_ENDERECO;
DROP TABLE T_JR_FABRICANTE;
DROP TABLE T_JR_IMPLEMENTO;

-----------------CRIACAO DAS TABELAS UTILIZANDO CREATE TABLE--------------------
--------------------------------------------------------------------------------


--CRIACAO DA TABELA T_JR_FABRICANTE
CREATE TABLE T_JR_FABRICANTE(
	id_fabricante NUMERIC CONSTRAINT PK_T_JR_FABRICANTE PRIMARY KEY,
	nome VARCHAR2(60) NOT NULL,
	modelo VARCHAR2(60) NOT NULL

);

--CRIACAO DA TABELA T_JR_IMPLEMENTO
CREATE TABLE T_JR_IMPLEMENTO(
	id_implemento NUMERIC CONSTRAINT PK_T_JR_IMPLEMENTO PRIMARY KEY,
	tipo_implemento VARCHAR2(60) NOT NULL
);

--CRIACAO DA TABELA T_JR_ENDERECO
CREATE TABLE T_JR_ENDERECO(
	id_endereco NUMERIC CONSTRAINT PK_T_JR_ENDERECO PRIMARY KEY,
	cep VARCHAR2(60) NOT NULL,
	logradouro VARCHAR2(60) NOT NULL,
	numero NUMERIC NOT NULL,
	complemento VARCHAR2(60),
	referencia VARCHAR2(60)
);

--CRIACAO DA TABELA T_JR_CLIENTE
CREATE TABLE T_JR_CLIENTE(
	id_cliente NUMERIC CONSTRAINT PK_T_JR_CLIENTE PRIMARY KEY,
	cpf VARCHAR2(60) NOT NULL UNIQUE,
	nome_completo VARCHAR2(60) NOT NULL,
	rg VARCHAR2(60) NOT NULL,
    id_endereco NUMERIC NOT NULL,
	CONSTRAINT FK_T_JR_CLIENTE_T_JR_ENDERECO FOREIGN KEY (id_endereco) REFERENCES T_JR_ENDERECO(id_endereco)

);

--CRIACAO DA TABELA T_JR_SEGURO
CREATE TABLE T_JR_SEGURO(
	numero_apolice VARCHAR2(60) CONSTRAINT PK_T_JR_SEGURO PRIMARY KEY,
    id_cliente NUMERIC NOT NULL,
    CONSTRAINT FK_T_JR_SEGURO_T_JR_CLIENTE FOREIGN KEY (id_cliente) REFERENCES T_JR_CLIENTE(id_cliente)
);

--CRIACAO DA TABELA T_JR_VEICULO_CLIENTE
CREATE TABLE T_JR_VEICULO_CLIENTE(
	id_veiculo NUMERIC CONSTRAINT PK_T_JR_VEICULO_CLIENTE PRIMARY KEY,
	placa VARCHAR2(60) NOT NULL,
	ano NUMERIC(4) NOT NULL,
	portas NUMERIC,
	renavam NUMERIC NOT NULL,
    numero_apolice VARCHAR2(60) NOT NULL,
    id_implemento NUMERIC NOT NULL,
    id_fabricante NUMERIC NOT NULL,
    id_cliente NUMERIC NOT NULL,
	CONSTRAINT FK_T_JR_VEICULO_CLIENTE_T_JR_SEGURO FOREIGN KEY (numero_apolice) REFERENCES T_JR_SEGURO(numero_apolice),
	CONSTRAINT FK_T_JR_VEICULO_CLIENTE_T_JR_IMPLEMENTO FOREIGN KEY (id_implemento) REFERENCES T_JR_IMPLEMENTO(id_implemento),
	CONSTRAINT FK_T_JR_VEICULO_CLIENTE_T_JR_FABRICANTE FOREIGN KEY (id_fabricante) REFERENCES T_JR_FABRICANTE(id_fabricante),
	CONSTRAINT FK_T_JR_VEICULO_CLIENTE_T_JR_CLIENTE FOREIGN KEY (id_cliente) REFERENCES T_JR_CLIENTE(id_cliente)
);

--CRIACAO DA TABELA T_JR_PRESTADOR
CREATE TABLE T_JR_PRESTADOR(
	id_prestador NUMERIC CONSTRAINT PK_T_JR_PRESTADOR PRIMARY KEY,
	cpf VARCHAR2(60) NOT NULL UNIQUE,
	nome_completo VARCHAR2(60) NOT NULL,
	rg VARCHAR2(60) NOT NULL,
    id_endereco NUMERIC NOT NULL,
	CONSTRAINT FK_T_JR_PRESTADOR_T_JR_ENDERECO FOREIGN KEY (id_endereco) REFERENCES T_JR_ENDERECO(id_endereco)
);

--CRIACAO DA TABELA T_JR_MODAL
CREATE TABLE T_JR_MODAL(
	id_modal numeric CONSTRAINT PK_T_JR_MODAL PRIMARY KEY,
	modelo VARCHAR2(60) NOT NULL,
	placa VARCHAR2(60) NOT NULL,
	disponibilidade NUMERIC(1) NOT NULL,
    id_prestador NUMERIC,
	CONSTRAINT FK_T_JR_MODAL_T_JR_PRESTADOR FOREIGN KEY (id_prestador) REFERENCES T_JR_PRESTADOR(id_prestador)
);

--CRIACAO DA TABELA T_JR_LOCALIZACAO
CREATE TABLE T_JR_LOCALIZACAO(
	id_localizacao NUMERIC CONSTRAINT PK_T_JR_LOCALIZACAO PRIMARY KEY,
	nome_rodovia VARCHAR2(60) NOT NULL,
	km NUMERIC(10) NOT NULL,
	cep VARCHAR2(60),
	referencia VARCHAR2(60)
);

--CRIACAO DA TABELA T_JR_ATENDIMENTO
CREATE TABLE T_JR_ATENDIMENTO(
	id_atendimento NUMERIC CONSTRAINT PK_T_JR_ATENDIMENTO PRIMARY KEY,
	data_atendimento DATE NOT NULL,
	pbtc NUMERIC NOT NULL,
    id_localizacao NUMERIC NOT NULL,
    id_cliente NUMERIC NOT NULL,
    id_veiculo NUMERIC NOT NULL,
    id_modal NUMERIC NOT NULL,
	CONSTRAINT FK_T_JR_ATENTIMENTO_T_JR_LOCALIZACAO FOREIGN KEY (id_localizacao) REFERENCES T_JR_LOCALIZACAO(id_localizacao),
	CONSTRAINT FK_T_JR_ATENTIMENTO_T_JR_CLIENTE FOREIGN KEY (id_cliente) REFERENCES T_JR_CLIENTE(id_cliente),
	CONSTRAINT FK_T_JR_ATENTIMENTO_T_JR_VEICULO_CLIENTE FOREIGN KEY (id_veiculo) REFERENCES T_JR_VEICULO_CLIENTE(id_veiculo),
	CONSTRAINT FK_T_JR_ATENTIMENTO_T_JR_MODAL FOREIGN KEY (id_modal) REFERENCES T_JR_MODAL(id_modal)

);


--------------------------------------------------------------------------------


--INCLUSAO DE DADOS NA TABELA T_JR_FABRICANTE
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo)
VALUES(1,'Volvo','FMX');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo)
VALUES(2,'SCANIA','P 420');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo)
VALUES(3,'Mercedes','Actros Euro6');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo)
VALUES(4,'Ford','Ranger');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo)
VALUES(5,'Scania','F 340');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo)
VALUES(6,'Volvo','FH');
INSERT INTO t_jr_fabricante(id_fabricante,nome, modelo)
VALUES(7,'Mercedes','Euro10');

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS INCLUSAO DAS LINHAS
SELECT * FROM t_jr_fabricante;


--UPDATE NA TABELA T_JR_FABRICANTE ALTERANDO O NOME COM BASE NO MODELO
UPDATE t_jr_fabricante
SET nome = 'Renault'
WHERE modelo = 'Euro10';
--UPDATE NA TABELA T_JR_FABRICANTE ALTERANDO O MODELO COM BASE NO NOME
UPDATE t_jr_fabricante
SET modelo = 'Master'
WHERE nome = 'Renault';
--UPDATE NA TABELA T_JR_FABRICANTE ALTERANDO O MODELO COM BASE NO NOME E ID
UPDATE t_jr_fabricante
SET modelo = 'FH 545'
WHERE nome = 'Volvo' and id_fabricante = 6;

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS ALTERACOES
SELECT * FROM t_jr_fabricante;

--EXCLUSAO DA LINHA COM BASE NO NOME INFORMADO
DELETE FROM t_jr_fabricante
WHERE nome = 'Renault';
--EXCLUSAO DA LINHA COM BASE NO MODELO INFORMADO
DELETE FROM t_jr_fabricante
WHERE modelo = 'Ranger';
--EXCLUSAO DA LINHA COM BASE NO ID INFORMADO
DELETE FROM t_jr_fabricante
WHERE id_fabricante = 6;

--SELECT PARA MOSTRAR COMO A TABELA FICOU APOS A EXCLUSAO DE LINHAS
SELECT * FROM t_jr_fabricante;

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


--Inclusao de novos valores para manter a integridade
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('alp9',3); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('pls1',5); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('cat3',2); 

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

--inclusao de dados na tabela t_jr_veiculo_cliente
INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas,id_implemento,id_fabricante,id_cliente)
VALUES(1,'XPT-001',1993,080077, 'zx99',3,1,1,2);

INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(2,'XPT-002',2000,080666, '7987',2,2,1,2);

INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(3,'XPT-003',1970,080777, '8761',5,2,2,1);

INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(4,'XPT-004',2020,088888, 'H666',3,5,2,5);

INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(5,'XPT-051',2022,089999, 'alp9',2,1,3,3);

INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(6,'XPT-066',2023,080099, 'pls1',2,6,5,5);

INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(7,'XPT-099',1999,990077, 'cat3',4,6,5,2);


--Select para mostrar como esta a tabela apos inclusao de dados
select*from t_jr_veiculo_cliente;

--Update na tabela t_jr_veiculo_cliente
update t_jr_veiculo_cliente
set ano = 1666
where placa = 'XPT-066';

update t_jr_veiculo_cliente
set renavam = 99999
where id_veiculo = 7;

update t_jr_veiculo_cliente
set placa = 'OTN-1993'
where numero_apolice = 'alp9';

--Select para mostrar como esta a tabela apos alteracao dos dados
select*from t_jr_veiculo_cliente;

--Delete na tabela t_jr_veiculo_cliente

delete t_jr_veiculo_cliente
where renavam = 99999;

delete t_jr_veiculo_cliente
where placa = 'OTN-1993';

delete t_jr_veiculo_cliente
where id_veiculo = 6;

--Select para mostrar como esta a tabela apos exclusao
select*from t_jr_veiculo_cliente;

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------


-- Inclusao de dados na tabela t_jr_prestador
INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
values(1, '999.999.999-99', 'Wesley Snipes', '99.999.999-9',2);

INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
values(2, '222.999.999-99', 'Thor Odinson', '99.999.111-9',2);

INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
values(3, '999.222.999-99', 'Bruce Banner', '99.999.222-9',3);

INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
values(4, '999.999.222-99', 'Scarlet Scarlate', '99.999.333-9',5);

INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
values(5, '999.999.999-22', 'Bob Esponja', '99.999.444-9',5);

INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
values(6, '222.222.222-22', 'Patrick Estrela', '99.999.555-9',6);

INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
values(7, '111.999.222-99', 'Lula Molusco', '99.999.666-9',6);

--Select para exibir informacoes apos a inclusao
select*from t_jr_prestador;

--Update de informacoes na tabela t_jr_prestador

UPDATE t_jr_prestador
set nome_completo = 'Sr Serigueijo'
where cpf = '111.999.222-99';

UPDATE t_jr_prestador
set cpf = '196.659.988-99'
where id_prestador = 2;

UPDATE t_jr_prestador
set rg = '35.987.689-9'
where nome_completo = 'Patrick Estrela';

--Select para exibir informacoes apos update
select*from t_jr_prestador;

--Delete de linhas da t_jr_prestador

delete t_jr_prestador
where nome_completo ='Bob Esponja';

delete t_jr_prestador
where cpf ='111.999.222-99';

delete t_jr_prestador
where id_prestador ='2';

--Select para exibir informacoes apos delete
select*from t_jr_prestador;

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

INSERT INTO t_jr_modal(id_modal, modelo, placa, disponibilidade, id_prestador)
VALUES(1,'Munch','XPT-8780',1,1);

INSERT INTO t_jr_modal(id_modal, modelo, placa, disponibilidade, id_prestador)
VALUES(2,'Lanca','HPB-8780',0,3);

INSERT INTO t_jr_modal(id_modal, modelo, placa, disponibilidade, id_prestador)
VALUES(3,'Zero Grau','XIS-8780',0,3);

INSERT INTO t_jr_modal(id_modal, modelo, placa, disponibilidade, id_prestador)
VALUES(4,'Plataforma','YES-8780',1,6);

INSERT INTO t_jr_modal(id_modal, modelo, placa, disponibilidade, id_prestador)
VALUES(5,'Plataforma','NOP-8780',1,4);

INSERT INTO t_jr_modal(id_modal, modelo, placa, disponibilidade, id_prestador)
VALUES(6,'Munch','AHA-8780',0,4);

INSERT INTO t_jr_modal(id_modal, modelo, placa, disponibilidade, id_prestador)
VALUES(7,'Lanca','MEH-8780',1,3);


--Select para exibir tabela apos insercao de dados
select * from t_jr_modal;

--Update da tabela t_jr_modal

UPDATE t_jr_modal
set modelo = 'Zero Grau'
where placa = 'NOP-8780';

UPDATE t_jr_modal
set modelo = 'Guindaste'
where id_modal = 7;

UPDATE t_jr_modal
set placa = 'UHU-9999'
where modelo = 'Guindaste';

--Select para exibir tabela apos atualizacao dos dados
select * from t_jr_modal;

--Delete da tabela t_jr_modal

DELETE t_jr_modal
where modelo = 'Guindaste';

DELETE t_jr_modal
where placa = 'AHA-8780';

DELETE t_jr_modal
where id_modal = 4;

--Select para exibir tabela apos exclusao de linhas
select * from t_jr_modal;


--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------


--Insert na tabela t_jr_localizacao
INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
values(1,'Regis Bittencourt', 147,'','');

INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
values(2,'Castelo Branco', 39,'','');

INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
values(3,'Regis Bittencourt', 345,'','Proximo ao posto da Policia Rodoviaria');

INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
values(4,'Anhanguera', 79,'','');

INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
values(5,'Bandeirantes', 69,'','');

INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
values(6,'Dutra', 88,'','Proximo ao pedagio');

INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
values(7,'Regis Bittencourt', 70,'','');

--Select para mostrar a tabela apos inclusoes
select*from t_jr_localizacao;

--Update da tabela t_jr_localizacao
UPDATE t_jr_localizacao
set nome_rodovia = 'Imigrantes'
where id_localizacao = 1;

UPDATE t_jr_localizacao
set km = 387
where id_localizacao = 7;

UPDATE t_jr_localizacao
set nome_rodovia = 'Anchieta'
where id_localizacao = 3;

--Select para mostrar a tabela apos alteracoes
select*from t_jr_localizacao;

--Delete na tabela t_jr_localizacao
delete from t_jr_localizacao
where referencia = 'Proximo ao pedagio';

delete from t_jr_localizacao
where id_localizacao = 7;

delete from t_jr_localizacao
where nome_rodovia = 'Castelo Branco';

--Select para mostrar a tabela apos deletes
select*from t_jr_localizacao;

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

--Insert na tabela t_jr_atendimento
INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
values(1,'24/08/2000',2987,1,1,1,1);

INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
values(2,'22/05/2020',40000,1,1,2,1);

INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
values(3,'15/06/2023',37700,3,2,3,2);

INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
values(4,'21/02/2022',8000004,3,3,3,3);

INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
values(5,'30/10/2021',98789,5,5,4,3);

INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
values(6,'28/02/2019',3678987,5,5,4,5);

INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
values(7,'29/11/2020',709786,3,1,2,5);

--Select para mostrar a tabela apos inclusao de dados
select * from t_jr_atendimento;

--Update de informacoes na tabela t_jr_atendimento
Update t_jr_atendimento
set pbtc = 9000000
where id_atendimento = 1;

Update t_jr_atendimento
set data_atendimento = '25/12/2002'
where id_atendimento = 3;

Update t_jr_atendimento
set pbtc = 87676567
where id_atendimento = 5;

--Select para mostrar a tabela apos alteracao de dados
select * from t_jr_atendimento;

--Delete da tabela t_jr_atendimento
delete t_jr_atendimento
where pbtc = 87676567;

delete t_jr_atendimento
where id_atendimento = 3;

delete t_jr_atendimento
where id_atendimento = 4;

--Select para mostrar a tabela apos exclusao de linhas
select * from t_jr_atendimento;

--------------------------------------------------------------------------------
--------------------------------------------------------------------------------
--------------------------------------------------------------------------------

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
    where ano = 1993);

--Relatorio utilizando juncao de tabelas
select t_jr_cliente.nome_completo, t_jr_veiculo_cliente.id_fabricante
from t_jr_cliente
join t_jr_veiculo_cliente on t_jr_veiculo_cliente.id_cliente = t_jr_veiculo_cliente.id_cliente;