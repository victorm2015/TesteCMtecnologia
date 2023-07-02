package controle;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DoWhile {
	
	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setTitle("Janela");
		f.setSize(300, 200);
		f.setLocation(850, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		JLabel l = new JLabel("Digite um número");
		p.add(l);
		
		JTextField t = new JTextField(10);
		p.add(t);
		
		JButton b = new JButton("Ok");
		p.add(b);
		
		f.add(p);
		f.setVisible(true);
	
		
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		String texto = "";

		do {
			System.out.println("Voce precisa falar"
					+ "as palavras magicas...");
			System.out.println("Quer sair? ");
			
		texto = entrada.nextLine();
			
		} while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!!!");

		entrada.close();
		
	}

}
 