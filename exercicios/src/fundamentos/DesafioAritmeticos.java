package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		// int b = (int)Math.pow(a,  3);
		
		int a = 1 - 5;
		int b = 2 - 7;
		int c = a * b;
		int d = c / 2;
		
		int raiz1 = (int)Math.pow(d, 2);
		
		int a2 = 5 * 6;
		int raiz2 = (int)Math.pow(a2, 2);
		int b2 = 3 * 2;
		int c2 = raiz2 / b2;
		
		int raiz1c2 = c2 - raiz1;
		
		int raiz3 = (int)Math.pow(raiz1c2, 3);
		
		int raiz4 = (int)Math.pow(10, 3);
		
		int fim = raiz3 / raiz4;
		
		//System.out.println(c2);
		System.out.println(fim);
		
		
	}

}
