package classes.texbasedrpg;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Options {
	List<String> options = new ArrayList<String>();
	List<Fighter> enemies = new ArrayList<Fighter>();

	//fighters
	Fighter nathan = new Fighter("Nathan", new Weapon(1));
	Fighter nick = new Fighter("Nick", new Weapon(2));
	Fighter daniel = new Fighter("Daniel", new Weapon(3));
	Fighter steph = new Fighter("Stephney", new Weapon(4));
	Fighter logan = new Fighter("Logan", new Weapon(5));
	Fighter littleNick = new Fighter("Little Nick", new Weapon(2));
	Fighter abbott = new Fighter("Abbott", new Weapon(3));
	Fighter dylan = new Fighter("Dylan", new Weapon(1));
	
	
	
	public void addOriginalOptions() {
		options.add("Fight");
		options.add("Repair weapon");
		options.add("Rest up");
		options.add("Character information");
		options.add("See your weapon condition");
		options.add("Quit");
	}
	
	public void displayOptions() {
		System.out.println("What would you like to do next?\n");
		
		for(int i = 0; i < options.size(); i++) {
			System.out.print((i + 1) + " " + options.get(i) + " | ");
		}
		System.out.println();
	}
	
	public void populatingEnemies() {
		enemies.add(nathan);
		enemies.add(nick);
		enemies.add(daniel);
		enemies.add(logan);
		enemies.add(steph);
		enemies.add(littleNick);
		enemies.add(abbott);
		enemies.add(dylan);
		
	}
	
	public Fighter randomEnemy() {
		Random rand = new Random();
		Fighter randomFighter = enemies.get(rand.nextInt(enemies.size()));

		return randomFighter;
	}
	

}
