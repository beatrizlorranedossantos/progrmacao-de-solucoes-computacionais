package pratica1.exercicio9;
import java.util.Scanner;
public class CalculoHipotenusa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe o valor do primeiro cateto (b): ");
        double cateto1 = scanner.nextDouble();
        
        System.out.print("Informe o valor do segundo cateto (c): ");
        double cateto2 = scanner.nextDouble();
        
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        
        System.out.println("O valor da hipotenusa (a) é: " + hipotenusa);

      
        scanner.close();
	}

}
