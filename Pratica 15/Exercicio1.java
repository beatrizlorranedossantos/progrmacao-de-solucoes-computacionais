import java.util.Scanner;

public class DivisaoInteiros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o dividendo (número a ser dividido): ");
            int dividendo = scanner.nextInt();

            System.out.print("Digite o divisor (número pelo qual dividir): ");
            int divisor = scanner.nextInt();

            int resultado = divide(dividendo, divisor);
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static int divide(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        if (dividendo < 0) {
            throw new ArithmeticException("Dividendo não pode ser menor que 0.");
        }

        return dividendo / divisor;
    }
}

