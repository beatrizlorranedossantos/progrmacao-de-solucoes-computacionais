package pratica3;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] canais = {2, 4, 5, 7, 12};
        int[] pessoasAssistindo = new int[canais.length];
        int totalPessoasAssistindo = 0;

        System.out.println("Digite o número do canal e o número de pessoas assistindo a esse canal.");
        System.out.println("Para encerrar o processamento, digite 0 para o número do canal.");

        while (true) {
            System.out.print("Número do canal: ");
            int canal = scanner.nextInt();

            if (canal == 0) {
                break;
            }

            if (canal < 0 || canal > 12) {
                System.out.println("Canal inválido. Os canais válidos são 2, 4, 5, 7 e 12.");
                continue;
            }

            System.out.print("Número de pessoas assistindo: ");
            int numPessoas = scanner.nextInt();


            int indice = -1;
            for (int i = 0; i < canais.length; i++) {
                if (canais[i] == canal) {
                    indice = i;
                    break;
                }
            }

            if (indice != -1) {
                pessoasAssistindo[indice] += numPessoas;
                totalPessoasAssistindo += numPessoas;
            }
        }

        System.out.println("\nPercentual de audiência de cada canal:");

        for (int i = 0; i < canais.length; i++) {
            double percentual = (double) pessoasAssistindo[i] / totalPessoasAssistindo * 100;
            System.out.println("Canal " + canais[i] + ": " + String.format("%.2f", percentual) + "%");
        }
    }
}
