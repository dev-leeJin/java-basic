package game.interaction;

public class Main04 {

	public static void main(String[] args) {
		Warrior w2 = new Warrior();
		Magician m2 = new Magician();
		Archer a2 = new Archer();
		Orc o3 = new Orc();
		Troll t4 = new Troll();
		Oni n1 = new Oni();
		
		System.out.println("오니 공격");
		w2.huntOni(n1);
		m2.huntOni(n1);
		a2.huntOni(n1);
		System.out.println("====================");
		
		System.out.println("오크 공격");
		a2.huntOrc(o3);
		a2.huntOrc(o3);
		System.out.println("====================");
		
		System.out.println("트롤 공격");
		m2.huntTroll(t4);
		w2.huntTroll(t4);
		m2.huntTroll(t4);
	
	}

}
