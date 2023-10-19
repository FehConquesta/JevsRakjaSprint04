--GRUPO 
--Eduardo Bezerra - RM: 98890
--Jefferson Mendes de Farias Lima - RM: 552052
--Joao Vitor Vicente Benjamin - RM: 98938
--Luiz Felipe Biazzola Cavalcante - RM: 99250
--Silas Henrique da Silva Oliveira - RM: 9896


--------------EXCLUSAO DE LINHAS UTILIZANDO O DELETE----------------------
--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA AS INFORMACOES DA TABELA T_JR_FABRICANTE ANTES DO DELETE
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


--SELECT PARA MOSTRAR COMO ESTA AS INFORMACOES DA TABELA T_JR_IMPLEMENTO ANTES DO DELETE
SELECT * FROM t_jr_implemento;

--EXCLUSAO DA LINHA COM BASE NO TIPO DO IMPLEMENTO INFORMADO
DELETE FROM t_jr_implemento
WHERE tipo_implemento = 'Granadeiro';
--EXCLUSAO DA LINHA COM BASE NO TIPO DO IMPLEMENTO INFORMADO
DELETE FROM t_jr_implemento
WHERE tipo_implemento = 'Carroceria Aberta';
--EXCLUSAO DA LINHA COM BASE NO ID INFORMADO
DELETE FROM t_jr_implemento
WHERE id_implemento = 3;

--SELECT PARA MOSTRAR COMO A TABELA FICOU APOS A EXCLUSAO DE LINHAS
SELECT * FROM t_jr_implemento;

--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA AS INFORMACOES DA TABELA T_JR_ENDERECO ANTES DO DELETE
SELECT * FROM t_jr_endereco;

--EXCLUSAO DA LINHA COM BASE NA REFERENCIA INFORMADA
DELETE FROM t_jr_endereco
WHERE referencia = 'Proximo a um pe de Jambo';
--EXCLUSAO DA LINHA COM BASE NO LOGRADOURO INFORMADO
DELETE FROM t_jr_endereco
WHERE logradouro = 'Rua Poloni';
--EXCLUSAO DA LINHA COM BASE NO ID INFORMADO
DELETE FROM t_jr_endereco
WHERE id_endereco = 7;

--SELECT PARA MOSTRAR COMO A TABELA FICOU APOS A EXCLUSAO DE LINHAS
SELECT * FROM t_jr_endereco;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA AS INFORMACOES DA TABELA T_JR_CLIENTE ANTES DO DELETE
SELECT * FROM t_jr_cliente;

--EXCLUSAO DA LINHA COM BASE NO ID INFORMADO
DELETE FROM t_jr_cliente
WHERE id_cliente = 6;
--EXCLUSAO DA LINHA COM BASE NO NOME INFORMADO
DELETE FROM t_jr_cliente
WHERE nome_completo = 'Linda Silva';
--EXCLUSAO DA LINHA COM BASE NO CPF INFORMADO
DELETE FROM t_jr_cliente
WHERE cpf = '321.365.525-66';

--SELECT PARA MOSTRAR COMO A TABELA FICOU APOS A EXCLUSAO DE LINHAS
SELECT * FROM t_jr_cliente;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA AS INFORMACOES DA TABELA T_JR_SEGURO ANTES DO DELETE
SELECT * FROM t_jr_seguro;

--EXCLUSAO DA LINHA COM BASE NO NUMERO DA APOLICE INFORMADO
DELETE FROM t_jr_seguro
WHERE id_cliente = 1;
--EXCLUSAO DA LINHA COM BASE NO ID INFORMADO
DELETE FROM t_jr_seguro
WHERE id_cliente = 3;
--EXCLUSAO DA LINHA COM BASE NO NUMERO DA APOLICE INFORMADO
DELETE FROM t_jr_seguro
WHERE numero_apolice = '5x43';

--SELECT PARA MOSTRAR COMO A TABELA FICOU APOS A EXCLUSAO DE LINHAS
SELECT * FROM t_jr_seguro;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA AS INFORMACOESDA TABELA T_JR_VEICULO_CLIENTE ANTES DO DELETE
SELECT * FROM t_jr_veiculo_cliente;

