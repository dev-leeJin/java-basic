package polymorphism;

public class Officer extends Person {
	
	private int money;
	
	public Officer(String name, int age, int money) {
		super(name, age);
		this.money = money;
	}
	
	public void showPerson() {
		super.showPerson();
		System.out.println("회사원의 월급 : " + money+"만원");
	}

}
