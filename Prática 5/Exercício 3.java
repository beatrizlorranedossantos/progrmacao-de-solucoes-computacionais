package lista.java;

import java.util.Scanner;

public class ListaJavaAt3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero < 0) {
            System.out.println("O fatorial de um número negativo não é definido.");
        } else {
            long fatorial = 1; // Usamos 'long' para lidar com números grandes

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            System.out.println(numero + "! = " + fatorial);
        }
    }

	}
