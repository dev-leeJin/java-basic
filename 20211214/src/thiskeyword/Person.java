package thiskeyword;

public class Person {

	private String name;
	private int age;
	private int money;
	private String major;
	
	public Person(String name, int age, int money, String major) {
		this.name = name;  // name=name라고 기입할 경우 생성자 지역의 name 부분만 가져오는데
		                   // this를 기입하면 this가 상위지역의 Person의 역할을 한다. (최상위 지역입니다라는 안내)
		this.age = age;
		this.money = money;
		this.major = major;
	}
	
	// 이름, 나이, 소지금액, 전공을 콘솔에 찍어주는 getInfo()를 작성해주세요.
	public void getInfo() {
		System.out.println("이름 :"+this.name+" 나이 :"+age+" 소지금액 :"+this.money+" 전공 :"+major);
	}
}
