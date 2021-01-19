package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;


public class Im_Skilled{
public static void main(String[] args) {


// Use pop-ups for the following.
// Ask the user how many dimes they have
String answer=JOptionPane.showInputDialog("How many dimes do you have?");
int dimes=Integer.parseInt(answer);



// Tell them how many cents they have (hint multiply by 10)
JOptionPane.showMessageDialog(null, "You have " + (dimes*10) + " cents. ");



// Ask the user how tall they are (inches)
answer=JOptionPane.showInputDialog("How tall are you?(inches plz)");
int height=Integer.parseInt(answer);
if(height<36) {
	JOptionPane.showMessageDialog(null, "EAT YOUR WHEATIES!!!");
}

for(int i=1;i<31;i+=3) {
	System.out.println(i);
}
Random ran= new Random();

int firstNumber= ran.nextInt(21);
System.out.println(firstNumber);

int secondNumber=ran.nextInt(11);
System.out.println(secondNumber);

JOptionPane.showMessageDialog(null,firstNumber-secondNumber);


}


}
