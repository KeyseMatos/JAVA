DROP DATABASE PRODUTORA;

CREATE DATABASE IF NOT EXISTS PRODUTORA;

USE PRODUTORA;

CREATE TABLE DJs (
id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome VARCHAR(100),
estilo VARCHAR(50),
idade INT
);

INSERT INTO DJs (nome, estilo, idade) VALUES ("DJ Wesley Gonzaga", "Eletro Funk", 25);
INSERT INTO DJs (nome, estilo, idade) VALUE ("DJ Arana", "Funk", 22);
INSERT INTO DJs (nome, estilo, idade) VALUE ("DJ Adriane", "EletroFunk", 20);

SHOW TABLES;
DESCRIBE DJs;
SELECT * FROM DJs;
