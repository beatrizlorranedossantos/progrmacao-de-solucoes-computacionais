INSERT INTO fornecedor(nome, telefone, endereco) VALUES
('Novo Fornecedor 1', '+55 (11) 9 8765-4321', 'Rua Nova, 123'),
('Novo Fornecedor 2', '+55 (21) 9 9876-5432', 'Avenida Moderna, 456');

INSERT INTO produto(id_fornecedor, nome, preco, validade) VALUES
(4, 'Cereal', 7.99, '2023-11-30'),
(5, 'Shampoo', 15.50, '2024-02-15'),
(6, 'Sapato', 120.00, '2025-06-10');

INSERT INTO identificacao(id, nome, descricao) VALUES
(10, 'cereais matinais', 'rico em fibras'),
(11, 'hidratante', 'para cabelos secos'),
(12, 'social', 'couro sintético');



SELECT f.nome AS 'Fornecedor', SUM(p.preco) AS 'Soma dos Produtos'
FROM fornecedor AS f
JOIN produto AS p ON f.id = p.id_fornecedor
GROUP BY f.nome
HAVING SUM(p.preco) > 500.00;
