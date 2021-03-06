package game.polymorphism;

// 모든 사냥감의 뼈대가 되는 클래스
public class Monster {
	
	private String name; //몬스터 종류
	private int hp;
	private int atk;
	
	public Monster(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	// doBattle(int)를 생성
	// 사용자의 공격력만큼 몬스터의 체력이 깍입니다.
	// 0이되면 교전이 불가능하다는 메세지를 남겨줍니다.
	// 체력이 0보다 높은 경우에는 남은체력을 마지막에 콘솔창에 띄워줍니다.
	public void doBattle(int uAtk) { ////////////////int atk??
		this.hp = this.hp - uAtk; // atk는 사용자의 공격력
		if(this.hp <= 0) {
			this.hp = 0; 
			System.out.println(this.name + " 이/가 사망하였습니다.");
		}else {
			System.out.println(this.name + "의 남은 체력 : "+this.hp);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}
	

}
