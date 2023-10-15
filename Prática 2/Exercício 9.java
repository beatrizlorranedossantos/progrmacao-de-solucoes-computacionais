package pratica2;

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tabela dos 7 planetas do sistema solar:");
        System.out.println("1 - Mercúrio");
        System.out.println("2 - Vênus");
        System.out.println("3 - Terra");
        System.out.println("4 - Marte");
        System.out.println("5 - Júpiter");
        System.out.println("6 - Saturno");
        System.out.println("7 - Urano");
        System.out.print("Escolha o planeta (1-7): ");
        int escolhaPlaneta = scanner.nextInt();

        double g;
        double h0 = 0;


        switch (escolhaPlaneta) {
            case 1:
                g = 3.7;
                break;
            case 2:
                g = 8.87;
                break;
            case 3:
                g = 9.81;
                break;
            case 4:
                g = 3.71;
                break;
            case 5:
                g = 24.79;
                break;
            case 6:
                g = 10.44;
                break;
            case 7:
                g = 8.69;
                break;
            default:
                System.out.println("Planeta não reconhecido.");
                return;
        }

        System.out.print("Digite a velocidade inicial (v0) em m/s: ");
        double v0 = scanner.nextDouble();

        System.out.print("Digite o instante de tempo (t) em segundos: ");
        double t = scanner.nextDouble();

        double vt = v0 - g * t;
        double ht = v0 * t - 0.5 * g * t * t;

        System.out.println("Velocidade : " + vt + " m/s");
        System.out.println("Altura:  " + ht + " metros");
    }
}
