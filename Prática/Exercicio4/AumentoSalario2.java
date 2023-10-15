package pratica1.exercicio4;
import javax.swing.JOptionPane;
public class AumentoSalario2 {

	public static void main(String[] args) {
		String salarioAtualStr = JOptionPane.showInputDialog("Informe o sálario atual do funcionário: R$ ");
		double salarioAtual = Double.parseDouble(salarioAtualStr);
		
		double aumento = salarioAtual * 0.25;
		double novoSalario = salarioAtual + aumento;
		
		JOptionPane.showMessageDialog(null,"O salário do funcionário com aumento é de: R$" + novoSalario);
		

	}

}
