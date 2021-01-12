package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0; 
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet=JOptionPane.showInputDialog("What pet do you want to buy?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for(int i=0;i<10;i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "food", "water", "walk" }, null);
			
			System.out.println(task);
			// 5. Use user input to call the appropriate method created in step 4.
			if(task== 0) {
				feedPet();
			}
			else if(task==1) {
				givePetWater();
			}
			else {
				takePetWalking();
			}
			
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if(happinessLevel >= 8) {
				break;
			}
		}
	}



	private static void takePetWalking() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Your pet is happy! +1 happiness");
		happinessLevel+=1;
	}



	private static void givePetWater() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Your pet will not die of thirst! +2 happiness");
		happinessLevel+=2;
	}



	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	private static void feedPet() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"Your pet is happy that it will not starve! +1 happiness");
		happinessLevel= happinessLevel+1;
	}
}