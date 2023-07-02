package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		// ler num1
		// ler num2
		// + - * / %
		
		Scanner entrada = new Scanner(System.in);
		 
		System.out.print("Informe um numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Informe um numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("Informe a operacao: ");
		String op = entrada.next();
		
		// Lógica
		double 
		resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", 
				num1, op, num2, resultado);
		
		entrada.close();
		
		
	}

}
