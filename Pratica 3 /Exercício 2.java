package pratica3;

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a matrícula do aluno (ou matrícula negativa para sair): ");
            int matricula = scanner.nextInt();

            if (matricula < 0) {
                break;
            }

            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();

            System.out.print("Digite a terceira nota: ");
            double nota3 = scanner.nextDouble();

            double media = (nota1 + nota2 + nota3) / 3;

            if (media >= 70) {
                System.out.println("Aluno aprovado!");
            } else if (media >= 60) {
                System.out.println("Aluno em recuperação.");
            } else {
                System.out.println("Aluno reprovado.");
            }
        }
    }
}
