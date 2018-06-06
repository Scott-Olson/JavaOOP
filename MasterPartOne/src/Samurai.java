
public class Samurai extends Human {
	private static int counter = 0;
	public Samurai() {
		this.health = 200;
		this.classType = "Samurai";
		counter ++;
	}
	
	public void deathBlow(Human target) {
		target.health = 0;
		this.health = this.health / 2;
		System.out.println("The samurai delivers a death blow, killing his opponent and reducing his health by half. Current hp: " + this.health);
	}
	
	public void meditate() {
		this.health = this.health + (this.health/2);
		System.out.println("The samurai finds inner peace and heals to " + this.health + " health points.");
	}
	
	public int howMany() {
		System.out.println("There are " + counter + " samurai in existance.");
		return counter;
	}
	
}
