package pratica3;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalSalarios = 0;
        int totalHabitantes = 0;
        int totalFilhos = 0;

        System.out.println("Digite o salário e o número de filhos de cada habitante.");
        System.out.println("Para encerrar a leitura de dados, digite um salário negativo.");

        while (true) {
            System.out.print("Salário (ou valor negativo para sair): ");
            double salario = scanner.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Número de filhos: ");
            int numFilhos = scanner.nextInt();

            totalSalarios += salario;
            totalHabitantes++;
            totalFilhos += numFilhos;
        }

        if (totalHabitantes > 0) {
            double mediaSalario = totalSalarios / totalHabitantes;
            double mediaFilhos = (double) totalFilhos / totalHabitantes;

            System.out.println("\nMédia salarial da população: " + String.format("%.2f", mediaSalario));
            System.out.println("Média do número de filhos: " + String.format("%.2f", mediaFilhos));
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }
    }
}
