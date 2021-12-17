package game.interaction;

public class Warrior {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp;
	
	public Warrior() {
		this.hp=20;
		this.mp=10;
		this.atk=4;
		this.def=1;
		this.exp=0;
	}
	
	// 교전을 할 경우 상호간에 수치값이 교환되어야 합니다.
	// Warrior쪽에서 Orc쪽의 수치를 깎아주고
	// Orc쪽에서 Warrior의 수치를 깎아야 합니다.
	public void huntOrc(Orc orc) {
		// 전사가 오크를 때리기 위해서 오크의 doBattle을 호출합니다.
		orc.doBattle(this.atk);
		// 전사도 오크에게 공격을 받습니다.
		this.hp = this.hp + this.def - orc.getAtk();
		System.out.println("교전 결과 전사의 체력 : "+this.hp);
	}
	
	public void huntTroll(Troll tro) {
		tro.doBattle(atk); //트롤을 전사가 공격하는 로직
		if(tro.getHp()<=0) { //트롤 체력이 0보다 큰지 검사
			System.out.println("교전이 끝났습니다."); //트롤이 죽음
		}else {
		this.hp = (hp + def) - tro.getAtk(); //정상 교전 진행
		System.out.println("교전 결과 전사의 체력 : "+hp);
	}}
	
	public void huntOni(Oni oni) {
		oni.doBattle(atk);
		if(oni.getHp()<=0) {
			System.out.println("교전이 끝났습니다.");
		}else {
		this.hp = (hp + def) - oni.getAtk();
		System.out.println("교전 결과 전사의 체력 : "+hp);
		}}

	
	
	
	//getter/setter를 Warrior,Orc에 만들어주세요.
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
	
	

}
