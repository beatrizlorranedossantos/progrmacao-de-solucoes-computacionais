import java.util.Scanner;

public class Pesquisas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números para preencher o vetor:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        while (true) {
            System.out.println("\nEscolha o tipo de pesquisa:");
            System.out.println("1. Sequencial");
            System.out.println("2. Sequencial com Sentinela");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            }

            System.out.print("Digite o número a ser pesquisado: ");
            int numero = scanner.nextInt();

            int comparacoes = 0;

            switch (escolha) {
                case 1:
                    comparacoes = pesquisaSequencial(vetor, numero);
                    break;
                case 2:
                    comparacoes = pesquisaSequencialSentinela(vetor, numero);
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }

            System.out.println("Número de comparações: " + comparacoes);
        }

        scanner.close();
    }

    public static int pesquisaSequencial(int[] vetor, int numero) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == numero) {
                return i + 1; // Retorna a posição (começando de 1) onde o número foi encontrado
            }
        }
        return vetor.length; // Retorna o tamanho do vetor se não encontrar o número
    }

    public static int pesquisaSequencialSentinela(int[] vetor, int numero) {
        int i = 0;
        vetor[vetor.length - 1] = numero; // Sentinela
        while (vetor[i] != numero) {
            i++;
        }
        return i + 1; // Retorna a posição (começando de 1) onde o número foi encontrado
    }
}

