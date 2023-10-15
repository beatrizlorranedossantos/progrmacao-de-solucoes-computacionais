package pratica1.exercicio2;
import javax.swing.JOptionPane;
public class MediaAritmetica2 {

	public static void main(String args[]) {
		
		String nota1Str = JOptionPane.showInputDialog("Informe a primeira nota: ");
		double nota1 = Double.parseDouble(nota1Str);
		
		String nota2Str = JOptionPane.showInputDialog("Informe a segunda nota: ");
		double nota2 = Double.parseDouble(nota2Str);
		
		String nota3Str = JOptionPane.showInputDialog("Informe a terceira nota: ");
		double nota3  = Double.parseDouble(nota3Str);
		
		double media = nota1 + nota2 + nota3 /3;
		JOptionPane.showMessageDialog(null, "A média aritmética entre as notas é: " + media);
		
		

	}

}
