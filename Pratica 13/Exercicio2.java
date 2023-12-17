class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

  
    public String getInfo() {
        return "Nome: " + nome + "\nIdade: " + idade + "\nAltura: " + altura + "\nPeso: " + peso;
    }
}

class Empregado extends Pessoa {
    private int numeroSecao;
    private double salarioBase;
    private double inss;

    public Empregado(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss) {
        super(nome, idade, altura, peso);
        this.numeroSecao = numeroSecao;
        this.salarioBase = salarioBase;
        this.inss = inss;
    }


    public int getNumeroSecao() {
        return numeroSecao;
    }

    public void setNumeroSecao(int numeroSecao) {
        this.numeroSecao = numeroSecao;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getInss() {
        return inss;
    }

    public void setInss(double inss) {
        this.inss = inss;
    }

    public double calcularSalario() {
        return salarioBase - (salarioBase * (inss / 100));
    }


  public String getInfo() {
        return super.getInfo() + "\nNúmero de Seção: " + numeroSecao + "\nSalário Base: " + salarioBase + "\nINSS: " + inss;
    }
}

class Cliente extends Pessoa {
    private double credMax;
    private double valorEmDivida;

    public Cliente(String nome, int idade, double altura, double peso, double credMax, double valorEmDivida) {
        super(nome, idade, altura, peso);
        this.credMax = credMax;
        this.valorEmDivida = valorEmDivida;
    }


    public double getCredMax() {
        return credMax;
    }

    public void setCredMax(double credMax) {
        this.credMax = credMax;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }


    public double obterSaldo() {
        return credMax - valorEmDivida;
    }


    public String getInfo() {
        return super.getInfo() + "\nCrédito Máximo: " + credMax + "\nValor em Dívida: " + valorEmDivida;
    }
}

class Administrador extends Empregado {
    private double ajudaDeCusto;

    public Administrador(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss, double ajudaDeCusto) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
        this.ajudaDeCusto = ajudaDeCusto;
    }


    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }


    public double calcularSalario() {
        return super.calcularSalario() + ajudaDeCusto;
    }


    public String getInfo() {
        return super.getInfo() + "\nAjuda de Custo: " + ajudaDeCusto;
    }
}

class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss, double valorProducao, double comissao) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }



    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }


    public double calcularSalario() {
        return super.calcularSalario() + (valorProducao * (comissao / 100));
    }


    public String getInfo() {
        return super.getInfo() + "\nValor de Produção: " + valorProducao + "\nComissão: " + comissao;
    }
}

class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor(String nome, int idade, double altura, double peso, int numeroSecao, double salarioBase, double inss, double valorVendas, double comissao) {
        super(nome, idade, altura, peso, numeroSecao, salarioBase, inss);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }



    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double
