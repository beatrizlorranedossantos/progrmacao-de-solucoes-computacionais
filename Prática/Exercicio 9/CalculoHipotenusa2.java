package pratica1.exercicio9;
import javax.swing.JOptionPane;

public class CalculoHipotenusa2 {

	public static void main(String[] args) {
		String cateto1Str = JOptionPane.showInputDialog("Informe o valor do primeiro cateto (b):");
        double cateto1 = Double.parseDouble(cateto1Str);

        
        String cateto2Str = JOptionPane.showInputDialog("Informe o valor do segundo cateto (c):");
        double cateto2 = Double.parseDouble(cateto2Str);

        
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);

        
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa (a) é: " + hipotenusa); 

	}

}
