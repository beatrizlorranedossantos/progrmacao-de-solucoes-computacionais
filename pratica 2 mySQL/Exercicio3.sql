CREATE DATABASE corretora;

USE corretora;

CREATE TABLE ativo (
    codigo INT PRIMARY KEY,
    nome VARCHAR(100),
    descricao TEXT,
    emissor VARCHAR(100),
    data_inicio DATE,
    data_fim DATE
);

CREATE TABLE cliente (
    CPF VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE,
    agencia VARCHAR(20),
    conta VARCHAR(20),
    telefone VARCHAR(15),
    endereco VARCHAR(255),
    perfil VARCHAR(20)
);

CREATE TABLE nota_corretagem (
    id INT PRIMARY KEY,
    data_compra DATE,
    codigo_ativo INT,
    quantidade INT,
    cotacao DECIMAL(10,2),
    valor_compra DECIMAL(10,2),
    CPF_cliente VARCHAR(11),
    FOREIGN KEY (codigo_ativo) REFERENCES ativo(codigo),
    FOREIGN KEY (CPF_cliente) REFERENCES cliente(CPF)
);


INSERT INTO ativo (codigo, nome, descricao, emissor, data_inicio, data_fim)
VALUES (1, 'Ação ABC', 'Ação de uma empresa', 'Empresa XYZ', '2020-01-01', NULL);

INSERT INTO cliente (CPF, nome, data_nascimento, agencia, conta, telefone, endereco, perfil)
VALUES ('12345678901', 'Cliente Teste', '1985-03-15', '001', '12345-6', '(11) 98765-4321', 'Rua Principal, 789', 'Moderado');

INSERT INTO nota_corretagem (id, data_compra, codigo_ativo, quantidade, cotacao, valor_compra, CPF_cliente)
VALUES (1, '2023-01-15', 1, 10, 50.00, 500.00, '12345678901');


SELECT * FROM ativo;
SELECT * FROM cliente;
SELECT * FROM nota_corretagem;


UPDATE ativo SET descricao = 'Nova descrição' WHERE codigo = 1;
UPDATE cliente SET telefone = '(11) 99999-9999' WHERE CPF = '12345678901';
UPDATE nota_corretagem SET quantidade = 15 WHERE id = 1;


DELETE FROM ativo WHERE codigo = 1;
DELETE FROM cliente WHERE CPF = '12345678901';
DELETE FROM nota_corretagem WHERE id = 1;
