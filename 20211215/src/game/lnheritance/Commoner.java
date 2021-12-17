package game.lnheritance;

public class Commoner {
	protected int lv;
	protected int hp;
	protected String id;
	protected int mp;
	
	public Commoner(String id) {
		lv = 1;
		hp = 20;
		mp = 10;
		this.id = id;
		
	}
	public void getInfo() {
		System.out.println("아이디 :" + id +" Lv :"+ lv +" Hp :"+ hp +" Mp :"+ mp);
	}
	

}
