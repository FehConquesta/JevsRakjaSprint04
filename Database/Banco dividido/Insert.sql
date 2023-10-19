--GRUPO 
--Eduardo Bezerra - RM: 98890
--Jefferson Mendes de Farias Lima - RM: 552052
--Joao Vitor Vicente Benjamin - RM: 98938
--Luiz Felipe Biazzola Cavalcante - RM: 99250
--Silas Henrique da Silva Oliveira - RM: 9896


-----------------POPULANDO AS TABELAS UTILIZANDO INSERT-------------------------
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


--------------------------------------------------------------------------------


--INCLUSAO DE DADOS NA TABELA T_JR_IMPLEMENTO
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento)
VALUES(1,'Carga Seca');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento)
VALUES(2,'Bau');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento)
VALUES(3,'Cegonha');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento)
VALUES(4,'Graneleiro');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento) 
VALUES(5,'Tanque');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento)
VALUES(6,'Refrigerado');
INSERT INTO t_jr_implemento(id_implemento,tipo_implemento)
VALUES(7,'Carroceria Aberta');

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS INCLUSAO DAS LINHAS
SELECT * FROM t_jr_implemento;


--------------------------------------------------------------------------------


--INCLUSAO DE DADOS NA TABELA T_JR_ENDERECO
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia)
VALUES(1,'03268-000','Rua dos animais', 35,'','Proximo a um pe de jabuticaba');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia)
VALUES(2,'03269-050','Rua dos bichos', 74,'','');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia)
VALUES(3,'03268-100','Rua Ananias', 351,'','Em frente ao bar do Gordo');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia)
VALUES(4,'03268-001','Rua Poloni', 180,'Fica na Viela','');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia)
VALUES(5,'03277-000','Rua da Luz', 21,'','Proximo ao Mercado do amor');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia)
VALUES(6,'03268-666','Rua Osters', 101,'Fundos','Portao amarelo');
INSERT INTO t_jr_endereco(id_endereco,cep,logradouro,numero,complemento,referencia)
VALUES(7,'03666-000','Rua China', 69,'Casa 2','Casa do final da rua');

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS INCLUSAO DAS LINHAS
SELECT * FROM t_jr_endereco;


--------------------------------------------------------------------------------


--INCLUSAO DE DADOS NA TABELA T_JR_CLIENTE
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco)
VALUES (1,'321.365.525-29', 'Eduardo Bezerra', '32.954.589-6',2);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco)
VALUES (2,'321.666.525-29', 'Jefferson Mendes', '33.333.589-3',2);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco) 
VALUES (3,'321.365.666-29', 'Joao Victor Benjamin', '32.222.229-2',3);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco)
VALUES (4,'321.365.525-66', 'Luiz Felipe Biazzola', '31.111.589-1',5);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco)
VALUES (5,'666.365.525-29', 'Silas Henrique', '32.544.111-6',6);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco)
VALUES (6,'333.322.525-22', 'Osmar Olindo', '34.444.589-4',5);
INSERT INTO t_jr_cliente (id_cliente,cpf,nome_completo,rg,id_endereco)
VALUES (7,'111.365.111-29', 'Rebecca Chambers', '31.123.123-6',6);

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS INCLUSAO DAS LINHAS
SELECT * FROM t_jr_cliente;
--------------------------------------------------------------------------------


--INCLUSAO DE DADOS NA TABELA T_JR_SEGURO
INSERT INTO t_jr_seguro(numero_apolice, id_cliente)
VALUES ('5x43',1); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente)
VALUES ('zx99',2); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente)
VALUES ('7987',3); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente)
VALUES ('alp9',4); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente)
VALUES ('8761',5); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente)
VALUES ('pls7',6); 
INSERT INTO t_jr_seguro(numero_apolice, id_cliente)
VALUES ('cat3',7); 

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS INCLUSAO DAS LINHAS
SELECT * FROM t_jr_seguro;


--------------------------------------------------------------------------------


