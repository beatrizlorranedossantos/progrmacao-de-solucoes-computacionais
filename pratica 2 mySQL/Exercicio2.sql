CREATE DATABASE oficina;

USE oficina;

CREATE TABLE cliente (
    CPF VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE,
    telefone VARCHAR(15),
    endereco VARCHAR(255)
);

CREATE TABLE veiculo (
    chassi VARCHAR(17) PRIMARY KEY,
    placa VARCHAR(8) UNIQUE,
    modelo VARCHAR(100),
    marca VARCHAR(100),
    ano INT
);

CREATE TABLE mecanico (
    CPF VARCHAR(11) PRIMARY KEY,
    nome VARCHAR(100),
    data_nascimento DATE,
    telefone VARCHAR(15),
    endereco VARCHAR(255),
    salario DECIMAL(10,2)
);


INSERT INTO cliente (CPF, nome, data_nascimento, telefone, endereco)
VALUES ('12345678901', 'Cliente Teste', '1995-01-15', '(11) 98765-4321', 'Rua Principal, 456');
SELECT * FROM cliente;
UPDATE cliente SET telefone = '(11) 99999-9999' WHERE CPF = '12345678901';
DELETE FROM cliente WHERE CPF = '12345678901';



INSERT INTO veiculo (chassi, placa, modelo, marca, ano)
VALUES ('ABC123456DEF78901', 'XYZ1234', 'Sedan', 'Ford', 2020);
SELECT * FROM veiculo;
UPDATE veiculo SET ano = 2021 WHERE chassi = 'ABC123456DEF78901';
DELETE FROM veiculo WHERE chassi = 'ABC123456DEF78901';



INSERT INTO mecanico (CPF, nome, data_nascimento, telefone, endereco, salario)
VALUES ('98765432109', 'Mecânico Teste', '1980-05-20', '(11) 98765-4321', 'Rua da Oficina, 789', 3000.00);
SELECT * FROM mecanico;
UPDATE mecanico SET salario = 3200.00 WHERE CPF = '98765432109';
DELETE FROM mecanico WHERE CPF = '98765432109';
