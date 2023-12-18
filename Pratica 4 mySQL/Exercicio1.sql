SELECT f.nome AS 'Fornecedor', SUM(p.preco) AS 'Soma dos Preços'
FROM fornecedor AS f
JOIN produto AS p ON f.id = p.id_fornecedor
GROUP BY f.nome
ORDER BY 'Soma dos Preços' DESC;


SELECT f.nome AS 'Fornecedor', AVG(p.preco) AS 'Média dos Preços'
FROM fornecedor AS f
JOIN produto AS p ON f.id = p.id_fornecedor
GROUP BY f.nome
ORDER BY 'Média dos Preços' DESC;
