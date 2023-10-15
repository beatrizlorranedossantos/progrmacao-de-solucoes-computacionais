package pratica1.exercicio5;
import javax.swing.JOptionPane;
public class CalculadoraAreaLosango2 {

	public static void main(String[] args) {
		String diagonalMaiorStr = JOptionPane.showInputDialog("Digite o valor da diagonal maior do losango: ");
		double diagonalMaior = Double.parseDouble(diagonalMaiorStr);
		
		String diagonalMenorStr = JOptionPane.showInputDialog("Digie o valor da diagonal menor: ");
		double diagonalMenor = Double.parseDouble(diagonalMenorStr);
		
		double area = diagonalMaior * diagonalMenor /2;
		
		JOptionPane.showMessageDialog(null, "A área do losango é: " + area);

	}

}
