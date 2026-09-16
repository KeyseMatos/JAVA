DROP DATABASE LOJABRINQUEDO;
CREATE DATABASE IF NOT EXISTS LOJABRINQUEDO;
USE LOJABRINQUEDO;

CREATE TABLE brinquedos(
id INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
categoria VARCHAR(50) NOT NULL,
preco DECIMAL (10,2) CHECK(preco > 0),
quantidade_estoque INT
);

INSERT INTO brinquedos(nome, categoria, preco, quantidade_estoque)
VALUES
	("Carrinho de Controle Remoto", "Veículos", 150.00, 10),
    ("Boneca Articulada", "Bonecos", 80.00, 15),
	("Quebra-Cabeça 1000 Peças", "Jogos", 45.00, 20),
	("Jogo de Tabuleiro Estratégia", "Jogos", 120.00, 8),
	("Urso de Pelúcia Gigante", "Pelúcias", 200.00, 5);
    
SELECT categoria, COUNT(*) FROM brinquedos GROUP BY categoria;
SELECT SUM(preco) FROM brinquedos;
SELECT AVG(preco) FROM brinquedos;
SELECT MAX(preco) FROM brinquedos;
SELECT MIN(preco) FROM brinquedos;
SELECT COUNT(*) FROM brinquedos WHERE categoria = "Jogos";
