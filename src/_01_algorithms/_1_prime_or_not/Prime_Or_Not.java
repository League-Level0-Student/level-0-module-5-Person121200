package _01_algorithms._1_prime_or_not;
import javax.swing.JOptionPane;

public class Prime_Or_Not {
public static void main(String[] args) {
	
	String response = JOptionPane.showInputDialog("What is your number: ");
	int responseAsint = Integer.parseInt(response);
	
for (int i = 0; i >2; i ++) {
		if (responseAsint % 1 == 0 && responseAsint % responseAsint==0 && responseAsint % i != 0) {
			JOptionPane.showMessageDialog(null, "Your number is prime");


			}
		}
	}
	}

	



