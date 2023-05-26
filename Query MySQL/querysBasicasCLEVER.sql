CREATE TABLE tb_usuario(
	matricula VARCHAR(50),
    nome VARCHAR(50),
    email VARCHAR(50),
    tipo_usuario VARCHAR(50),
    senha VARCHAR(6)
);

SELECT * FROM tb_usuario;

insert into tb_usuario (matricula, nome, email, tipo_usuario, senha) values ("IMP-2", "JOHN", "JOHN@GMAILCOM", "ADM", "123");

UPDATE tb_usuario
SET nome = 'PETERSON', email = 'PETERSON@GMAIL.COM', tipo_usuario = 'ADM', senha = '123'
WHERE matricula = 'IMP-1';


SET SQL_SAFE_UPDATES = 0; /* desabilitar o safe mode*/