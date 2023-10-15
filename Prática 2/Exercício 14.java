package pratica2;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dos comandos Git (clone, fetch, pull):");
        String comando = scanner.nextLine().toLowerCase();

        switch (comando) {
            case "clone":
                System.out.println("Comando: git clone");
                System.out.println("Explicação: O comando git clone é usado para clonar um repositório Git existente.");
                System.out.println("Exemplo: git clone https://github.com/usuario/repositorio.git");
                break;

            case "fetch":
                System.out.println("Comando: git fetch");
                System.out.println("Explicação: O comando git fetch é usado para buscar objetos do repositório remoto para o repositório local.");
                System.out.println("Exemplo: git fetch origin");
                break;

            case "pull":
                System.out.println("Comando: git pull");
                System.out.println("Explicação: O comando git pull é usado para buscar do repositório remoto as alterações e mesclá-las automaticamente no repositório local.");
                System.out.println("Exemplo: git pull origin master");
                break;

            default:
                System.out.println("Comando não reconhecido.");
        }
    }
}
