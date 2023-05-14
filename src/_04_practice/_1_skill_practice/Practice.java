package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Practice {
	
public static void main(String[] args) {
	
skill30();
	
	}
static public void skill1() {
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int dimesAsint = Integer.parseInt(dimes);
int cents = dimesAsint*10;
JOptionPane.showMessageDialog(null, "You have: " + cents +" cents");
	}

static public void skill2() {
	String Howtall = JOptionPane.showInputDialog("How tall are you in inches? ");
	int length = Integer.parseInt(Howtall);
	if (length < 36) {
		JOptionPane.showMessageDialog(null, "EAT YOUR WHEATIES");
		}
	else {
		JOptionPane.showMessageDialog(null, "Your CRAZY TALL");
	}
	
}

static public void skill20() {
	for (int i = 1; i <= 30; i++) {
		if (i % 3 == 0) {
		System.out.println(i);
		}
	}
}

static public void skill30() {
	Random ran = new Random();
	int min = 0;
	int max = 20;
}
}
