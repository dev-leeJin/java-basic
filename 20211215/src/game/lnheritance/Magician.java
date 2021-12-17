package game.lnheritance;

public class Magician extends Commoner {
	private int mDam;
	
	public Magician (String id) {
		super(id);
		mDam = 10;
	}
	public void getInfo() {
		System.out.println("아이디 :" + id +" Lv :"+ lv +" Hp :"+
							hp +" Mp :"+ mp +" 마법데미지 :" + mDam);
	}

}
