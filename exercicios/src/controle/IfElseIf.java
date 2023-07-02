package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a nota: ");

		double nota = entrada.nextDouble();

		if (nota > 10 || nota < 0) {
			System.out.println("Nota invalida!");
		} else {
			if (nota > 8 && nota <= 10) {
				System.out.println("Conceito A");
			}

			if (nota >= 7 && nota < 8) {
				System.out.println("Conceito B"); 		
			
			} 
			else {
				if (nota == 6) {
				System.out.println("Na media!!");}
				
				if (nota > 0 && nota < 6) {
				System.out.println("Reprovado!!");}
				
					
			}
		}

		entrada.close();
	}

}
