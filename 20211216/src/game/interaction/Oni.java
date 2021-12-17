package game.interaction;

public class Oni {
	private int hp;
	private int atk;
	private int def;
	
	public Oni() {
		this.hp = 7;
		this.atk = 5;
		this.def = 1;
}
	public void doBattle(int uAtk) {
		this.hp = (hp + def) - uAtk;
		if(hp<=0) {
			hp=0;
			System.out.println("오니가 사망하였습니다.");
			return;
		} 
		System.out.println("오니의 남은 체력 : "+ hp); 
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
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	
	
}
