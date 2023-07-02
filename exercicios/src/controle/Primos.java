package controle;
import java.util.Locale;
import java.util.Scanner;



public class Primos {
	
		
	    public static void main(String[] args) {
	 
	        Locale.setDefault(Locale.US);
	        Scanner scan = new Scanner(System.in);
	 
	        System.out.println("Digite um número");
	        int n = scan.nextInt();
	         
	     
	        for(int a = 0;a<=n;a++) {
	            if(a%2==1) {
	                 
	                System.out.println(+a);
	                 
	            }
	        }
	         
	    }
}
