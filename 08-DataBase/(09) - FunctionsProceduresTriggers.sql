DROP DATABASE IF EXISTS locadora;
CREATE DATABASE locadora;
USE locadora;

//PRÁTICA 01=============================================================================================================

CREATE TABLE equipamentos (
    id INT, 
    nome VARCHAR(50),
    valor_diaria DECIMAL(10,2)
);

DELIMITER $$
CREATE FUNCTION fn_calcular_locacao(
    diaria DECIMAL(10,2),
    dias INT
)
RETURNS DECIMAL(10,2)
DETERMINISTIC
BEGIN
    IF dias > 5 THEN
        RETURN diaria * dias * 0.85; -- Aplica desconto de 15% para locações acima de 5 dias
    ELSE
        RETURN diaria * dias;
    END IF;

END$$
DELIMITER ;

INSERT INTO equipamentos (id, nome, valor_diaria) VALUES
(1, 'Equipamento 1', 100.00),
(2, 'Equipamento 2', 150.00),
(3, 'Equipamento 3', 200.00);

SELECT
 id,
 nome,
 valor_diaria,
 fn_calcular_locacao(valor_diaria, 7) AS total_locacao
 FROM equipamentos;

//PRÁTICA 02============================================================================================================

ALTER TABLE equipamentos
ADD disponivel CHAR(1) DEFAULT 'S';

DELIMITER $$
CREATE PROCEDURE sp_realizar_emprestimo(
    IN p_id INT
)
BEGIN
    UPDATE equipamentos
    SET disponivel = 'N'
    WHERE id = p_id;
END$$
DELIMITER ;

CALL sp_realizar_emprestimo(1);

//PRÁTICA 03=============================================================================================================

CREATE TABLE historico_status (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_equip INT,
    anterior CHAR(1),
    novo CHAR(1),
    data_hora DATETIME
);

DELIMITER $$
CREATE TRIGGER tr_atualizar_status
AFTER UPDATE ON equipamentos
FOR EACH ROW
BEGIN
    IF OLD.disponivel <> NEW.disponivel THEN
        INSERT INTO historico_status (id_equip, anterior, novo, data_hora)
        VALUES (OLD.id, OLD.disponivel, NEW.disponivel, NOW());
    END IF;
END$$
DELIMITER ;

CALL sp_realizar_emprestimo(1);
SELECT * FROM historico_status;
