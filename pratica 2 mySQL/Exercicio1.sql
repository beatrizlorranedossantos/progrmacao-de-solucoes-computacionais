
USE escola;

CREATE TABLE aluno (
    matricula INT PRIMARY KEY,
    CPF VARCHAR(11) UNIQUE,
    nome VARCHAR(100),
    data_nascimento DATE,
    telefone VARCHAR(15),
    endereco VARCHAR(255)
);

CREATE TABLE curso (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    descricao TEXT,
    valor_mensalidade DECIMAL(10,2),
    data_criacao DATE
);

CREATE TABLE unidade_curricular (
    id INT PRIMARY KEY,
    nome VARCHAR(100),
    descricao TEXT,
    data_inicio DATE,
    data_termino DATE,
    carga_horaria INT
);


INSERT INTO aluno (matricula, CPF, nome, data_nascimento, telefone, endereco)
VALUES (1, '12345678901', 'Gabriel', '1990-01-01', '(11) 11111-1111', 'Rua Principal, 123');
SELECT * FROM aluno;
UPDATE aluno SET telefone = '(11) 99999-9999' WHERE matricula = 1;
DELETE FROM aluno WHERE matricula = 1;

INSERT INTO curso (id, nome, descricao, valor_mensalidade, data_criacao)
VALUES (1, 'Ciência da Computação', 'Bacharelado em Ciência da Computação', 1500.00, '2023-01-01');
SELECT * FROM curso;
UPDATE curso SET valor_mensalidade = 1600.00 WHERE id = 1;
DELETE FROM curso WHERE id = 1;


INSERT INTO unidade_curricular (id, nome, descricao, data_inicio, data_termino, carga_horaria)
VALUES (1, 'Programação I', 'Introdução à programação em C', '2023-02-01', '2023-05-01', 60);
SELECT * FROM unidade_curricular;
UPDATE unidade_curricular SET carga_horaria = 80 WHERE id = 1;
DELETE FROM unidade_curricular WHERE id = 1;
