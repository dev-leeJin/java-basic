package game.polymorphism;

public class Main01 {

	public static void main(String[] args) {
		Commoner c1 = new Commoner("평민");
		Orc o1 = new Orc();
		
		c1.hunt(o1);
		c1.hunt(o1);
		

	}

}
