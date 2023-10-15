package pratica2;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o lado 1 do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite o lado 2 do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite o lado 3 do triângulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo Isósceles");
        } else {
            System.out.println("Triângulo Escaleno");
        }
    }
}
