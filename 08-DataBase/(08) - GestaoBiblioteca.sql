DROP DATABASE GestaoBiblioteca;

CREATE DATABASE GestaoBiblioteca;

USE GestaoBiblioteca;

CREATE TABLE Livros(
id_livro INT PRIMARY KEY AUTO_INCREMENT,
titulo VARCHAR(100) NOT NULL,
autor VARCHAR(100) NOT NULL
);

CREATE TABLE Leitores(
id_leitor INT PRIMARY KEY AUTO_INCREMENT,
nome VARCHAR(100) NOT NULL,
email VARCHAR(100) UNIQUE NOT NULL
);

CREATE TABLE Emprestimo(
id_emprestimo INT PRIMARY KEY AUTO_INCREMENT,
id_livro INT, 
FOREIGN KEY (id_livro) REFERENCES Livros(id_livro),
id_leitor INT,
FOREIGN KEY (id_leitor) REFERENCES Leitores(id_leitor),
data_emprestimo DATE NOT NULL,
data_prevista DATE NOT NULL,
data_devolucao DATE
);

INSERT INTO Livros(titulo, autor)
VALUES(
	("Pequeno Príncipe", "Machado de Assis"),
	("Harry Potter", "Aline Barros"),
	("Branca de Neve", "Dom Quixote")
);

INSERT INTO Leitores(nome, email)
VALUES(
	("Keyse Matos", "Keyse@senai"),
	("John Robert", "John@senai"),
	("Eduarda Lima", "Eduarda@senai")
);

INSERT INTO Emprestimo(id_livro, id_leito, data_emprestimo, data_prevista, data_devolucao)
VALUES(
	(1 , 1, '2026-10-04', '2026-10-05', '2026-10-05'),
	(2 , 2, '2026-10-01', '2026-10-03', NULL)
);
/**/  
SELECT 
	Leitores.nome,
    Livros.titulo,
    Emprestimo.data_emprestimo
FROM Emprestimo
INNER JOIN Leitores
	ON Emprestimo.id_leitor = Leitores.id_leitor
INNER JOIN Livros
	ON Emprestimo.id_livro = Livros.id_livro;
/**/      
SELECT 
	Leitores.nome,
    Livros.titulo
FROM Leitores
LEFT JOIN Emprestimo
	ON Leitores.id_leito = Emprestimo.id_leitor
LEFT JOIN Livros
	ON Emprestimo.id_livro = Livros.id_livro;
/**/   
SELECT
    Leitores.nome,
    Livros.titulo,
    Emprestimo.data_prevista
FROM Emprestimo

INNER JOIN Leitores
    ON Emprestimo.id_leitor = Leitores.id_leitor

INNER JOIN Livros
    ON Emprestimo.id_livro = Livros.id_livro

WHERE Emprestimo.data_devolucao IS NULL;
