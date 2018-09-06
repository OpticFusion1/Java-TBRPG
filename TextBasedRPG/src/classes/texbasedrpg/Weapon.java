package classes.texbasedrpg;

import java.util.ArrayList;
import java.util.List;

public class Weapon {
	String name;
	int damagePoints = 10;
	int condition = 100;
	static List<String> armory = new ArrayList<String>();
	
	public Weapon(int n) {
		armory.add("Bow");
		armory.add("Sword");
		armory.add("Axe");
		armory.add("Halbard");
		armory.add("Longsword");
		
		String choice = armory.get(n - 1);
		this.name = choice;
		
	}
	public String getName() {
		return this.name;
	}
	
	public int getDamagePoints() {
		return this.damagePoints;
	}
	
	public int getCondition() {
		return this.condition;
	}
	
	public void setCondition(int n) {
		condition = n;
	}
	
	public void setDamage(int d) {
		damagePoints = d;
	}
	public void decreaseCondition() {
		condition -= 10;
		if(condition < 1) {
			System.out.println("You need to repair your weapon before fighting again!");
		}
	}
	
	
	
	public String toString() {
		return getName() + ", it has " + getDamagePoints() + " damage points\n" + "It is currently at " + getCondition() + "% condition.";
	}
}
