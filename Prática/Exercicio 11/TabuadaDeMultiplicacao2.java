package pratica1.exercicio11;
import javax.swing.JOptionPane;
public class TabuadaDeMultiplicacao2 {

	public static void main(String[] args) {
		String numeroStr = JOptionPane.showInputDialog("Informe um número:");
        int numero = Integer.parseInt(numeroStr);

        StringBuilder tabuada = new StringBuilder();
        tabuada.append("Tabuada de multiplicação para " + numero + ":\n");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            tabuada.append(numero + " x " + i + " = " + resultado + "\n");
        }

        JOptionPane.showMessageDialog(null, tabuada.toString());

	}

}
