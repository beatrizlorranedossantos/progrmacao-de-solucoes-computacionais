package pratica1.exercicio8;
import java.util.Scanner;
public class CalculoNovoPeso {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Informe o peso da pessoa: ");
		double peso = scanner.nextDouble();
		
		double novoPesoAoEngordar = peso +(peso * 0.15);
		
		double novoPesoAoEmagrecer = peso - (peso * 0.20);
		
		System.out.println("Se a pessoa engordar 15%, seu novo peso será: " + novoPesoAoEngordar + " kg");
		System.out.println("Se a pessoa emagrecer 20%, seu novo peso será: " + novoPesoAoEmagrecer + " kg");
		
		scanner.close();
		

	}

}
