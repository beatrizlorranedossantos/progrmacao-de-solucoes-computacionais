package pratica1.exercicio6;
import java.util.Scanner;
public class ConversorTemperatura {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		double temperaturaCelsius = scanner.nextDouble();
		
		double temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;
		
		System.out.println("A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit + "°F");
		
		scanner.close();
	}

}
