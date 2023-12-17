import java.util.Scanner;

public class Ordenacao {

    public static void bolha(int[] vetor) {
        int n = vetor.length;
        boolean trocou;

        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    public static void selecao(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[indiceMenor]) {
                    // Encontrou um elemento menor, atualiza o índice
                    indiceMenor = j;
                }
            }

          
            if (i != indiceMenor) {
                int temp = vetor[i];
                vetor[i] = vetor[indiceMenor];
                vetor[indiceMenor] = temp;
            }
        }
    }

    public static void insercao(int[] vetor) {
        int n = vetor.length;

        for (int i = 1; i < n; i++) {
            int chave = vetor[i];
            int j = i - 1;


            while (j >= 0 && vetor[j] > chave) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = chave;
        }
    }

    public static void quicksort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int indicePivot = particiona(vetor, inicio, fim);


            quicksort(vetor, inicio, indicePivot - 1);
            quicksort(vetor, indicePivot + 1, fim);
        }
    }

    private static int particiona(int[] vetor, int inicio, int fim) {
        int pivot = vetor[fim];
        int i = inicio - 1;

        for (int j = inicio; j < fim; j++) {
            if (vetor[j] <= pivot) {
                i++;
                // Troca os elementos se necessário
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }


        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[fim];
        vetor[fim] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Escolha o método de ordenação:");
            System.out.println("1. Bolha");
            System.out.println("2. Seleção");
            System.out.println("3. Inserção");
            System.out.println("4. Quicksort");
            System.out.println("0. Sair");

            int escolha = scanner.nextInt();

            if (escolha == 0) {
                break;
            }

            System.out.println("Digite 10 números para preencher o vetor:");
            int[] vetor = new int[10];
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }

            switch (escolha) {
                case 1:
                    bolha(vetor);
                    break;
                case 2:
                    selecao(vetor);
                    break;
                case 3:
                    insercao(vetor);
                    break;
                case 4:
                    quicksort(vetor, 0, vetor.length - 1);
                    break;
                default:
                    System.out.println("Escolha inválida.");
                    break;
            }

            System.out.println("Vetor ordenado: ");
            for (int elemento : vetor) {
                System.out.print(elemento + " ");
            }
            System.out.println("\n");

        } while (true);

        scanner.close();
    }
}

