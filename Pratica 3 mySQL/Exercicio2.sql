CREATE TABLE departamento (
    id_departamento INT PRIMARY KEY,
    nome_departamento VARCHAR(100),
    descricao_departamento TEXT
);

CREATE TABLE gerente (
    id_gerente INT PRIMARY KEY,
    nome_gerente VARCHAR(100),
    salario DOUBLE,
    id_departamento INT,
    FOREIGN KEY (id_departamento) REFERENCES departamento(id_departamento)
);


INSERT INTO departamento (id_departamento, nome_departamento, descricao_departamento)
VALUES (1, 'Vendas', 'Setor responsável por vendas de produtos');

INSERT INTO gerente (id_gerente, nome_gerente, salario, id_departamento)
VALUES (101, 'João Silva', 5000.00, 1);


SELECT d.nome_departamento, g.nome_gerente, g.salario
FROM departamento AS d
JOIN gerente AS g ON d.id_departamento = g.id_departamento
ORDER BY d.nome_departamento;



SELECT d.nome_departamento, AVG(g.salario) AS media_salarial
FROM departamento AS d
JOIN gerente AS g ON d.id_departamento = g.id_departamento
GROUP BY d.nome_departamento
HAVING media_salarial > 4000;
INSERT INTO produto (nome, preco, validade) VALUES ('whisky', 150.00, '2025-01-15');
INSERT INTO identificacao (id, nome, descricao) VALUES (13, 'single malt', '12 anos');