--INCLUSAO DE DADOS NA TABELA T_JR_VEICULO_CLIENTE
INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas,id_implemento,id_fabricante,id_cliente)
VALUES(1,'XPT-001',1993,080077, 'zx99',3,1,1,2);
INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(2,'XPT-002',2000,080666, '7987',2,2,1,2);
INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(3,'XPT-003',1970,080777, '8761',5,2,2,1);
INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(4,'XPT-004',2020,088888, '5x43',3,5,2,5);
INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(5,'XPT-051',2022,089999, 'alp9',2,1,3,3);
INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(6,'XPT-066',2023,080099, 'pls7',2,6,5,5);
INSERT INTO t_jr_veiculo_cliente(id_veiculo,placa,ano,renavam, numero_apolice, portas, id_implemento,id_fabricante,id_cliente)
VALUES(7,'XPT-099',1999,990077, 'cat3',4,6,5,2);

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS INCLUSAO DAS LINHAS
SELECT * FROM t_jr_veiculo_cliente;


--------------------------------------------------------------------------------


--INCLUSAO DE DADOS NA TABELA T_JR_PRESTADOR
INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
VALUES(1, '999.999.999-99', 'Wesley Snipes', '99.999.999-9',2);
INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
VALUES(2, '222.999.999-99', 'Thor Odinson', '99.999.111-9',2);
INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
VALUES(3, '999.222.999-99', 'Bruce Banner', '99.999.222-9',3);
INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
VALUES(4, '999.999.222-99', 'Scarlet Scarlate', '99.999.333-9',5);
INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
VALUES(5, '999.999.999-22', 'Bob Esponja', '99.999.444-9',5);
INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
VALUES(6, '222.222.222-22', 'Patrick Estrela', '99.999.555-9',6);
INSERT INTO t_jr_prestador(id_prestador, cpf, nome_completo, rg, id_endereco)
VALUES(7, '111.999.222-99', 'Lula Molusco', '99.999.666-9',6);

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS INCLUSAO DAS LINHAS
SELECT * FROM t_jr_prestador;


--------------------------------------------------------------------------------


--INCLUSAO DE DADOS NA TABELA T_JR_MODAL
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

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS INCLUSAO DAS LINHAS
SELECT * FROM t_jr_modal;


--------------------------------------------------------------------------------


--INCLUSAO DE DADOS NA TABELA T_JR_LOCALIZACAO
INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
VALUES(1,'Regis Bittencourt', 147,'','');
INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
VALUES(2,'Castelo Branco', 39,'','');
INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
VALUES(3,'Regis Bittencourt', 345,'','Proximo ao posto da Policia Rodoviaria');
INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
VALUES(4,'Anhanguera', 79,'','');
INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
VALUES(5,'Bandeirantes', 69,'','');
INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
VALUES(6,'Dutra', 88,'','Proximo ao pedagio');
INSERT INTO t_jr_localizacao (id_localizacao, nome_rodovia, km, cep, referencia)
VALUES(7,'Regis Bittencourt', 70,'','');

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS INCLUSAO DAS LINHAS
SELECT * FROM t_jr_localizacao;


--------------------------------------------------------------------------------


--INCLUSAO DE DADOS NA TABELA T_JR_ATENDIMENTO
INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
VALUES(1,'24/08/2000',2987,1,1,1,1);
INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
VALUES(2,'22/05/2020',40000,1,1,2,1);
INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
VALUES(3,'15/06/2023',37700,3,2,3,2);
INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
VALUES(4,'21/02/2022',8000004,3,3,3,3);
INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
VALUES(5,'30/10/2021',98789,5,5,4,3);
INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
VALUES(6,'28/02/2019',3678987,5,5,4,5);
INSERT INTO t_jr_atendimento(id_atendimento, data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal)
VALUES(7,'29/11/2020',709786,3,1,2,5);

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS INCLUSAO DAS LINHAS
SELECT * FROM t_jr_atendimento;

