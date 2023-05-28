package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class Practice {
	
public static void main(String[] args) {
	
skill50();
	
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
	int rand = ran.nextInt(20);
	System.out.println(rand);
	int rand2 = ran.nextInt(10);
	System.out.println(rand2);
	JOptionPane.showMessageDialog(null, rand-rand2);
}

static public void skill40() {
	String city = JOptionPane.showInputDialog("What city do you live in?");
	if (city.equalsIgnoreCase("San Diego")) {
		JOptionPane.showMessageDialog(null, "You live in America's finest city");
	}
	else {
		JOptionPane.showMessageDialog(null, "Move to San Diego");
	}
	String cars = JOptionPane.showInputDialog("How many cars does your family have?");
	int carsAsint = Integer.parseInt(cars);
	 if (carsAsint <= 1) {
			JOptionPane.showMessageDialog(null, "I have a Tesla and a Honda, LOL");
	}
	if (carsAsint > 1) {
		JOptionPane.showMessageDialog(null, "Your cars have " + carsAsint*4+ " Wheels in total");
	}
}

static public void skill50() {
	String school = JOptionPane.showInputDialog("Where do you go for school?");
	JOptionPane.showMessageDialog(null, school+" is a great school!!!");
}
}
