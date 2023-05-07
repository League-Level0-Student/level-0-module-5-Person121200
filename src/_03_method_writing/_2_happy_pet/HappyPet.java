package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet{
	
	static int happinessLevel = 0;
	
	public static void dog(int task){
		if(task == 0) {
			happinessLevel +=3;
			JOptionPane.showMessageDialog(null, "*Waggs Tail");
		}
		if(task == 1) {
			happinessLevel +=10;
			JOptionPane.showMessageDialog(null, "*Waggs Tail");
		}
		if(task == 2) {
			happinessLevel +=5;
			JOptionPane.showMessageDialog(null, "*Waggs Tail");
		}
		if(task == 3) {
			happinessLevel +=7;
			JOptionPane.showMessageDialog(null, "*Waggs Tail");
		}
	}
	public static void cat(int task){
		if(task == 0) {
			happinessLevel -=10;
			JOptionPane.showMessageDialog(null, "*Scratch");
		}
		if(task == 1) {
			happinessLevel -=20;
			JOptionPane.showMessageDialog(null, " *Scratch");
		}
		if(task == 2) {
			happinessLevel +=50;
			JOptionPane.showMessageDialog(null, "Purrr");
		}
		if(task == 3) {
			happinessLevel +=70;
			JOptionPane.showMessageDialog(null, "Purrrr");
		}
	}
	public static void lizard(int task){
		if(task == 0) {
			happinessLevel +=1;
			JOptionPane.showMessageDialog(null, "*Licks");
		}
		if(task == 1) {
			happinessLevel +=30;
			JOptionPane.showMessageDialog(null,"*Licks");
		}
		if(task == 2) {
			happinessLevel +=60;
			JOptionPane.showMessageDialog(null, "*Licks");
		}
		if(task == 3) {
			happinessLevel +=-100;
			JOptionPane.showMessageDialog(null, "*Licks");
		}
	}
	public static void dragon(int task){
		if(task == 0) {
			happinessLevel -=100;
			JOptionPane.showMessageDialog(null, "You were killed by your pet dragon");
		}
		if(task == 1) {
			happinessLevel +=1000;
			JOptionPane.showMessageDialog(null, "You have tamed a dragon");
		}
		if(task == 2) {
			happinessLevel -=100;
			JOptionPane.showMessageDialog(null, "You werre killed by your pet dragon");
		}
		if(task == 3) {
			happinessLevel -=100;
			JOptionPane.showMessageDialog(null, "You werre killed by your pet dragon");
		}
	}


	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("Which pet would you like to buy: Cat, Dog, Lizard, or Dragon");
		for(happinessLevel = 0; happinessLevel <= 100; happinessLevel++) {
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Pet Happiness", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Walk", "Bath", "Groom" }, null);
			
			if (pet.equalsIgnoreCase("Cat")) {
				cat(task);
			}
			if (pet.equalsIgnoreCase("Dog")) {
				dog(task);
			}
			if (pet.equalsIgnoreCase("Lizard")) {
				lizard(task);
			}
			if (pet.equalsIgnoreCase("Dragon")) {
				dragon(task);
			}
			// 6. Use user input to call the appropriate method created in step 5 below
			
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			else if (happinessLevel >= 100) {
				JOptionPane.showMessageDialog(null, "Your pet loves you!!!");
			}
			else if (happinessLevel <= -100)
				JOptionPane.showMessageDialog(null, "Your pet has died from neglection!!!");
	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
			JOptionPane.showMessageDialog(null, "Happiness Level =  "+happinessLevel);
			}
	}
}