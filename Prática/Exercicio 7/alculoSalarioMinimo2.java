package pratica1.exercicio7;
import javax.swing.JOptionPane;
public class CalculoSalarioMinimo2 {

	public static void main(String[] args) {
		String salarioMinimoStr = JOptionPane.showInputDialog("Informe o valor do salário minimo: ");
		double salarioMinimo = Double.parseDouble(salarioMinimoStr);
		
		String salarioFuncionarioStr = JOptionPane.showInputDialog("Informe o salário do funcionário: ");
		double salarioFuncionario = Double.parseDouble(salarioFuncionarioStr);
		
		double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
		
		JOptionPane.showMessageDialog(null, "O funcionario recebe " + quantidadeSalariosMinimos + " salários minimos. ");
		
	}

}
