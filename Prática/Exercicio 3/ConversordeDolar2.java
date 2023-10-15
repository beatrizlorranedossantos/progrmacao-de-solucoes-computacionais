package pratica1.exercicio3;
import javax.swing.JOptionPane;
public class CalculoDolarAReal2 {

	public static void main(String[] args) {
	
		String cotacaoDolarARealStr = JOptionPane.showInputDialog("Informe a cotação do dólar para real: ");
		double cotacaoDolarAReal = Double.parseDouble(cotacaoDolarARealStr);
		
		String valorEmDolarStr = JOptionPane.showInputDialog("Informe o valor em dólar: ");
		double valorEmDolar = Double.parseDouble(valorEmDolarStr);
		
		double valorEmReal = valorEmDolar * cotacaoDolarAReal;
		
		JOptionPane.showMessageDialog(null, "O valor em real é: R$" + valorEmReal);

	}

}
