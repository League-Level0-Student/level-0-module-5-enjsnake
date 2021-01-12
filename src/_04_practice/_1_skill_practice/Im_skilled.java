package _04_practice._1_skill_practice;

import javax.swing.JOptionPane;

	
public static void main(String[] args) {



// Use pop-ups for the following.
// Ask the user how many dimes they have
String answer=JOptionPane.showInputDialog("How many dimes do you have?");
int dimes=Integer.parseInt(answer);



// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMesageDialog(null, "You have " + (dimes*10) + " cents. ");



// Ask the user how tall they are (inches)
}
