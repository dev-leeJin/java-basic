package game.lnheritance;

public class Archer extends Commoner{
	private int rDam;
	
	public Archer (String id) {
		super(id);
		rDam = 10;
	}
	public void getInfo() {
		System.out.println("아이디 :" + id +" Lv :"+ lv +" Hp :"
							+ hp +" Mp :"+ mp+" 원거리데미지 :"+rDam);
	}
}
