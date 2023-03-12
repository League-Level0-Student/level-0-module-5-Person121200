package _01_algorithms._2_fibonacci;

public class Fibonanci {
public static void main(String[] args) {
	int number0 = 0;
	int number1  = 1; 
	System.out.print(number0+ " , ");
	System.out.print(number1 + " , ");
	for (int i = 0; i <= 10; i++) {
		int sum = number0+ number1;
		number0 = number1;
		number1=sum;
		System.out.print(sum + " , ");
	}
	}
}

