package _03_method_writing._1_obedient_robot;

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
	}

}
void Setup() {
	drawSquare();
}

}
