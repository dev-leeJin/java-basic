package game.lnheritance;

public class Warrior extends Commoner {
	private int pDam;
	
	public Warrior(String id) {
		super(id); // 생성자 내부에서 다른 코드에 앞서서 무조건 1순위로 들어와야함
		pDam = 10;
	}
	public void getInfo() {
		System.out.println("아이디 :" + id +" Lv :"+ lv +" Hp :"+ hp 
							+" Mp :"+ mp +" 물리데미지 :"+pDam);
		
	}

}
