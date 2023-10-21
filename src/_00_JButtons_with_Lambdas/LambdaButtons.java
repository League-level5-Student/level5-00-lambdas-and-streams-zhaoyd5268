package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		addNumbers.addActionListener((e) -> {
			System.out.println("Since you pressed this button, 175,983,958,767+2,938,575,738 = 178,922,534,505");
		});
		randNumber.addActionListener((e) -> {
			Random ran = new Random();
			int r = ran.nextInt(1000);
			System.out.println("Since you pressed this button, a random nmber has been generated from 0-1000. It is: " + r+".");
		});
		tellAJoke.addActionListener((e) -> {
			System.out.println("Why did the chicken cross the road? \n \n \n \n \n \n \n \n \n \n \n "
					+ "To get to the other side!");

		});
		window.setVisible(true);
		window.pack();
		
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	
	
}
