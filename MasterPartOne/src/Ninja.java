
public class Ninja  extends Human {
	public Ninja() {
		this.stealth = 10;
		this.classType = "unknown";
	}
	
	public void steal(Human target) {
		target.health -= this.stealth;
		this.health += this.stealth;
		System.out.println("The ninja steals " + this.stealth + " from the target... or did he...");
	}
	
	public void runAway() {
		this.health -= 10;
		System.out.println("The ninja vanishes into the shadows, getting a splinter on his way out and losing 10 hp");
	}
	
}
