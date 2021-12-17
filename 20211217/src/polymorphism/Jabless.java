package polymorphism;

public class Jabless extends Person {
	
	private int trem;
	
	public Jabless(String name, int age, int trem) {
		super(name, age);
		this.trem = trem;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("백수 기간 : " + trem+ "년");
	}
	

}
