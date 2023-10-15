package pratica1.exercicio4;
import java.util.Scanner;
public class AumentoSalario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o salário atual do funcionário: ");
		double salarioAtual = scanner.nextDouble();
		
		double aumento = salarioAtual * 0.25;
		
		double novoSalario = salarioAtual + aumento;
		
		System.out.println("O novo salário do funcionário é: R$: " + novoSalario);
		
		scanner.close();
	}

}
