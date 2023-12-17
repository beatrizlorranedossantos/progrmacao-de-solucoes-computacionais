import java.util.Arrays;
import java.util.Scanner;

public class PesquisaBinaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];

        System.out.println("Digite 10 números ordenados para preencher o vetor:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        Arrays.sort(vetor); // Garante que o vetor está ordenado para a pesquisa binária

        while (true) {
            System.out.println("\nEscolha o tipo de pesquisa:");
            System.out.println("1. Pesquisa Binária");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            }

            System.out.print("Digite o número a ser pesquisado: ");
            int numero = scanner.nextInt();

            int comparacoes = pesquisaBinaria(vetor, numero);

            System.out.println("Número de comparações: " + comparacoes);
        }

        scanner.close();
    }

    public static int pesquisaBinaria(int[] vetor, int numero) {
        int inicio = 0;
        int fim = vetor.length - 1;
        int meio;
        int comparacoes = 0;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            comparacoes++;

            if (vetor[meio] == numero) {
                return comparacoes;
            } else if (vetor[meio] < numero) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return comparacoes;
    }
}
