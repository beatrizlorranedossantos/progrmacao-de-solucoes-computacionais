package pratica2;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tipo de apartamento (S para Simples, D para Duplo): ");
        char tipoApto = scanner.next().charAt(0);

        System.out.print("Digite a quantidade de dias de hospedagem: ");
        int numDiarias = scanner.nextInt();

        double totalPagar = 0;

        if (tipoApto == 'S' || tipoApto == 's') {
            if (numDiarias < 10) {
                totalPagar = numDiarias * 100.00;
            } else if (numDiarias <= 15) {
                totalPagar = numDiarias * 90.00;
            } else {
                totalPagar = numDiarias * 80.00;
            }
        } else if (tipoApto == 'D' || tipoApto == 'd') {
            if (numDiarias < 10) {
                totalPagar = numDiarias * 140.00;
            } else if (numDiarias <= 15) {
                totalPagar = numDiarias * 120.00;
            } else {
                totalPagar = numDiarias * 100.00;
            }
        } else {
            System.out.println("Tipo de apartamento não reconhecido.");
            return;
        }

        System.out.println("Total a ser pago: R$ " + totalPagar);
    }
}
