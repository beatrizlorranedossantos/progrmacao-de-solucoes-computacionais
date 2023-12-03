class Pessoa:
    def __init__(self, nome):
        self.__nome = nome

    def setNome(self, nome):
        self.__nome = nome

    def getNome(self):
        return self.__nome


class PessoaFisica(Pessoa):
    def __init__(self, nome, cpf):
        super().__init__(nome)
        self.__cpf = cpf

    def setCPF(self, cpf):
        self.__cpf = cpf

    def getCPF(self):
        return self.__cpf

    def __str__(self):
        return f'Nome: {self.getNome()}, CPF: {self.getCPF()}'


class PessoaJuridica(Pessoa):
    def __init__(self, nome, cnpj):
        super().__init__(nome)
        self.__cnpj = cnpj

    def setCNPJ(self, cnpj):
        self.__cnpj = cnpj

    def getCNPJ(self):
        return self.__cnpj

    def __str__(self):
        return f'Nome: {self.getNome()}, CNPJ: {self.getCNPJ()}'


class Cadastro:
    def __init__(self):
        self.__pessoas = []

    def cadastrarPessoa(self, pessoa):
        self.__pessoas.append(pessoa)

    def imprimirCadastro(self):
        for pessoa in self.__pessoas:
            print(pessoa)

  

cadastro = Cadastro()

nome_pf = input("Informe o nome da pessoa física: ")
cpf = input("Informe o CPF da pessoa física: ")
pessoa_fisica = PessoaFisica(nome_pf, cpf)
cadastro.cadastrarPessoa(pessoa_fisica)

nome_pj = input("Informe o nome da pessoa jurídica: ")
cnpj = input("Informe o CNPJ da pessoa jurídica: ")
pessoa_juridica = PessoaJuridica(nome_pj, cnpj)
cadastro.cadastrarPessoa(pessoa_juridica)

cadastro.imprimirCadastro()
