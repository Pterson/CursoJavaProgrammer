CREATE TABLE tabela_convidado(
CPF varchar(15),
NOME varchar(100),
ENDERECO varchar (100),
PROFISSAO varchar (50),
EMAIL varchar(80),
CONVITE varchar(10)
);



DROP TABLE tabela_usuarios;

CREATE TABLE tabela_log( escrita_Log varchar(200) );

SELECT * FROM tabela_convidado;

SELECT cpf, nome, endereco, profissao, email, convite FROM tabela_convidado ORDER BY convite ASC;

SELECT * FROM tabela_log;
ALTER TABLE tabela_log RENAME COLUMN escrita_Log TO ESCRITA_LOG;
INSERT INTO tabela_log (escrita_Log) VALUES ("INICIANDO");

INSERT INTO tabela_convidado (nome, endereco, profissao, convite) VALUES ("John", "Rua Wyzo", "Dev Junior", "002");

DELETE FROM tabela_convidado WHERE convite = "008";

UPDATE tabela_convidado SET cpf = '016' WHERE nome = 'Matheus';

ALTER TABLE tabela_convidado RENAME COLUMN nome TO NOME, RENAME COLUMN endereco TO ENDERECO, RENAME COLUMN PROFISSAO TO PROFISSAO, RENAME COLUMN CONVITE TO CONVITE;  

INSERT INTO tabela_convidado (cpf, nome, endereco, profissao, email, convite)
VALUES 
("19300393014", "Ana Silva", "Rua dos Jasmim", "Médico(a)", "ana.silva@gmail.com", "004"),
("40147086086", "Lucas Santos", "Avenida das Acácias", "Engenheiro(a)", "lucass@gmail.com", "005"),
("67421540040", "Maria Oliveira", "Travessa das Rosas", "Professor(a)", "maria.oliveira@gmail.com", "006"),
("51715821068", "Pedro Costa", "Rua dos Ipês", "Advogado(a)", "pcosta@gmail.com", "007"),
("04717483073", "Sofia Rodrigues", "Praça das Magnólias", "Arquiteto(a)", "sofiaro@outlook.com", "008"),
("94619737054", "João Almeida", "Avenida das Palmeiras", "Designer", "jalmeida@outlook.com", "009"),
("82161431099", "Carolina Pereira", "Rua das Violetas", "Contador(a)", "carolinap@outlook.com", "010" ),
("16217957051", "Gabriel Martins", "Alameda dos Lírios", "Enfermeiro(a)", "martinsg@outlook.com", "011"),
("81435371020", "Laura Ferreira", "Travessa das Orquídeas", "Jornalista", "laura@outlook.com", "012"), 
("91728552079", "Matheus Sousa","Rua dos Girassóis", "Programador(a)", "sousam@outlook.com", "013");


/******************************DB USUARIOS****************************/

USE db_usuarios;
SELECT * FROM tabela_usuarios;
CREATE TABLE tabela_usuarios(
MATRICULA varchar(15),
NOME varchar(100),
ENDERECO varchar (100),
TIPO_USUARIO varchar (50),
SENHA varchar(100)
);

INSERT INTO tabela_usuarios (matricula, nome, endereco, tipo_usuario, senha)
VALUES 
("0000", "Peterson", "Rua Diamantes", "ADM", "0007");



/******************************COMANDOS DE CONFIGURAÇÃO****************************/

SET SQL_SAFE_UPDATES = 0; /* desabilitar o safe mode*/













