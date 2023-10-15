package pratica2;

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        double resultado;

        if (x < -2) {
            resultado = 2 * x + 2;
        } else if (x >= -2 && x < 3) {
            resultado = 3;
        } else {
            resultado = -x;
        }

        System.out.println("O valor da função para x = " + x + " é: " + resultado);
    }
}
