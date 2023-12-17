import java.util.Arrays;
import java.util.Scanner;

public class Conjuntos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira sequência de números (separados por espaços):");
        int[] sequencia1 = lerSequencia(scanner);

        System.out.println("Digite a segunda sequência de números (separados por espaços):");
        int[] sequencia2 = lerSequencia(scanner);

        int[] conjuntoA = removeRepetidos(sequencia1);
        int[] conjuntoB = removeRepetidos(sequencia2);

        int[] conjuntoC = uniao(conjuntoA, conjuntoB);

        System.out.println("\nConjunto A: " + Arrays.toString(conjuntoA));
        System.out.println("Conjunto B: " + Arrays.toString(conjuntoB));
        System.out.println("Conjunto C (união de A e B): " + Arrays.toString(conjuntoC));

        scanner.close();
    }

    public static int[] lerSequencia(Scanner scanner) {
        String[] numerosString = scanner.nextLine().split(" ");
        int[] numeros = new int[numerosString.length];

        for (int i = 0; i < numerosString.length; i++) {
            numeros[i] = Integer.parseInt(numerosString[i]);
        }

        return numeros;
    }

    public static int[] removeRepetidos(int[] sequencia) {
        int tamanho = 0;

        for (int i = 0; i < sequencia.length - 1; i++) {
            if (sequencia[i] != sequencia[i + 1]) {
                tamanho++;
            }
        }

        tamanho++; // Conta o último elemento

        int[] conjunto = new int[tamanho];
        int indice = 0;

        for (int i = 0; i < sequencia.length - 1; i++) {
            if (sequencia[i] != sequencia[i + 1]) {
                conjunto[indice] = sequencia[i];
                indice++;
            }
        }

        conjunto[indice] = sequencia[sequencia.length - 1]; // Último elemento

        return conjunto;
    }

    public static int[] uniao(int[] conjuntoA, int[] conjuntoB) {
        int[] conjuntoC = new int[conjuntoA.length + conjuntoB.length];
        int indiceC = 0;

        for (int elemento : conjuntoA) {
            conjuntoC[indiceC] = elemento;
            indiceC++;
        }

        for (int elemento : conjuntoB) {
            if (pesquisaBinaria(conjuntoA, elemento) == -1) {
                conjuntoC[indiceC] = elemento;
                indiceC++;
            }
        }

        return Arrays.copyOf(conjuntoC, indiceC);
    }

    public static int pesquisaBinaria(int[] vetor, int numero) {
        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == numero) {
                return meio;
            } else if (vetor[meio] < numero) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; // Elemento não encontrado
    }
}
