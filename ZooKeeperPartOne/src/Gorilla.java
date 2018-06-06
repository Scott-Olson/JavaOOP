
public class Gorilla extends Mammal{
	public void throwSomething() {
		this.changeEnergyLevel(-5);
		System.out.println("The gorilla threw something and lost 5 energy");
	}
	
	public void eatBananas() {
		this.changeEnergyLevel(+10);
		System.out.println("The gorilla ate a banana and gained 10 energy");
	}
	
	public void climb() {
		this.changeEnergyLevel(-10);
		System.out.println("The gorilla climbed a tree and lost 10 energy");
	}
	
	
	
}
