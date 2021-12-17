package game.polymorphism;

// Monster를 상속
public class Orc extends Monster {
	
	// 생성자 설정, 기본체력 5 공격력2 이름 오크 
	public Orc() {
		// 부모인 Monster를 처리해야 하므로 super()를 이용.
		super("오크", 5, 2);
	}

}
