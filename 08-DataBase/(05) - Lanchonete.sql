DROP DATABASE LANCHONETE;

CREATE DATABASE IF NOT EXISTS LANCHONETE;

USE LANCHONETE;

CREATE TABLE Cliente(
id_cliente INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100),
email VARCHAR(100),
cpf BIGINT
);
CREATE TABLE Pedido(
id_pedido INT PRIMARY KEY AUTO_INCREMENT,
id_cliente INT,
data_pedido DATE,
valor_total DECIMAL(10,2),
FOREIGN KEY(id_cliente) REFERENCES Cliente(id_cliente)
);
CREATE TABLE Anoptacao_pedido(
id_anotacao INT PRIMARY KEY AUTO_INCREMENT,
id_pedido INT,
data_anotacao DATE,
texto VARCHAR(100),
FOREIGN KEY(id_pedido) REFERENCES Pedido(id_pedido)
);

INSERT INTO Cliente(nome, email, cpf)
VALUE
	("Keyse Matos", "Keyse@gmail.com", "123456"),
    ("Jhon Robert", "Jhon@gmail.com", "987456"),
    ("Eduarda Silva", "Eduarda@gmail.com", "126456");
    
INSERT INTO Pedido(id_cliente, data_pedido, valor_total)
VALUE
	(1, "2026-08-09", 123),
    (2, "2026-08-19", 98),
    (2, "2026-08-22", 45);

SELECT * FROM Cliente;
SELECT * FROM Pedido;

SELECT Cliente.nome, Pedido.data_pedido, Pedido.valor_total
FROM Cliente
INNER JOIN Pedido ON Cliente.id_cliente = Pedido.id_cliente;

SELECT Cliente.nome, Pedido.data_pedido, Pedido.valor_total
FROM Cliente
LEFT JOIN Pedido ON Cliente.id_cliente = Pedido.id_cliente;

SELECT Cliente.nome, Pedido.data_pedido, Pedido.valor_total
FROM Cliente
RIGHT JOIN Pedido ON Cliente.id_cliente = Pedido.id_cliente;
