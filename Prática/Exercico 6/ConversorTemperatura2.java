package pratica1.exercicio6;
import javax.swing.JOptionPane;
public class ConversorTemperatura2 {

	public static void main(String[] args) {
		String temperaturaCelsiusStr = JOptionPane.showInputDialog("Informe a temperatura em graus Celsius: ");
		double temperaturaCelsius = Double.parseDouble(temperaturaCelsiusStr);
		
		double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;
		
		JOptionPane.showMessageDialog(null, "A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit + "°F" );
	}

}
