package _01_algorithms._1_prime_or_not;
import javax.swing.JOptionPane;

public class Prime_Or_Not {
public static void main(String[] args) {
	
	String response = JOptionPane.showInputDialog("What is your number: ");
	int responseAsint = Integer.parseInt(response);
	
for (int i = 2; i <responseAsint; i ++) {
		if (responseAsint % i == 0) {
			JOptionPane.showMessageDialog(null, "Your number is composite");
			System.exit(0);

			}
	
		}
JOptionPane.showMessageDialog(null, "your number is prime");
	}
	}

	



