package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class robo_dude {
	static Robot rob=new Robot("batman");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		rob.setSpeed(100);
		rob.penDown();
		String colorAnswer=JOptionPane.showInputDialog("What color do you want? (red,green,blue)");
		String answer=JOptionPane.showInputDialog("Do you want to draw a square, triangle, or circle.");
		if(colorAnswer.equalsIgnoreCase("red")) {
			rob.setPenColor(255, 0, 0);
		}
		else if(colorAnswer.equalsIgnoreCase("Green")) {
			rob.setPenColor(0,255,0);
		}
		else {
			rob.setPenColor(0,0,255);
		}
		if(answer.equalsIgnoreCase("square")) {
			drawSquare();
		}
		else if(answer.equalsIgnoreCase("Triangle")) {
			drawTriangle();
		}
		else {
			drawCircle();
		}
		
	}
	

	private static void drawCircle() {
		// TODO Auto-generated method stub
		for(int i=0;i<360;i++) {
			rob.move(1);
			rob.turn(1);
		}
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
