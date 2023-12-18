SELECT p.nome AS 'Produto', e.quantidade AS 'Quantidade', p.preco * e.quantidade AS 'Valor Total'
FROM produto AS p
JOIN estoque AS e ON p.id = e.id_produto
ORDER BY 'Valor Total' DESC;

SELECT f.nome AS 'Filial', SUM(p.preco * e.quantidade) AS 'Valor Total por Filial'
FROM filial AS f
JOIN estoque AS e ON f.cnpj = e.cnpj_filial
JOIN produto AS p ON e.id_produto = p.id
GROUP BY f.nome
ORDER BY 'Valor Total por Filial' DESC;
