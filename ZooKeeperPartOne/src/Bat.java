
public class Bat extends Mammal{
	public Bat(){
		this.energyLevel = 300;
	}
	
	public void fly() {
		this.changeEnergyLevel(-50);
		System.out.println("The sound of a bat taking off and decreased  it's energy by 50");
	}
	public void eatHumans() {
		this.changeEnergyLevel(+25);
		System.out.println("So-");
	}
	
	public void eatLotsOfHumans() {
		this.changeEnergyLevel(100);
		System.out.println("The bat...just ate 4 people! Run!");
	}
	
	public void attackTown() {
		this.changeEnergyLevel(-100);
		System.out.println("The sound of a town on fire and decreased its energy by 100");
	}
	
}
