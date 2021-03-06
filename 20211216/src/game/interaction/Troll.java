package game.interaction;

public class Troll {
	private int hp;
	private int atk;
	private int def;
	
	public Troll() {
		this.hp = 7;
		this.atk = 5;
		this.def = 1;
	}
	
	
	public void doBattle(int uAtk) {
		this.hp = (hp + def) - uAtk;
		if(hp<=0) {
			hp=0;
			System.out.println("트롤이 사망하였습니다.");
			return; //강제종료의 느낌을 주기 위해 return을 사용. (메서드 종료)
		} 
		System.out.println("트롤의 남은 체력 : "+ hp); //트롤이 안죽어야 실행
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
