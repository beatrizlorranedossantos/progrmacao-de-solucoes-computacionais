package pratica2;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 0 && media < 3) {
            System.out.println("Média: " + media);
            System.out.println("Situação: REPROVADO");
        } else if (media >= 3 && media < 7) {
            System.out.println("Média: " + media);
            System.out.println("Situação: EXAME");
        } else if (media >= 7 && media <= 10) {
            System.out.println("Média: " + media);
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("As notas devem estar no intervalo de 0 a 10.");
        }
    }
}
