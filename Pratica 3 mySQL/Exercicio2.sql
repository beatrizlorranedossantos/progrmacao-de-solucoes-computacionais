SELECT p.id, p.nome, i.descricao, p.preco
FROM produto AS p
JOIN identificacao AS i ON p.id = i.id
ORDER BY p.preco DESC;


SELECT p.id, p.nome, i.descricao, p.preco
FROM produto AS p
JOIN identificacao AS i ON p.id = i.id
ORDER BY p.nome ASC, p.preco DESC;


INSERT INTO produto (nome, preco, validade) VALUES ('azeite', 18.99, '2023-08-12');
INSERT INTO identificacao (id, nome, descricao) VALUES (10, 'extra virgem', 'prensado a frio');


INSERT INTO produto (nome, preco, validade) VALUES ('vinho', 85.50, '2024-03-20');
INSERT INTO identificacao (id, nome, descricao) VALUES (11, 'tinto', 'safra 2022');


INSERT INTO produto (nome, preco, validade) VALUES ('chocolate', 12.75, '2023-11-05');
INSERT INTO identificacao (id, nome, descricao) VALUES (12, 'ao leite', '250g');


INSERT INTO produto (nome, preco, validade) VALUES ('whisky', 150.00, '2025-01-15');
INSERT INTO identificacao (id, nome, descricao) VALUES (13, 'single malt', '12 anos');
