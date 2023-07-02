package controle;

import java.util.Scanner;

public class DesafioIf {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("nota:");
		double nota = entrada.nextDouble();
		
		if (nota >= 9.0) {
			System.out.println("\nQuadro de Honra");
			System.out.println("Voce e fera!");
		}
		if (nota < 9.0) {
			System.out.println("\nEstude mais");
		}
					
		entrada.close();
	}

}
