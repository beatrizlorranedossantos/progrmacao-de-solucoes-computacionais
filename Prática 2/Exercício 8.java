package pratica2;

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código do produto: ");
        int codigoProduto = scanner.nextInt();

        double preco;

        switch (codigoProduto) {
            case 1:
                preco = 99.99;
                System.out.println("Produto: Sapato");
                break;
            case 2:
                preco = 103.89;
                System.out.println("Produto: Bolsa");
                break;
            case 3:
                preco = 49.98;
                System.out.println("Produto: Camisa");
                break;
            case 4:
                preco = 89.72;
                System.out.println("Produto: Calça");
                break;
            case 5:
                preco = 97.35;
                System.out.println("Produto: Blusa");
                break;
            default:
                preco = 0.0;
                System.out.println("Código de produto inválido.");
        }

        if (preco != 0.0) {
            System.out.println("Preço: R$ " + preco);
        }
    }
}
