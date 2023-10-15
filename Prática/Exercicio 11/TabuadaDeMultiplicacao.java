package pratica1.exercicio11;
import java.util.Scanner;
public class TabuadaDeMultiplicacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de multiplicação para " + numero + ":");
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();

	}

}
