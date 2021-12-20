package casting;

public class Cat extends Animal {
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	public void howl() {
		System.out.println("야옹");
	}
	public void sit() {
		System.out.println("고양이가 앉습니다.");
	}

}
