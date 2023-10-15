package pratica1.exercicio10;
import javax.swing.JOptionPane;
public class CalculoDaEsfera2 {

	public static void main(String[] args) {
		String raioStr = JOptionPane.showInputDialog("Informe o raio da esfera:");
        double raio = Double.parseDouble(raioStr);

        double comprimento = 2 * Math.PI * raio;

        double area = Math.PI * Math.pow(raio, 2);

        double volume = (3.0 / 4.0) * Math.PI * Math.pow(raio, 3);

        String mensagem = "O comprimento da esfera é: " + comprimento + "\n";
        mensagem += "A área da esfera é: " + area + "\n";
        mensagem += "O volume da esfera é: " + volume;

        JOptionPane.showMessageDialog(null, mensagem);

	}

}
