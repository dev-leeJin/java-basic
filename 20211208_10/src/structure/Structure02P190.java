	package structure;

public class Structure02P190 {

		// Person 내부의 정보를 쉽게 조회하기 위한 메서드 생성
	public static void getInfo(Person p) {
		System.out.println(p.name + "님의 정보입니다.");
		System.out.println("이름 : " + p.name + ", 나이 : " + p.age + ", 연락처 : " + p.pNum + ", 번호 : " + p.uNum);
		
		
		
	}
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어보세요.(a,b)
		
		Person a = new Person();
		a.name = "이창훈";
		a.age = 23;
		a.pNum = "01049211920";
		a.uNum = 7;
		
		Person b = new Person();
		b.name = "양윤수";
		b.age = 28;
		b.pNum = "01047566449";
		b.uNum = 8;
				
		getInfo(a); //a의 주소값을 getInfo의 p에 전달
		getInfo(b); //b의 주소값을 getInfo의 p에 전달
	}

}
