package game.accessmodifier;

public class Magician extends Commoner {
	
	public Magician(String id) {
		super(id);
	}
	
	public void hunt() {
		System.out.println("마법사가 사냥을 시작합니다.");
		System.out.println("체력-2, 경험치 10 증가");
		// hp-=2; 를 직접 실행할 수 없으므로
		// public인 setter(setHp)를 이용합니다.
		// setHp(5) 인 경우, 기존의 값 대신 hp변수에 5로 교체해달라는 요청임.
		// 현재 원하는것은, 현 hp값에서 사냥할때마다 2씩 체력이 깍이는것입니다.
		setHp((getHp()-2));
		// 경험치도 마찬가지로 
		// exp += 10; 를 직접 실행할 수 없으므로
		// setExp()를 활용합니다.
		// 현재 원하는것은, 현 hp값에서 사냥할때마다 10씩 경험치가 증가하는것입니다.
		setExp(getExp()+10);
		} 
	
	public void fireball() {
		System.out.println("마법사가 화염구를 던집니다.");
		System.out.println("마나-3, 경험치 20 증가");
		setMp(getMp()-3);
		setExp(getExp()+20);
	}
	
	public void heal() {
		System.out.println("마법사가 회복주문을 사용합니다.");
		System.out.println("마나-2, 체력 10 증가");
		setMp(getMp()-2);
		setHp(getHp()+10);
	}
	
	
	public void getInfo() {
		// 심지어 private요소는 수정이 아닌 조회도 불가능합니다.
		System.out.println("현재 체력 : "+getHp());
		// 체력뿐만 아니라 나머지 요소들도 조회할 수 있도록 코드를 추가해주세요.
		System.out.println("현재 마력 : "+getMp());
		System.out.println("현재 레벨 : "+getLv());
		System.out.println("현재 경험치 : "+getExp());
		System.out.println("아이디 : "+getId());
	}
}
