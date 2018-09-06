package classes.texbasedrpg;


public class Fighter {
	int healthPoints = 100;
	int level = 1;
	int experience = 0;
	int xpWorth = 10;
	int gold = 100;
	String name;
	Weapon weapon;
	
	public Fighter(String n, Weapon w) {
		this.name = n;
		this.weapon = w;
	}
	
	public int getHP() {
		return healthPoints;
	}
	
	public int getLevel() {
		return level;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public int getGold() {
		return gold;
	}
	
	public String getName() {
		return name;
	}
	public int getXpWorth() {
		return xpWorth;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public void setXPWorth(int x) {
		this.xpWorth = x;
	}
	
	public void setExperience(int ex) {
		this.experience = ex;
	}
	public void setGold(int g) {
		this.gold = g;
	}
	
	public void setHp(int h) {
		this.healthPoints = h;
	}
	
	////////////////////////////////////////////////////////Methods////////////////////////////////////////////////////////////////////////////
	
	//THIS IS NOT WORKING CORRECTLY
	//HP IS NOT DROPPING
	//MAKE SURE TO LOOK INTO THIS. LOOP IS IN MAIN.
	public void fight(Fighter f) {
		
		if(this.getHP() > 0 && f.getHP() > 0) {
			System.out.println(this.getName() + " hit " + f.getName() + " for " + this.getWeapon().getDamagePoints() + "!");
			f.setHp(f.getHP() - this.getWeapon().getDamagePoints());
		}
		
		if(this.getHP() > 0 && f.getHP() <= 0) {
			System.out.println(this.getName() + " won!");
			this.getWeapon().decreaseCondition();
			if(this.getLevel() < 5) {
				gainXP(f);
				levelUp();
			}
		}
	}
	
	//max level is 5 as of right now.
	public void levelUp() {
		if(this.experience == 10) {
			System.out.println("Congrats " + this.getName() + " is now level 2!");
			this.level++;
			this.getWeapon().setDamage(this.getWeapon().getDamagePoints() + 10);
		}
		if(this.experience == 20) {
			System.out.println("Congrats " + this.getName() + " is now level 3!");
			this.level++;
			this.getWeapon().setDamage(this.getWeapon().getDamagePoints() + 10);
		}
		if(this.experience == 30) {
			System.out.println("Congrats " + this.getName() + " is now level 4!");
			this.level++;
			this.getWeapon().setDamage(this.getWeapon().getDamagePoints() + 10);
		}
		if(this.experience == 40) {
			System.out.println("Congrats " + this.getName() + " is now level 5!");
			this.level++;
			this.getWeapon().setDamage(this.getWeapon().getDamagePoints() + 10);
		}
	}
	
	//method to rest up to regain health after fights
	public void rest() { 
		System.out.println("Resting to restore health points.");
		this.setHp(100);
	}
	
	//method for taking xp from fighters you defeat
	public void gainXP(Fighter f) {
		this.experience += f.getXpWorth();
	}
	
	
	public String toString() {
		return "\nWelcome, " + this.name + "! " + "You are level: " + level + ". " + "You currently have " + experience + " experience points\n"
				+ "You currently have " + this.getHP() + " hitpoints." + "Your weapon is: " + this.weapon;
	}
}
