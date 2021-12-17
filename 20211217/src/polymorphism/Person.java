package polymorphism;

public class Person {
	// 사람을 나타내는 클래스
	// 상속만을 목적으로 하는 클래스
	// Person을 상속받은 자식들은 전부
	// Person을 요구하는 잘에 대입될 수 있습니다. 
	private String name;
	private int age;
	
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	// Person클래스의 데이터를 콘솔에 찍어주는 showPerson()
	// Person타입으로 호출했을때 유일하게 호출 가능한 메서드
	// 이 메서드를 자식쪽에 오버라이딩 하면 부모타입으로도
	// 자식쪽 showPersomn()을 호출할 수 있다.
	public void showPerson() {
		System.out.println("이름은 : " + name + ", 나이는  : " + age);
	}
	// setter getter 생성
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
