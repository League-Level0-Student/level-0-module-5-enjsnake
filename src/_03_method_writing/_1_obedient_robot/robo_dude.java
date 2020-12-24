package _03_method_writing._1_obedient_robot;

import org.jointheleague.graphical.robot.Robot;

public class robo_dude {
	static Robot rob=new Robot("batman");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rob.setSpeed(100);
		rob.penDown();
		drawCircle();
		
	
		
		
	}
	

	private static void drawCircle() {
		// TODO Auto-generated method stub
		for(int i=0;i<360;i++)
			rob.move(1);
			rob.turn(1);
	}


	private static void drawSquare() {
		// TODO Auto-generated method stub
		
		for(int i=0;i<4;i++) {
			rob.move(100);
			rob.turn(90);
		}
	
	
}


	private static void drawTriangle() {
		// TODO Auto-generated method stub
		for(int i=0;i<3;i++) {
		rob.move(100);
		rob.turn(120);
	
		}
	}
}
