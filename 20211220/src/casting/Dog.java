package casting;

public class Dog extends Animal{
	
	public Dog(String name, int age) {
		super(name,age);
		
	}
	public void eat() {
		System.out.println("사료를 먹습니다");
	}
	public void sit() {
		System.out.println("강아지가 앉습니다.");
	}
	

}