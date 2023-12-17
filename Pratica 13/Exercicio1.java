import javax.swing.JOptionPane;

class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;

    public Pessoa() {
        nome = "";
        telefone = "";
        endereco = "";
    }

    public Pessoa(String nome, String telefone, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public void exibe() {
        JOptionPane.showMessageDialog(null, "Nome: " + nome +
                "\nTelefone: " + telefone +
                "\nEndereço: " + endereco);
    }
}

class PF extends Pessoa {
    private String RG;
    private String CPF;

    public PF() {
        super();
        RG = "";
        CPF = "";
    }

    public PF(String nome, String telefone, String endereco, String RG, String CPF) {
        super(nome, telefone, endereco);
        this.RG = RG;
        this.CPF = CPF;
    }

    @Override
    public void exibe() {
        super.exibe();
        JOptionPane.showMessageDialog(null, "RG: " + RG + "\nCPF: " + CPF);
    }
}

class PJ extends Pessoa {
    private String CNPJ;
    private String IE;

    public PJ() {
        super();
        CNPJ = "";
        IE = "";
    }

    public PJ(String nome, String telefone, String endereco, String CNPJ, String IE) {
        super(nome, telefone, endereco);
        this.CNPJ = CNPJ;
        this.IE = IE;
    }

    @Override
    public void exibe() {
        super.exibe();
        JOptionPane.showMessageDialog(null, "CNPJ: " + CNPJ + "\nIE: " + IE);
    }
}

class Amigo extends PF {
    private String blog;

    public Amigo() {
        super();
        blog = "";
    }

    public Amigo(String nome, String telefone, String endereco, String RG, String CPF, String blog) {
        super(nome, telefone, endereco, RG, CPF);
        this.blog = blog;
    }

    @Override
    public void exibe() {
        super.exibe();
        JOptionPane.showMessageDialog(null, "Blog: " + blog);
    }
}

class Parente extends PF {
    private String email;

    public Parente() {
        super();
        email = "";
    }

    public Parente(String nome, String telefone, String endereco, String RG, String CPF, String email) {
        super(nome, telefone, endereco, RG, CPF);
        this.email = email;
    }

    @Override
    public void exibe() {
        super.exibe();
        JOptionPane.showMessageDialog(null, "Email: " + email);
    }
}

public class CadastraPessoa {
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa();
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção: \n\n1. Pessoa física\n2. Pessoa Jurídica"));
        String nome = JOptionPane.showInputDialog("Digite o nome");
        String telefone = JOptionPane.showInputDialog("Digite o telefone");
        String endereco = JOptionPane.showInputDialog("Digite o endereço");

        if (opcao == 1) {
            PF objPF = new PF();
            String RG = JOptionPane.showInputDialog("Digite o RG");
            String CPF = JOptionPane.showInputDialog("Digite o CPF");

            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n\n1. Amigos\n2. Parentes"));

            if (opcao == 1) {
                String blog = JOptionPane.showInputDialog("Digite o blog");
                Amigo objAmigo = new Amigo(nome, telefone, endereco, RG, CPF, blog);
                objAmigo.exibe();
            }

            if (opcao == 2) {
                String email = JOptionPane.showInputDialog("Digite o e-mail");
                Parente objParente = new Parente(nome, telefone, endereco, RG, CPF, email);
                objParente.exibe();
            }
        }

        if (opcao == 2) {
            String CNPJ = JOptionPane.showInputDialog("Digite o CNPJ");
            String IE = JOptionPane.showInputDialog("Digite a Inscrição Estadual");
            PJ objPJ = new PJ(nome, telefone, endereco, CNPJ, IE);
            objPJ.exibe();
        }
    }
}

