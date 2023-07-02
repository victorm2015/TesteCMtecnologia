package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia\n");
		
		System.out.printf("Megasena: %d %d %d %d %n"
				, 1, 2, 3, 4);
		
		System.out.printf("Salario: %.1f%n", 1234.567894);
		System.out.printf("Nome: %s%n", "Joao" );
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("\n\nNome: " + nome);
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("\n\nNome: " + nome + " " + sobrenome);
		
		System.out.print("Idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos de idade.%n",
				nome, sobrenome, idade);
	
		entrada.close();
	}

}
 