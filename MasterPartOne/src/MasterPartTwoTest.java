
public class MasterPartTwoTest {

	public static void main(String[] args) {
		Human h = new Human();
		h.getHealth();
		
		Human v = new Human(200, 20, 20, 20);
		v.getHealth();
		
		Ninja n = new Ninja();
		n.getHealth();

		Wizard w = new Wizard();
		w.getHealth();
		
		Samurai s = new Samurai();
		s.getHealth();
		
		Samurai s2 = new Samurai();
		s2.getHealth();
		
		Samurai s3 = new Samurai();
		s3.getHealth();
		
		v.attack(s);//villain attacking our samurai
		s.getHealth();
		w.heal(s);//we heal our samurai
		s.getHealth();
		w.fireball(v);//wizard fireballs the villain
		v.getHealth();
		n.steal(v);// ninja steals health
		v.getHealth();
		v.attack(n);
		n.runAway();
		v.attack(s);
		s.howMany();
		s.deathBlow(v);
		s.meditate();
		
	}

}
