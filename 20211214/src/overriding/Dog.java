package overriding;

public class Dog extends Animal {
	
	public String size;
	
	public void howl() {
		System.out.println("멍멍");
	}
	public void getInfo() {
		System.out.println("이름 :"+name+" 나이 :"+age+" 성별 :"+gender+" 크기 :"+size);
	}
}
