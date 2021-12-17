package overriding;

public class Animal {
	
	public String name;
	public String gender;
	public int age;
	
	
	public void howl() {
		System.out.println("동물이 웁니다.");
	}
	public void getInfo() {
		System.out.println("이름 : " + name + "나이 : " + age + "성별 : "+ gender);
	}
}
