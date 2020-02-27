package _10_happy_pet;

import javax.swing.JOptionPane;



public class HappyPet {
	
	static // 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	int y= 99;
	static int hl=0;
	static String str="";
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		str= JOptionPane.showInputDialog("what pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i=0; i<y;i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poof).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "what will you do", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "feed", "groom" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			if (task== 0) {
			cuddle();
			hl=hl+1;
			}
			if (task== 1) {
				feed();
				hl=hl+2;
				}
			if (task== 2) {
				groom();
				hl=hl+6;
				}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if ( hl>20) {
	JOptionPane.showMessageDialog(null, "your "+str+" is content");
	y = 0;
}
	}
	}
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
public static void cuddle() {
	JOptionPane.showMessageDialog(null, "your "+str+" will fall asleep");
	
}	
public static void feed() {	
	JOptionPane.showMessageDialog(null, "your "+str+" inhaled it");	
	
}	
public static void groom() {
	JOptionPane.showMessageDialog(null, "your "+str+" will lay on you");
	
}
	
}
