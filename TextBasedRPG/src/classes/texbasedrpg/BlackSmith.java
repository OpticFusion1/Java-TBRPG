package classes.texbasedrpg;


//The Blacksmith class will be used to repair a user's selected weapon for a price of gold.
import java.util.Scanner;

public class BlackSmith {
	int cost = 100;
	final String name = "Bob";
	static Scanner input = new Scanner(System.in);
	
	
	public void speak(Fighter f) {
		System.out.println("Hello, my name is " + this.name + " the Black Smith!");
		System.out.println("It costs 100 gold for me to repair your weapon back to 100% condition! ");
		System.out.println("Would you like me to repair your weapon? (y/n)");
		String response = input.nextLine();
		
		
		if(response.toLowerCase().equals("y") && f.getGold() >= 100) {
			f.setGold(f.getGold() - 100);
			System.out.println("Thanks for your business");
			repair(f.getWeapon());
			System.out.println("Be careful, you only have " + f.getGold() + " gold left!");
		}
		else {
			System.out.println("See you later then!");
			System.out.println("Make sure you have enough gold!");
		}
	}
	
	public void repair(Weapon w) {
		w.setCondition(100);
		
	}
}