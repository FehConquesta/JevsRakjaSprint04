--GRUPO 
--Eduardo Bezerra - RM: 98890
--Jefferson Mendes de Farias Lima - RM: 552052
--Joao Vitor Vicente Benjamin - RM: 98938
--Luiz Felipe Biazzola Cavalcante - RM: 99250
--Silas Henrique da Silva Oliveira - RM: 9896


--------------ALTERACAO DE INFORMACOES UTILIZANDO O UPDATE----------------------
--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA A TABELA ANTES DAS ALTERACOES
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


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA A TABELA ANTES DAS ALTERACOES
SELECT * FROM t_jr_implemento;

--UPDATE NA TABELA T_JR_IMPLEMENTO ALTERANDO O IMPLEMENTO COM BASE NO IMPLEMENTO
UPDATE t_jr_implemento
SET tipo_implemento = 'Congelado'
WHERE tipo_implemento = 'Refrigerado';
--UPDATE NA TABELA T_JR_IMPLEMENTO ALTERANDO O IMPLEMENTO COM BASE NO ID
UPDATE t_jr_implemento
SET tipo_implemento = 'Refrigerado'
WHERE id_implemento = '6';
--UPDATE NA TABELA T_JR_IMPLEMENTO ALTERANDO O IMPLEMENTO COM BASE NO ID
UPDATE t_jr_implemento
SET tipo_implemento = 'Granadeiro'
WHERE id_implemento = '4';

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS ALTERACOES
SELECT * FROM t_jr_implemento;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA A TABELA ANTES ALTERACOES
SELECT * FROM t_jr_endereco;

--UPDATE NA TABELA T_JR_ENDERECO ALTERANDO A REFERENCIA COM BASE NO CEP
UPDATE t_jr_endereco
SET referencia = 'Proximo a um pe de Jambo'
WHERE cep = '03268-000';
--UPDATE NA TABELA T_JR_ENDERECO ALTERANDO O LOGRADOURO COM BASE NO NUMERO
UPDATE t_jr_endereco
SET logradouro = 'Rua Chinatown'
WHERE numero = 69;
--UPDATE NA TABELA T_JR_ENDERECO ALTERANDO O CEP COM BASE NO ID
UPDATE t_jr_endereco
SET cep = '06890-000'
WHERE id_endereco = 4;

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS ALTERACOES
SELECT * FROM t_jr_endereco;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA A TABELA ANTES ALTERACOES
SELECT * FROM t_jr_cliente;

--UPDATE NA TABELA T_JR_CLIENTE ALTERANDO O NOME COM BASE NO NOME
UPDATE t_jr_cliente
SET nome_completo = 'Linda Silva'
WHERE nome_completo = 'Osmar Olindo';
--UPDATE NA TABELA T_JR_CLIENTE ALTERANDO O CPF COM BASE NO RG
UPDATE t_jr_cliente
SET cpf = '111.111.111-11'
WHERE rg = '31.123.123-6';
--UPDATE NA TABELA T_JR_CLIENTE ALTERANDO O RG COM BASE NO ID
UPDATE t_jr_cliente
SET rg = '99.999.999-9'
WHERE id_cliente = 3;

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS ALTERACOES
SELECT * FROM t_jr_cliente;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA A TABELA ANTES ALTERACOES
SELECT * FROM t_jr_seguro;

--UPDATE NA TABELA T_JR_SEGURO ALTERANDO O NUMERO DA APOLICE COM BASE NO ID
UPDATE t_jr_seguro
SET id_cliente = 3
WHERE id_cliente = 1;
--UPDATE NA TABELA T_JR_SEGURO ALTERANDO O NUMERO DA APOLICE COM BASE ID E APOLICE
UPDATE t_jr_seguro
SET id_cliente = 1
WHERE id_cliente = 5 and numero_apolice = '8761';
--UPDATE NA TABELA T_JR_SEGURO ALTERANDO O NUMERO DA APOLICE COM BASE NO ID
UPDATE t_jr_seguro
SET id_cliente = 5
WHERE id_cliente = 3;

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS ALTERACOES
SELECT * FROM t_jr_seguro;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA A TABELA ANTES ALTERACOES
SELECT * FROM t_jr_veiculo_cliente;

