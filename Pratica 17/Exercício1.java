import java.util.Arrays;
import java.util.Scanner;

class Ordenacao {
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
     
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
    }

    public static void insertionSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 1; i < n; ++i) {
            int chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j = j - 1;
            }
            vetor[j + 1] = chave;
        }
    }
}

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        Ordenacao ordenacao = new Ordenacao();

        do {
            System.out.println("Informe 10 números para o vetor:");
            for (int i = 0; i < 10; i++) {
                vetor[i] = scanner.nextInt();
            }

            System.out.println("Escolha o método de ordenação:\n1. Bubble Sort\n2. Selection Sort\n3. Insertion Sort");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    ordenacao.bubbleSort(vetor);
                    break;
                case 2:
                    ordenacao.selectionSort(vetor);
                    break;
                case 3:
                    ordenacao.insertionSort(vetor);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

            System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

            System.out.println("Deseja executar novamente? (Digite 1 para Sim, 0 para Não)");
        } while (scanner.nextInt() == 1);

      
        scanner.close();
    }
}

