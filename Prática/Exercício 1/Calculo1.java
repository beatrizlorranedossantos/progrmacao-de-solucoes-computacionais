package pratica1.exercicio1;
import java.util.Scanner;
public class CalculoIdade {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Informe o ano de nascimento: ");
		int anoNascimento = input.nextInt();
		
		System.out.println("Informe o ano atual: ");
		int anoAtual = input.nextInt();
		
		int idadeAtual = anoAtual - anoNascimento;
		System.out.println("Sua idade atual é: " + idadeAtual);
		
		int idade2050 = 2050 - anoNascimento;
		System.out.println("Sua idade em 2050 será: " + idade2050);
		

	}

}
