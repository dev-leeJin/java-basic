package final2;

public class Main01P276 {

	public static void main(String[] args) {
		// final변수를 쓰기 위한 조건
		// 1. Country라는 소속을 써줘야함
		// 2. .상수명 을 적어서 Country에 소속된 상수들을 호출함
		System.out.println(Country.KOREA);
		System.out.println(Country.CHINA);
		System.out.println(Country.STATES);
		System.out.println(Country.CANADA);
		//값 재할당 불가능
		//Country.KOREA =1003;
		
		// Math(수학) 자바의 기본 저장 메서드 // public static final double PI라고 저장되어있음.
		System.out.println(Math.PI);
		//static final은 위 와 같이 보편적으로 사용되는 법칙을 상수로 저장할 필요가 있을 때
		//카테고라이징을 할 경우 자주 씀 

	}

}
