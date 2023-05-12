CREATE TABLE tabela_convidado(
nome varchar(50),
endereco varchar (100),
profissao varchar (50),
convite varchar(20)
);

SELECT * FROM tabela_convidado;

INSERT INTO tabela_convidado (nome, endereco, profissao, convite) VALUES ("John", "Rua Wyzo", "Dev Junior", "002");

DELETE FROM tabela_convidado WHERE convite = "0009";

UPDATE tabela_convidado SET nome = 'Cabral' WHERE convite = 008;

SET SQL_SAFE_UPDATES = 0; /* desabilitar o safe mode*/

ALTER TABLE tabela_convidado RENAME COLUMN nome TO NOME, RENAME COLUMN endereco TO ENDERECO, RENAME COLUMN PROFISSAO TO PROFISSAO, RENAME COLUMN CONVITE TO CONVITE;  