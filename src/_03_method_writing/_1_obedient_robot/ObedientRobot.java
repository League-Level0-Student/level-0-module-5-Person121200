package _03_method_writing._1_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	
	Robot rob = new Robot();
	

public static void main(String[] args) {
	
	}
void drawSquare() {
	rob.show();
	rob.setSpeed(100);
	rob.penDown();
	for(int i = 0; i< 4; i++) {
		rob.move(200);
		rob.turn(90);
		rob.hide();
	}

}
void drawCircle() {
	rob.show();
	rob.setSpeed(100);
	rob.penDown();
	for(int i = 0; i< 120; i++) {
		rob.move(10);
		rob.turn(5);
		rob.hide();
	}
	}
	
	void drawTriangle() {
		rob.show();
		rob.setSpeed(100);
		rob.penDown();
		for(int i = 0; i< 3; i++) {
			rob.turn(60);
			rob.move(200);
			rob.turn(60);
			rob.hide();
		}

	

}
void Setup() {
	String shape = JOptionPane.showInputDialog("Choose a shape: Circle, Triangle, or Square");
	String color = JOptionPane.showInputDialog("Choose a color: Red, Orange, or Blue");
	if (color.equalsIgnoreCase("Red")) {
		rob.setPenColor(Color.red);
		
	}
	if (color.equalsIgnoreCase("Blue")) {
		rob.setPenColor(Color.blue);
	}
	if (color.equalsIgnoreCase("Orange")) {
		rob.setPenColor(Color.orange);
	}
	if (shape.equalsIgnoreCase("Circle")) {
		drawCircle();
	}
	if (shape.equalsIgnoreCase("Triangle")) {
		drawTriangle();
	}
	if(shape.equalsIgnoreCase("Square")) {
		drawSquare();
	}
}

}
