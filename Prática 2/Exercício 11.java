package pratica2;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de diárias: ");
        int numDiarias = scanner.nextInt();

        double valorDiaria = 500.0;
        double taxaServicos;

        if (numDiarias < 15) {
            taxaServicos = 15.0;
        } else if (numDiarias == 15) {
            taxaServicos = 10.0;
        } else {
            taxaServicos = 5.0;
        }

        double totalPagar = numDiarias * valorDiaria + numDiarias * taxaServicos;
        System.out.println("Total a ser pago: R$ " + totalPagar);
    }
}
