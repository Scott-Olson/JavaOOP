
public class Mammal {
	public int energyLevel;
	
	public Mammal() {
		this.energyLevel = 100;
	}
	
	public void changeEnergyLevel(int mod) {
		this.energyLevel += mod;
	}
	
	public int displayEnergy() {
		System.out.println("The energy level of this mammal is " + energyLevel);
		return energyLevel;
	}
}
