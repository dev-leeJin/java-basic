package overriding;

public class Cat extends Animal {
	
	public String color;
	
	// 오버라이딩 요건
	// 이름과 리턴자료형 등이
	// 같은 부모쪽 메서드를
	// 중복해서 작성함
	public void howl() {
		System.out.println("야옹");
	}
	public void getInfo() {
		System.out.println("이름 :"+name+" 나이 :"+age+" 성별 :"+gender+" 색 :"+color);
	}

}
