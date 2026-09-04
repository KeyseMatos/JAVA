DROP DATABASE BASE;

CREATE DATABASE IF NOT EXISTS BASE;

USE BASE;

CREATE TABLE Clientes(
id_clientes INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100),
email VARCHAR(100),
cpf INT
);
 CREATE TABLE Pedidos(
id_pedidos INT PRIMARY KEY AUTO_INCREMENT,
id_clientes INT,
FOREIGN KEY (id_clientes) REFERENCES Clientes(id_clientes),
data_pedido DATE,
valor_total DECIMAL
);

ALTER TABLE Clientes
ADD telefone VARCHAR(20);

/*DROP TABLE Pedidos;*/

INSERT INTO Clientes (nome, email, cpf, telefone) 
VALUES
	("Jose", "jose.gmail.com", 1287, "(71)9873564273"),
    ("Carla", "carla.gmail.com", 1234, "(71)938757293"),
    ("Perla", "perla.gmail.com", 1234, "(71)933894723");
    
INSERT INTO Pedidos(id_clientes, data_pedido, valor_total)
VALUES
	(2, '2025-08-12', 120);
    
UPDATE Clientes SET nome = "Lucas", email = "lucas@gmail.com" WHERE id_clientes = 3;

DELETE FROM Clientes
WHERE telefone IS NULL;

DELETE FROM Pedidos
WHERE id_clientes = 1;

/*DROP TABLE Clientes;
DROP TABLE Pedidos;*/

SHOW TABLES;
DESCRIBE Clientes;
DESCRIBE Pedidos;



    



	

