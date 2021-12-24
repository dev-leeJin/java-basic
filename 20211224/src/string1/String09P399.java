package string1;

public class String09P399 {

	public static void main(String[] args) {
		// 기본적으로 문자열은 참조형 변수이기 때문에
		// 비교를 할 때 주소값 비교가 일어납니다.
		String a = new String("테스트");
		String b = new String("테스트");
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b); //주소값이 다름 (주소값 비교가 일어남.)
		//new 키워드를 쓰면 새로운 주소값을 만들어냄
		//쓰지 않으면 같은 주소를 공유하게 됌. (굳이 따로 쓸 필요가 없음)
		String c = "테스트";
		String d = "테스트";
		System.out.println(c == d);
				
				

	}

}
