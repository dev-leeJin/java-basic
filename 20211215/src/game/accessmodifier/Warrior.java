package game.accessmodifier;

public class Warrior extends Commoner {
	
	public Warrior(String id) {
		super(id);
	}
	public void hunt() {
		System.out.println("전사가 기본공격을 시작합니다");
		System.out.println("체력-2, 경험치 10 증가");
		setHp(getHp()-2);
		if(getExp()>=100) {
			System.out.println("레벨이 증가하였습니다.");
			setLv(getLv() + 1);
			setExp(0);
		}else {
			setExp(getExp()+10);
		}
		
	}
	public void doubleAttack() {
		System.out.println("전사가 필살기를 사용합니다");
		System.out.println("체력-4, 경험치 25 증가");
		setHp(getHp()-4);
		if(getExp()>=100) {
			System.out.println("레벨이 증가하였습니다.");
			setLv(getLv()+1);
			setExp(0);
		}else
			setExp(getExp()+25);
	}
	public void heal() {
		System.out.println("전사가 체력회복 물략을 사용합니다");
		System.out.println("체력 10 증가");
		setHp(getHp()+10);
	}
	public void getInfo() {
		System.out.println(getId() + "님의 체력 : "+getHp()+" 마력 : "+ getMp()
							+" 레벨 : "+getLv()+ " 경험치 : "+getExp());
	}
	
	
	
	

}
