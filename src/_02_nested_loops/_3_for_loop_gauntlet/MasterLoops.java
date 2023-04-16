package _02_nested_loops._3_for_loop_gauntlet;

public class MasterLoops {
	public static void main(String[] args) {
		for(int i = 0; i <= 100; i++) {
			System.out.println(i);
		}
		for (int i = 100; i>= 0; i--) {
			System.out.println(i);
		}
		for(int i = 2; i<= 100; i+=2) {
				System.out.println(i);
		}
		for(int i = 1; i<= 99; i+=2) {
			System.out.println(i);
		}
		for (int i = 1; i <= 500; i++) {
			if(i % 2 == 0) {
				System.out.println(i+ " is even");
			}
			if(i % 2 != 0) {
				System.out.println(i+ " is odd");
		}
	}
	for(int i = 0; i< 3; i++) {
		for (int j = 0; j<3; j++) {
			System.out.println(i+" "+ j);
		}
	}
		for(int i = 0; i<= 6; i+=3) {
			for(int j = 1; j <= 3; j++) {
				System.out.print(i+j+" ");
			}
			System.out.println();
		}
	for(int i = 0; i<= 90; i+=10) {
	for(int j = 1; j <= 10; j++) {
		if(i+j<10) {
			System.out.print(" ");
		}
		if(i+j<100) {
			System.out.print(" ");
		}
				System.out.print(i+j+" ");


	}
	System.out.println();
}
		for(int i = 1; i <= 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 0; i<= 100; i++) {
			System.out.println(100-i);
		}
}
}
