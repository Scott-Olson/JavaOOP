
public class Human {
	public int health, strength, stealth, intelligence;
	public String classType;
	public Human() {
		this.health = 100;
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.classType = "Human";
	}
	
	public Human(int health, int strength, int stealth, int intelligence) {
		this.health = health;
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
	}
	
	public void attack(Human target) {
		target.health -= this.strength;
		System.out.println("You attacked another human and did "+ this.strength + " damage. The humans health is now " + target.health + ".");
	}
	
	public void getHuman() {
		System.out.println("This humans health is " +this.health);
		System.out.println("This humans strength is " +this.strength);
		System.out.println("This humans stealth is " +this.stealth);
		System.out.println("This humans intelligence is " +this.intelligence);
		System.out.println("Class: " +this.classType);
	}
	
	public void getHealth() {
		System.out.println("This heros health is " +this.health);
	}
	
}
