package classes.texbasedrpg;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		BlackSmith bob = new BlackSmith();
		
		//creating the character by choosing a name and weapon
	    //characters name
		System.out.print("What is your character's name? ");
		String name = input.nextLine();
		
		//choosing weapon
		System.out.print("Here is the armory, choose your weapon wisely. ");
		System.out.println("\n1 - Bow, 2 - Sword, 3 - Axe, 4 - Halbard, 5 - Longsword");
		int choice = input.nextInt();
			
		//creating the weapon, fighter, and options
		Weapon decidedWeapon = new Weapon(choice);
		Fighter newCharacter = new Fighter(name, decidedWeapon);
		
		Options options = new Options();
		options.addOriginalOptions();
		
		//creating a default enemy, maybe make an enemy class later
		Options enemyGenerator = new Options();
		enemyGenerator.populatingEnemies();
		
		
		
		//printing the character
		System.out.println(newCharacter);
		
		int option = 0;
		
		//displaying the next options
		while(option != 6) {
		options.displayOptions();
		//choosing an option
		option = input.nextInt();
		if(newCharacter.getLevel() == 5) {
			System.out.println("You've won!");
			option = 6;
		}
		
		if(option < 1) {
			System.out.println("Enter one of the given numbers.");
		}
		
		
		else if(option == 1 && newCharacter.getWeapon().getCondition() > 0) {
			Fighter random = enemyGenerator.randomEnemy();
			while(newCharacter.getHP() > 0 && random.getHP() > 0) {
				if(newCharacter.getHP() == 0 || random.getHP() == 0) {
					break;
				}
				newCharacter.fight(random);
				random.fight(newCharacter);
				
				if(newCharacter.getHP() == 0) {
					System.out.println("You have died and lost!  See you next time!");
					option = 6;
				}
			}
			}
		
		else if(option == 2) {
			bob.speak(newCharacter);
		}
		else if(option == 3) {
			newCharacter.rest();
		}
		else if(option == 4) {
			System.out.println(newCharacter);
		}
		else if(option == 5) {
			System.out.println("Your weapon's condition is: " + newCharacter.getWeapon().getCondition());
		}
		else if(option == 6) {
			System.out.println("Thanks for playing " + newCharacter.getName() + "!");
		}
		
		else if(option > 6) {
			System.out.println("Enter one of the given numbers idiot.");
		}
		}
	}
	}
	