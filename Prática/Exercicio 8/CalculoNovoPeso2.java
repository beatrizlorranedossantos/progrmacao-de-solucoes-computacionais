package pratica1.exercicio8;
import javax.swing.JOptionPane;

public class CalculoNovoPeso2 {

	public static void main(String[] args) {
		String pesoStr = JOptionPane.showInputDialog("Informe o peso da pessoa: ");
		double peso = Double.parseDouble(pesoStr);
		
		double novoPesoAoEngordar = peso + (peso * 0.15);
		double novoPesoAoEmagrecer = peso - (peso * 0.20);
		
		JOptionPane.showMessageDialog(null, "Se a pessoa engordar 15%, seu novo peso será: " + novoPesoAoEngordar + " kg");
		JOptionPane.showMessageDialog(null, "Se a pessoa emagrecer 20%, seu novo peso será: " + novoPesoAoEmagrecer + " kg");
		

	}

}