--EXCLUSAO DA LINHA COM BASE NO RENAVAM INFORMADO
DELETE FROM t_jr_veiculo_cliente
WHERE renavam = 99999;
--EXCLUSAO DA LINHA COM BASE NA PLACA INFORMADA
DELETE FROM t_jr_veiculo_cliente
WHERE placa = 'OTN-1993';
--EXCLUSAO DA LINHA COM BASE NO ID INFORMADO
DELETE FROM t_jr_veiculo_cliente
WHERE id_veiculo = 6;

--SELECT PARA MOSTRAR COMO A TABELA FICOU APOS A EXCLUSAO DE LINHAS
SELECT * FROM t_jr_veiculo_cliente;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA AS INFORMACOESDA TABELA T_JR_PRESTADOR ANTES DO DELETE
SELECT * FROM t_jr_prestador;

--EXCLUSAO DA LINHA COM BASE NO NOME INFORMADO
DELETE FROM t_jr_prestador
WHERE nome_completo ='Bob Esponja';
--EXCLUSAO DA LINHA COM BASE NO CPF INFORMADO
DELETE FROM t_jr_prestador
WHERE cpf ='111.999.222-99';
--EXCLUSAO DA LINHA COM BASE NO ID INFORMADO
DELETE FROM t_jr_prestador
WHERE id_prestador ='2';

--SELECT PARA MOSTRAR COMO A TABELA FICOU APOS A EXCLUSAO DE LINHAS
SELECT * FROM t_jr_prestador;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA AS INFORMACOESDA TABELA T_JR_MODAL ANTES DO DELETE
SELECT * FROM t_jr_modal;

--EXCLUSAO DA LINHA COM BASE NO MODELO INFORMADO
DELETE FROM t_jr_modal
WHERE modelo = 'Guindaste';
--EXCLUSAO DA LINHA COM BASE NA PLACA INFORMADA
DELETE FROM t_jr_modal
WHERE placa = 'AHA-8780';
--EXCLUSAO DA LINHA COM BASE NO ID INFORMADO
DELETE FROM t_jr_modal
WHERE id_modal = 4;

--SELECT PARA MOSTRAR COMO A TABELA FICOU APOS A EXCLUSAO DE LINHAS
SELECT * FROM t_jr_modal;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA AS INFORMACOESDA TABELA T_JR_LOCALIZACAO ANTES DO DELETE
SELECT * FROM t_jr_localizacao;

--EXCLUSAO DA LINHA COM BASE NA REFERENCIA INFORMADA
DELETE FROM t_jr_localizacao
WHERE referencia = 'Proximo ao pedagio';
--EXCLUSAO DA LINHA COM BASE NO ID INFORMADO
DELETE FROM t_jr_localizacao
WHERE id_localizacao = 7;
--EXCLUSAO DA LINHA COM BASE NO NOME DA RODOVIA INFORMADO
DELETE FROM t_jr_localizacao
WHERE nome_rodovia = 'Castelo Branco';

--SELECT PARA MOSTRAR COMO A TABELA FICOU APOS A EXCLUSAO DE LINHAS
SELECT * FROM t_jr_localizacao;


--------------------------------------------------------------------------------


--SELECT PARA MOSTRAR COMO ESTA AS INFORMACOESDA TABELA T_JR_ATENDIMENTO ANTES DO DELETE
SELECT * FROM t_jr_atendimento;

--EXCLUSAO DA LINHA COM BASE NO PBTC INFORMADO
DELETE FROM t_jr_atendimento
WHERE pbtc = 87676567;
--EXCLUSAO DA LINHA COM BASE NO ID INFORMADO
DELETE FROM t_jr_atendimento
WHERE id_atendimento = 3;
--EXCLUSAO DA LINHA COM BASE NO ID INFORMADO
DELETE FROM t_jr_atendimento
WHERE id_atendimento = 4;

--SELECT PARA MOSTRAR COMO A TABELA FICOU APOS A EXCLUSAO DE LINHAS
SELECT * FROM t_jr_atendimento;