--UPDATE NA TABELA T_JR_VEICULO_CLIENTE ALTERANDO O ANO COM BASE NA PLACA
UPDATE t_jr_veiculo_cliente
SET ano = 1666
WHERE placa = 'XPT-066';
--UPDATE NA TABELA T_JR_VEICULO_CLIENTE ALTERANDO O RENAVAM COM BASE NO ID
UPDATE t_jr_veiculo_cliente
SET renavam = 99999
WHERE id_veiculo = 7;
--UPDATE NA TABELA T_JR_VEICULO_CLIENTE ALTERANDO A PLACA COM BASE NO NUMERO DA APOLICE
UPDATE t_jr_veiculo_cliente
SET placa = 'OTN-1993'
WHERE numero_apolice = 'alp9';

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS ALTERACOES
SELECT * FROM t_jr_veiculo_cliente;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA A TABELA ANTES ALTERACOES
SELECT * FROM t_jr_prestador;

--UPDATE NA TABELA T_JR_PRESTADOR ALTERANDO O NOME COM BASE NO CPF
UPDATE t_jr_prestador
SET nome_completo = 'Sr Serigueijo'
WHERE cpf = '111.999.222-99';
--UPDATE NA TABELA T_JR_PRESTADOR ALTERANDO O CPF COM BASE NO ID
UPDATE t_jr_prestador
SET cpf = '196.659.988-99'
WHERE id_prestador = 2;
--UPDATE NA TABELA T_JR_PRESTADOR ALTERANDO O RG COM BASE NO NOME
UPDATE t_jr_prestador
SET rg = '35.987.689-9'
WHERE nome_completo = 'Patrick Estrela';

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS ALTERACOES
SELECT * FROM t_jr_prestador;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA A TABELA ANTES ALTERACOES
SELECT * FROM t_jr_modal;

--UPDATE NA TABEL T_JR_MODAL ALTERANDO O MODELO COM BASE NA PLACA
UPDATE t_jr_modal
SET modelo = 'Zero Grau'
WHERE placa = 'NOP-8780';
--UPDATE NA TABEL T_JR_MODAL ALTERANDO O MODELO COM BASE NO ID
UPDATE t_jr_modal
SET modelo = 'Guindaste'
WHERE id_modal = 7;
--UPDATE NA TABEL T_JR_MODAL ALTERANDO A PLACA COM BASE NO MODELO
UPDATE t_jr_modal
SET placa = 'UHU-9999'
WHERE modelo = 'Guindaste';

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS ALTERACOES
SELECT * FROM t_jr_modal;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA A TABELA ANTES ALTERACOES
SELECT * FROM t_jr_localizacao;

--UPDATE NA TABELA T_JR_LOCALIZACAO ALTERANDO O NOME DA RODOVIA COM BASE NO ID
UPDATE t_jr_localizacao
SET nome_rodovia = 'Imigrantes'
WHERE id_localizacao = 1;
--UPDATE NA TABELA T_JR_LOCALIZACAO ALTERANDO O KM COM BASE NO ID
UPDATE t_jr_localizacao
SET km = 387
WHERE id_localizacao = 7;
--UPDATE NA TABELA T_JR_LOCALIZACAO ALTERANDO O NOME DA RODOVIA COM BASE NO ID
UPDATE t_jr_localizacao
SET nome_rodovia = 'Anchieta'
WHERE id_localizacao = 3;

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS ALTERACOES
SELECT * FROM t_jr_localizacao;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA A TABELA ANTES ALTERACOES
SELECT * FROM t_jr_atendimento;

--UPDATE NA TABELTA T_JR_ATENDIMENTO ALTERANDO O PBTC COM BASE NO ID
UPDATE t_jr_atendimento
SET pbtc = 9000000
WHERE id_atendimento = 1;
--UPDATE NA TABELTA T_JR_ATENDIMENTO ALTERANDO A DATA DE ATENDIMENTO COM BASE NO ID
UPDATE t_jr_atendimento
SET data_atendimento = '25/12/2002'
WHERE id_atendimento = 3;
--UPDATE NA TABELTA T_JR_ATENDIMENTO ALTERANDO O PBTC COM BASE NO ID
UPDATE t_jr_atendimento
SET pbtc = 87676567
WHERE id_atendimento = 5;

--SELECT PARA MOSTRAR COMO ESTA A TABELA APOS ALTERACOES
SELECT * FROM t_jr_atendimento;


