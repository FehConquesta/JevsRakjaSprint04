INSERT INTO t_jr_fabricante(nome, modelo) VALUES('Volvo','FMX');
INSERT INTO t_jr_fabricante(nome, modelo) VALUES('SCANIA','P 420');
INSERT INTO t_jr_fabricante(nome, modelo) VALUES('Mercedes','Actros Euro6');
INSERT INTO t_jr_fabricante(nome, modelo) VALUES('Ford','Ranger');
INSERT INTO t_jr_fabricante(nome, modelo) VALUES('Scania','F 340');
INSERT INTO t_jr_fabricante(nome, modelo) VALUES('Volvo','FH');
INSERT INTO t_jr_fabricante(nome, modelo) VALUES('Mercedes','Euro10');

INSERT INTO t_jr_implemento(tipo_implemento) VALUES('Carga Seca');
INSERT INTO t_jr_implemento(tipo_implemento) VALUES('Bau');
INSERT INTO t_jr_implemento(tipo_implemento) VALUES('Cegonha');
INSERT INTO t_jr_implemento(tipo_implemento) VALUES('Graneleiro');
INSERT INTO t_jr_implemento(tipo_implemento) VALUES('Tanque');
INSERT INTO t_jr_implemento(tipo_implemento) VALUES('Refrigerado');
INSERT INTO t_jr_implemento(tipo_implemento) VALUES('Carroceria Aberta');

INSERT INTO t_jr_endereco(cep,logradouro,numero,complemento,referencia) VALUES('03268-000','Rua dos animais', 35,'','Proximo a um pe de jabuticaba');
INSERT INTO t_jr_endereco(cep,logradouro,numero,complemento,referencia) VALUES('03269-050','Rua dos bichos', 74,'','');
INSERT INTO t_jr_endereco(cep,logradouro,numero,complemento,referencia) VALUES('03268-100','Rua Ananias', 351,'','Em frente ao bar do Gordo');
INSERT INTO t_jr_endereco(cep,logradouro,numero,complemento,referencia) VALUES('03268-001','Rua Poloni', 180,'Fica na Viela','');
INSERT INTO t_jr_endereco(cep,logradouro,numero,complemento,referencia) VALUES('03277-000','Rua da Luz', 21,'','Proximo ao Mercado do amor');
INSERT INTO t_jr_endereco(cep,logradouro,numero,complemento,referencia) VALUES('03268-666','Rua Osters', 101,'Fundos','Portao amarelo');
INSERT INTO t_jr_endereco(cep,logradouro,numero,complemento,referencia) VALUES('03666-000','Rua China', 69,'Casa 2','Casa do final da rua');

INSERT INTO t_jr_cliente (cpf,nome_completo,rg,id_endereco) values ('321.365.525-29', 'Eduardo Bezerra', '32.954.589-6',2);
INSERT INTO t_jr_cliente (cpf,nome_completo,rg,id_endereco) values ('321.666.525-29', 'Jefferson Mendes', '33.333.589-3',2);
INSERT INTO t_jr_cliente (cpf,nome_completo,rg,id_endereco) values ('321.365.666-29', 'Joao Victor Benjamin', '32.222.229-2',3);
INSERT INTO t_jr_cliente (cpf,nome_completo,rg,id_endereco) values ('321.365.525-66', 'Luiz Felipe Biazzola', '31.111.589-1',5);
INSERT INTO t_jr_cliente (cpf,nome_completo,rg,id_endereco) values ('666.365.525-29', 'Silas Henrique', '32.544.111-6',6);
INSERT INTO t_jr_cliente (cpf,nome_completo,rg,id_endereco) values ('333.322.525-22', 'Osmar Olindo', '34.444.589-4',5);
INSERT INTO t_jr_cliente (cpf,nome_completo,rg,id_endereco) values ('111.365.111-29', 'Rebecca Chambers', '31.123.123-6',6);

INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('5x43',1);
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('zx99',2);
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('7987',2);
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('alp9',3);
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('8761',1);
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('pls1',5);
INSERT INTO t_jr_seguro(numero_apolice, id_cliente) values ('cat3',5);

