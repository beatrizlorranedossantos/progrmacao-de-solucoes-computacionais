public class Diretor extends Empregado {
    private String departamento;

    public Diretor(String nome, double salario, int anoContratacao, String departamento) {
        super(nome, salario, anoContratacao);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    public void reajustaSalario(double porcentagem) {
        // Adiciona 2% de bônus para cada ano de serviço
        double bonus = 2 * (ANO_BASE - getAnoContratacao());
        super.reajustaSalario(porcentagem + bonus);
    }


    public String toString() {
        return super.toString() + " - " + departamento;
    }
}

public class TesteEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();


        empresa.adicionaEmpregado(new Empregado("Empregado1", 3000, 2020));
        empresa.adicionaEmpregado(new Gerente("Gerente1", 5000, 2018));
        empresa.adicionaEmpregado(new Diretor("Diretor1", 8000, 2015, "TI"));

        empresa.reajustaSalarios(5);

        System.out.println(empresa.mostrEmpregados());
    }
}
