package pratica1.exercicio3;
import java.util.Scanner;

public class ConversorDolarAReal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe a cotação do dólar em real: ");
		double cotacaoDolarParaReal = scanner.nextDouble();
		
		System.out.print("Informe o valor em dólar: ");
		double valorEmDolar = scanner.nextDouble();
		
		double valorEmReal = valorEmDolar * cotacaoDolarParaReal;
		
		System.out.println("O valor em reais é: R$ " + valorEmReal);
		
		scanner.close();

	}

}
