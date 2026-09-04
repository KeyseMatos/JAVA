DROP DATABASE db_livraria;

CREATE DATABASE IF NOT EXISTS db_livraria;

USE db_livraria;

/*PARTE 01 - Criação da Tabela autor: - Definição de Dados (DDL)*/

CREATE TABLE Autor(
    id_autor INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    nacionalidade VARCHAR(50),
    data_nascimento DATE
);

/*PARTE 02 - Criação da Tabela editora:*/

CREATE TABLE Editora(
    id_editora INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    endereco VARCHAR(200),
    telefone VARCHAR(20)
);

/*PARTE 03 - Criação da Tabela livro (com Chaves Estrangeiras):*/

CREATE TABLE Livro(
    id_livro INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(200) NOT NULL,
    ano_publicacao YEAR,
    id_editora INT,
    id_autor INT,
    FOREIGN KEY (id_editora) REFERENCES Editora(id_editora),
    FOREIGN KEY (id_autor) REFERENCES Autor(id_autor)
);

/*PARTE 04 - Alteração de Estrutura (ALTER TABLE):*/

ALTER TABLE Editora
MODIFY telefone VARCHAR(30);

ALTER TABLE Editora
ADD email VARCHAR(100);

/*PARTE 05 - Comando de Exclusão Comercial (DROP TABLE):*/

/*DROP TABLE Livro;*/

/* PARTE 06 - Inserção Múltipla (INSERT INTO): - Manipulação de Dados (DML)*/

INSERT INTO Autor(nome, nacionalidade, data_nascimento)
VALUES
    ("Ana Clara", "Brasileira", "2026-08-09"),
    ("Lucas Andrade", "Canadense", "2026-06-18"),
    ("Josh William", "Americano", "2026-03-21");

INSERT INTO Editora(nome, endereco, telefone)
VALUES
    ("Maria", "Rua da Paz", "(71)987462534"),
    ("Alessandra", "Rua da Palha", "(71)989128394");

/* PARTE 07 - Inserção com Relacionamento (INSERT INTO):*/

INSERT INTO Livro(titulo, ano_publicacao, id_editora, id_autor)
VALUES
    ("Pequeno Príncipe", 1990, 1, 1),
    ("Alice no País das Maravilhas", 2001, 2, 2);

/*Parte 08 - Atualização de Dados (UPDATE):*/

UPDATE Autor 
SET nacionalidade = "Brasil"
WHERE id_autor = 1;

UPDATE Editora
SET telefone = "(71)983166714"
WHERE id_editora = 1;

/*Parte 09 - Remoção de Dados (DELETE):*/

DELETE FROM Livro
WHERE id_editora = 2;

/*ATENÇÃO: Nunca execute um comando DELETE ou UPDATE sem o WHERE! 
Pois afeta todos os registros da tabela de uma só vez.*/

/*Parte 10 - Consulta de Dados (DQL) - Consultas Simples (SELECT)*/

SELECT * FROM Autor;
SELECT titulo, ano_publicacao FROM Livro;
