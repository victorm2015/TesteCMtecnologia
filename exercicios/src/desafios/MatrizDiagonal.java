package desafios;

public class MatrizDiagonal {
	private static final String v = null;

	public static void main(String[] args) {
		
	       int linhas = 3;
	       int colunas = 3;
	       
	       System.out.println("Exercicio 1\n");

	        int[][] matriz = new int[linhas][colunas];

	        matriz[0][0] = 1;
	        matriz[0][1] = 2;
	        matriz[0][2] = 3;
	        matriz[1][0] = 4;
	        matriz[1][1] = 5;
	        matriz[1][2] = 6;
	        matriz[2][0] = 7;
	        matriz[2][1] = 8;
	        matriz[2][2] = 9;
	        	        
	        // Matriz normal
	        System.out.println("Matriz: \n");
	        for (int l = 0; l < linhas; l++) {
	            for (int c = 0; c < colunas; c++) {
	                System.out.print(matriz[l][c] + " ");
	            }
	            
	            System.out.println();
	            
	        }
	        
	        inverter(matriz);

	        System.out.println("\nMatriz com diagonais invertidas:\n");
	        imprimirMatriz(matriz);
	        
	        }	        
	      
	        public static void inverter(int[][] matriz) {
	            int t = matriz.length;

	            // Diagonal principal inverter
	            for (int l = 0; l < t / 2; l++) {
	                int temp = matriz[l][l];
	                matriz[l][l] = matriz[t - 1 - l][t - 1 - l];
	                matriz[t - 1 - l][t - 1 - l] = temp;
	            }

	            // Diagonal secundária inverter
	            for (int l = 0; l < t / 2; l++) {
	                int temp = matriz[l][t - 1 - l];
	                matriz[l][t - 1 - l] = matriz[t - 1 - l][l];
	                matriz[t - 1 - l][l] = temp;
	            }
	        
	}
	        
	        public static void imprimirMatriz(int[][] matriz) {
	            int tamanho = matriz.length;

	            for (int i = 0; i < tamanho; i++) {
	                for (int j = 0; j < tamanho; j++) {
	                    System.out.print(matriz[i][j] + " ");
	                }
	                System.out.println();
	            }
	            System.out.println();
	        }
}