INSERT INTO t_jr_veiculo_cliente(placa,ano,renavam, numero_apolice, portas,id_implemento,id_fabricante,id_cliente) VALUES('XPT-001',1993,080077, 'zx99',3,1,1,2);
INSERT INTO t_jr_veiculo_cliente(placa,ano,renavam, numero_apolice, portas,id_implemento,id_fabricante,id_cliente) VALUES('XPT-002',2000,080666, '7987',2,2,1,2);
INSERT INTO t_jr_veiculo_cliente(placa,ano,renavam, numero_apolice, portas,id_implemento,id_fabricante,id_cliente) VALUES('XPT-003',1970,080777, '8761',5,2,2,1);
INSERT INTO t_jr_veiculo_cliente(placa,ano,renavam, numero_apolice, portas,id_implemento,id_fabricante,id_cliente) VALUES('XPT-004',2020,088888, 'H666',3,5,2,5);
INSERT INTO t_jr_veiculo_cliente(placa,ano,renavam, numero_apolice, portas,id_implemento,id_fabricante,id_cliente) VALUES('XPT-051',2022,089999, 'alp9',2,1,3,3);
INSERT INTO t_jr_veiculo_cliente(placa,ano,renavam, numero_apolice, portas,id_implemento,id_fabricante,id_cliente) VALUES('XPT-066',2023,080099, 'pls1',2,6,5,5);
INSERT INTO t_jr_veiculo_cliente(placa,ano,renavam, numero_apolice, portas,id_implemento,id_fabricante,id_cliente) VALUES('XPT-099',1999,990077, 'cat3',4,6,5,2);

INSERT INTO t_jr_prestador( cpf, nome_completo, rg, id_endereco) values('999.999.999-99', 'Wesley Snipes', '99.999.999-9',2);
INSERT INTO t_jr_prestador( cpf, nome_completo, rg, id_endereco) values( '222.999.999-99', 'Thor Odinson', '99.999.111-9',2);
INSERT INTO t_jr_prestador( cpf, nome_completo, rg, id_endereco) values( '999.222.999-99', 'Bruce Banner', '99.999.222-9',3);
INSERT INTO t_jr_prestador( cpf, nome_completo, rg, id_endereco) values( '999.999.222-99', 'Scarlet Scarlate', '99.999.333-9',5);
INSERT INTO t_jr_prestador( cpf, nome_completo, rg, id_endereco) values( '999.999.999-22', 'Bob Esponja', '99.999.444-9',5);
INSERT INTO t_jr_prestador( cpf, nome_completo, rg, id_endereco) values( '222.222.222-22', 'Patrick Estrela', '99.999.555-9',6);
INSERT INTO t_jr_prestador( cpf, nome_completo, rg, id_endereco) values( '111.999.222-99', 'Lula Molusco', '99.999.666-9',6);

INSERT INTO t_jr_modal(modelo, placa, disponibilidade, id_prestador) VALUES('Munch','XPT-8780',1,1);
INSERT INTO t_jr_modal(modelo, placa, disponibilidade, id_prestador) VALUES('Lanca','HPB-8780',0,3);
INSERT INTO t_jr_modal(modelo, placa, disponibilidade, id_prestador) VALUES('Zero Grau','XIS-8780',0,3);
INSERT INTO t_jr_modal(modelo, placa, disponibilidade, id_prestador) VALUES('Plataforma','YES-8780',1,6);
INSERT INTO t_jr_modal(modelo, placa, disponibilidade, id_prestador) VALUES('Plataforma','NOP-8780',1,4);
INSERT INTO t_jr_modal(modelo, placa, disponibilidade, id_prestador) VALUES('Munch','AHA-8780',0,4);
INSERT INTO t_jr_modal(modelo, placa, disponibilidade, id_prestador) VALUES('Lanca','MEH-8780',1,3);

INSERT INTO t_jr_localizacao (nome_rodovia, km, cep, referencia) values('Regis Bittencourt', 147,'','');
INSERT INTO t_jr_localizacao (nome_rodovia, km, cep, referencia) values('Castelo Branco', 39,'','');
INSERT INTO t_jr_localizacao (nome_rodovia, km, cep, referencia) values('Regis Bittencourt', 345,'','Proximo ao posto da Policia Rodoviaria');
INSERT INTO t_jr_localizacao (nome_rodovia, km, cep, referencia) values('Anhanguera', 79,'','');
INSERT INTO t_jr_localizacao (nome_rodovia, km, cep, referencia) values('Bandeirantes', 69,'','');
INSERT INTO t_jr_localizacao (nome_rodovia, km, cep, referencia) values('Dutra', 88,'','Proximo ao pedagio');
INSERT INTO t_jr_localizacao (nome_rodovia, km, cep, referencia) values('Regis Bittencourt', 70,'','');

INSERT INTO t_jr_atendimento(data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal) values('24/08/2000',2987,1,1,1,1);
INSERT INTO t_jr_atendimento(data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal) values('22/05/2020',40000,1,1,2,1);
INSERT INTO t_jr_atendimento(data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal) values('15/06/2023',37700,3,2,3,2);
INSERT INTO t_jr_atendimento(data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal) values('21/02/2022',8000004,3,3,3,3);
INSERT INTO t_jr_atendimento(data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal) values('30/10/2021',98789,5,5,4,3);
INSERT INTO t_jr_atendimento(data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal) values('28/02/2019',3678987,5,5,4,5);
INSERT INTO t_jr_atendimento(data_atendimento,pbtc, id_localizacao, id_cliente, id_veiculo, id_modal) values('29/11/2020',709786,3,1,2,5);