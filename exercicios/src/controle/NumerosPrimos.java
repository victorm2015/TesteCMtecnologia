package controle;

import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumerosPrimos {
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
		BottonPrimo action = new BottonPrimo(t);
		b.addActionListener(action);
		
		p.add(b);
		
		
		f.add(p);
		f.setVisible(true);
	
		
		
		

	}

}
