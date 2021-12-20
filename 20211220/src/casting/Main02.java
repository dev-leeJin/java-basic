package casting;

public class Main02 {

	public static void main(String[] args) {
		// Animal로 Cat을 받아서 생성
		Animal a2 = new Cat("유뷰",4);
		// a2변수와 연결된 heap쪽 자료가 Cat인지 확인
		System.out.println(a2 instanceof Cat);
		// a2변수와 연결된 heap쪽 자료가 Dog인지 확인
		System.out.println(a2 instanceof Dog);
		// a2변수와 연결된 heap쪽 자료가 Animal인지 확인
		System.out.println(a2 instanceof Animal);

	}

}
