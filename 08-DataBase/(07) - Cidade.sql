DROP DATABASE IF EXISTS BASE;

CREATE DATABASE BASE;

USE BASE;

/*TABELAS*/

CREATE TABLE Estado(
    codigo INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    sigla VARCHAR(2) NOT NULL
);

CREATE TABLE Cidade(
    codigo INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    estado_codigo INT,
    FOREIGN KEY (estado_codigo) REFERENCES Estado(codigo)
);

CREATE TABLE Endereco(
    codigo INT PRIMARY KEY AUTO_INCREMENT,
    numero INT,
    bairro VARCHAR(50),
    rua VARCHAR(50),
    cidade_codigo INT,
    FOREIGN KEY (cidade_codigo) REFERENCES Cidade(codigo)
);

CREATE TABLE Cliente(
    codigo INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    cpf VARCHAR(11),
    data_nascimento DATE,
    sexo VARCHAR(50),
    email VARCHAR(50),
    endereco_codigo INT,
    FOREIGN KEY (endereco_codigo) REFERENCES Endereco(codigo)
);

CREATE TABLE Pais(
    codigo INT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50),
    continente VARCHAR(50)
);


/*INSERIR DADOS*/

INSERT INTO Estado(nome, sigla)
VALUES ("Bahia", "BA");

INSERT INTO Cidade(nome, estado_codigo)
VALUES ("Camaçari", 1);

INSERT INTO Endereco(numero, bairro, rua, cidade_codigo)
VALUES (7, "Piaçaveira", "Graciliano Ramos", 1);

INSERT INTO Cliente(
    nome,
    cpf,
    data_nascimento,
    sexo,
    email,
    endereco_codigo
)
VALUES (
    "Keyse",
    "00000000000",
    "2005-05-05",
    "Fem",
    "Keyse@gmail",
    1
);

INSERT INTO Pais(nome, continente)
VALUES ("Brasil", "Americano");


INSERT INTO Estado(nome, sigla)
VALUES ("Sergipe", "SE");

INSERT INTO Cidade(nome, estado_codigo)
VALUES ("Monte Alegre", 2);

INSERT INTO Endereco(numero, bairro, rua, cidade_codigo)
VALUES (9, "Alladin", "Arvores", 2);

INSERT INTO Cliente(
    nome,
    cpf,
    data_nascimento,
    sexo,
    email,
    endereco_codigo
)
VALUES (
    "John",
    "11111111111",
    "2004-05-05",
    "Mas",
    "John@gmail",
    2
);

INSERT INTO Pais(nome, continente)
VALUES ("França", "Europeu");


/*ALTER TABLE*/

ALTER TABLE Estado
ADD regiao VARCHAR(50);


/*INNER JOIN*/

SELECT
    Cliente.nome AS cliente,
    Cliente.cpf,
    Cidade.nome AS cidade,
    Estado.nome AS estado,
    Estado.sigla,
    Endereco.rua,
    Endereco.numero,
    Endereco.bairro

FROM Cliente

INNER JOIN Endereco
    ON Cliente.endereco_codigo = Endereco.codigo

INNER JOIN Cidade
    ON Endereco.cidade_codigo = Cidade.codigo

INNER JOIN Estado
    ON Cidade.estado_codigo = Estado.codigo;


/*EXIBIR TABELAS*/

SELECT * FROM Estado;
SELECT * FROM Cidade;
SELECT * FROM Endereco;
SELECT * FROM Cliente;
SELECT * FROM Pais;
