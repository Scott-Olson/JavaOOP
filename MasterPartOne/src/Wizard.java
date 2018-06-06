
public class Wizard extends Human {
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
		this.classType = "Wizard";
	}
	
	public void heal(Human target) {
		target.health += this.intelligence;
		System.out.println("The wizard heals his ally for " +this.intelligence);
	}
	
	public void fireball(Human target) {
		target.health -= (this.intelligence * 3);
		System.out.println("The wizard casts fireball and does " +this.intelligence + " damage.");
	}
	
}
