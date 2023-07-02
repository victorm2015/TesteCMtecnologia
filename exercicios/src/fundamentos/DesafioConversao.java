package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Nome do funcionario: ");
		String nome = entrada.next();
		
		System.out.print("Salario de Outubro: ");
		String salario1 = entrada.next().replace(",", ".");
		
		
		System.out.print("Salario de Novembro: ");
		String salario2 = entrada.next().replace(",", ".");
		
		
		System.out.print("Salario de Dezempro: ");
		String salario3 = entrada.next().replace(",", ".");
		
		double salario01 = Double.parseDouble(salario1);
		double salario02 = Double.parseDouble(salario2);
		double salario03 = Double.parseDouble(salario3);
		
		double soma = salario01 + salario02 + salario03;
		
		entrada.close();
		
		
		System.out.println(nome + " tem em media um salario de " + soma  / 3 + " Reais");
		

	}

}
 