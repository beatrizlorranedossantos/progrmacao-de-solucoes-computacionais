INSERT INTO produto(id_fornecedor, nome, preco, validade) VALUES
(1, 'arroz', 16.57, '2023-12-17'), (3, 'detergente', 3.97, '2037-08-23'), (2, 'calça', 184.91, '2045-01-27'),
(3, 'desinfetante', 8.60, '2036-02-14'), (2, 'camisa', 48.99, '2043-04-03'), (1, 'feijão', 12.31, '2023-09-11'),
(2, 'vestido', 89.99, '2041-05-16'), (1, 'leite', 4.28, '2023-10-03'), (3, 'sabão', 1.85, '2035-03-05');

INSERT INTO estoque(id_produto, cnpj_filial, quantidade) VALUES
(10, '01.678.277/0109-87', 10), (11, '02.876.722/0202-55', 20), (12, '03.987.311/0302-45', 30),
(1, '01.678.277/0109-87', 40), (2, '02.876.722/0202-55', 50), (3, '03.987.311/0302-45', 60),
(4, '01.678.277/0109-87', 70), (5, '02.876.722/0202-55', 80), (6, '03.987.311/0302-45', 90);

INSERT INTO filial VALUES
('04.123.456/0404-11', 'Nova Filial', '+55 (31) 9 5555-5555', 'Rua Nova, 1234');


SELECT f.nome AS 'Filial', SUM(p.preco * e.quantidade) AS 'Soma dos Produtos em Estoque'
FROM filial AS f
JOIN estoque AS e ON f.cnpj = e.cnpj_filial
JOIN produto AS p ON e.id_produto = p.id
GROUP BY f.nome
HAVING SUM(p.preco * e.quantidade) > 10000.00
