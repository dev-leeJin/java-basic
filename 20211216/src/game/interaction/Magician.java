package game.interaction;

public class Magician {
	private int hp;
	private int mp;
	private int atk;
	private int def;
	private int exp; 
	
	public Magician() {
		this.hp=30;
		this.mp=15;
		this.atk=4;
		this.def=0;
		this.exp=0;
	}
	
	public void huntOrc(Orc orc2) {
		orc2.doBattle(atk);
		if(orc2.getHp()<=0) {
			System.out.println("교전이 끝났습니다.");
		}else {
		this.hp = this.hp + this.def - orc2.getAtk();
		System.out.println("교전 결과 법사의 체력 : "+this.hp);
	}}
	
	public void huntTroll(Troll tro2) {
		tro2.doBattle(atk);
		if(tro2.getHp()<=0) {
			System.out.println("교전이 끝났습니다.");
		}else {
		this.hp = (hp + def) - tro2.getAtk();
		System.out.println("교전 결과 법사의 체력 : "+hp);
		}
	}
	
	public void huntOni(Oni oni) {
		oni.doBattle(atk);
		if(oni.getHp()<=0) {
			System.out.println("교전이 끝났습니다.");
		}else {
		this.hp = (hp + def) - oni.getAtk();
		System.out.println("교전 결과 법사의 체력 : "+hp);
		}}

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
