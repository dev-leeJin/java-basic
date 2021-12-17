package game.polymorphism;

public class Main02 {

	public static void main(String[] args) {
		Commoner c2 = new Commoner("평민");
		Oni n1 = new Oni();
		Dragon d1 = new Dragon();
		Troll t1 = new Troll();
		
		c2.hunt(n1);
		c2.hunt(d1);
		c2.hunt(t1);

	}

}
