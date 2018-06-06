
public class HumanTest {

	public static void main(String[] args) {
		Human h = new Human();
		h.getHuman();
		
		Human h2 = new Human(200, 20, 20, 20);
		h2.getHuman();
		h.attack(h);
		
		Ninja n = new Ninja();
		n.getHuman();
	}

}
