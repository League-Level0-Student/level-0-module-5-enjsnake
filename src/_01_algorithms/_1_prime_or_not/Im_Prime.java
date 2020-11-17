package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class Im_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = JOptionPane.showInputDialog("Enter a number.");
		int number = Integer.parseInt(answer);
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				JOptionPane.showMessageDialog(null, "The number is not prime, sorry!");
				return;
			} 
		}
		
		JOptionPane.showMessageDialog(null, "Congrats! Your number is prime!");
	}

}
