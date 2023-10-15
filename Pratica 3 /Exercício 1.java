package pratica3;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int alunosAprovados90 = 0;
        int alunosReprovados = 0;
        double maiorNota = Double.MIN_VALUE;
        double menorNota = Double.MAX_VALUE;
        double somaNotas = 0;
        int totalAlunos = 0;

        System.out.println("Digite a nota final e o total de faltas dos alunos (para encerrar, digite uma nota negativa):");

        while (true) {
            System.out.print("Nota final: ");
            double nota = scanner.nextDouble();

            if (nota < 0) {
                break;
            }

            System.out.print("Total de faltas: ");
            int faltas = scanner.nextInt();

            totalAlunos++;
            somaNotas += nota;

            if (nota >= 90) {
                alunosAprovados90++;
            }

            if (nota < 70 || faltas >= 20) {
                alunosReprovados++;
            }

            if (nota > maiorNota) {
                maiorNota = nota;
            }

            if (nota < menorNota) {
                menorNota = nota;
            }
        }

        double mediaNotas = totalAlunos > 0 ? somaNotas / totalAlunos : 0;

        System.out.println("a. Alunos com nota maior que 90: " + alunosAprovados90);
        System.out.println("b. Alunos reprovados por nota menor que 70 ou mais de  20 faltas: " + alunosReprovados);
        System.out.println("c. Maior nota: " + (maiorNota == Double.MIN_VALUE ? "N/A" : maiorNota));
        System.out.println("   Menor nota: " + (menorNota == Double.MAX_VALUE ? "N/A" : menorNota));
        System.out.println("d. Média de notas da turma: " + mediaNotas);
    }
}
