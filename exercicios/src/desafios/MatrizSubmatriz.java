package desafios;

public class MatrizSubmatriz {
	
	public static void main(String[] args) {
		
		 int linhas = 3;
	       int colunas = 3;
	       
	       System.out.println("Exercicio 2\n");

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
	        
	        System.out.println("Matriz A: \n");
	        for (int l = 0; l < linhas; l++) {
	            for (int c = 0; c < colunas; c++) {
	                System.out.print(matriz[l][c] + " ");
	            }  
	            
	            System.out.println();	            
	        }
	        
	        int l2 = 2;
	        int c2 = 2;
	        
	        int[][] matrizDOIS = new int [l2][c2];
	        
	        matrizDOIS[0][0] = 10;
	        matrizDOIS[0][1] = 11;
	        matrizDOIS[1][0] = 12;
	        matrizDOIS[1][1] = 13;
	        
	        System.out.println("\nSubmatriz B: \n");
	        for (int l = 0; l < 2; l++) {
	            for (int c = 0; c < c2; c++) {
	                System.out.print(matrizDOIS[l][c] + " ");
	            	}
	            
	            System.out.println();
	            }
	        
	        
	        int contagem = contarSubmatriz(matriz, matrizDOIS);
	        System.out.println("\nResposta:");

	        if (contagem == 0) {
	        	System.out.println("A matriz nao corre nenhuma vez na matriz A!");
	        }else {
	        	
	        	
	        System.out.println("A submatriz B ocorre " + contagem + " vezes na matriz A!");
	        }
	    }

	    public static int contarSubmatriz(int[][] matrizA, int[][] submatrizB) {
	        int ocorrencias = 0;
	        int linhasA = matrizA.length;
	        int colunasA = matrizA[0].length;
	        int linhasB = submatrizB.length;
	        int colunasB = submatrizB[0].length;

	        for (int i = 0; i <= linhasA - linhasB; i++) {
	            for (int j = 0; j <= colunasA - colunasB; j++) {
	                if (verificarSubmatriz(matrizA, submatrizB, i, j)) {
	                    ocorrencias++;
	                }
	            }
	        }

	        return ocorrencias;
	    }

	    public static boolean verificarSubmatriz(int[][] matrizA, int[][] submatrizB, int linhaInicio, int colunaInicio) {
	        int linhasB = submatrizB.length;
	        int colunasB = submatrizB[0].length;

	        for (int i = 0; i < linhasB; i++) {
	            for (int j = 0; j < colunasB; j++) {
	                if (matrizA[linhaInicio + i][colunaInicio + j] != submatrizB[i][j]) {
	                    return false;
	                }
	            }
	        }

	        return true;	        
	}

}
