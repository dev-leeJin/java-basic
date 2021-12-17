package accessmodifier;

public class Warrior {
	// name, hp, mp, lv, atk, def, exp;
	// 변수값은 현실에서도 특정한 물체나 사람의 상태가 휙휙 바뀌지 않으므로
	// 외부에서 값을 함부로 고칠 수 없도록 private으로 처리합니다.
	//# 현실세계와 가장 비슷하게 만들기 위해.
	private String name;
	private int hp;
	private int mp;
	private int lv;
	private int atk;
	private int def;
	private int exp;
	
	//## 변수는 private으로 막고 생성자와 메서드는 public으로 푼다 !! (객체 지향 프로그래밍의 기본적인 원칙)
	//# 현실세계에도 모든것을 숫자(수치)로 나타내는 것이 가능하다.
	//# -현실세계처럼 만들려면- 행동을 해야 변화가 생긴다 ex) 먹음 -> 찜 , 돈을 번다 -> 잔고가 늘어남
	//# 세상 모든 상태값은 규칙에 의하여 움직이기 때문에 기본값은 고정시키고 규칙에 의하여 변하게 설정.
	
	
	// 생성자를 비롯한 메서드는 행동을 나타내고
	// 이런 행동의 성공/실패 여부는 오로지 정보(변수)에 의해 결정되며
	// 시도 자체에 대해서는 제한을 두지 않습니다. (잔액이 부족해도 계속 결제를 시도할 수 있음)
	//# 그래서 public로 풀어둔다.(변수값은 메서드의 움직임으로만 변경 가능.)
	public Warrior(String n) {
		name = n;
		hp = 20;
		mp = 10;
		lv = 1;
		atk = 3;
		def = 0;
		exp = 0;
		System.out.println("아이디가 생성되었습니다.");
		System.out.println("아이디 : " + name + ", 레벨 : "+ lv);
	}
	
	// hunt 메서드를 만들어보겠습니다.
	// 이 메서드는 실행시 사냥을 하는데 체력이 2깍이고 경험치가 10올라갑니다.
	// 사냥 결과 체력이 X이 되었고, 누적 경험치는 Y입니다. 라고 출력합니다.
	public void hunt() {
		hp -= 2;
		exp += 10;
		System.out.println("사냥 결과 체력이 " + hp + "가 되었고, 누적 경험치는 "+ exp + "입니다." );
		
	}

}
