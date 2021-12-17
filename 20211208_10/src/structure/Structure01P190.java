                                             package structure;

public class Structure01P190 {

	public static void main(String[] args) {
		// 이제부터는 실행코드와 정의 코드를 분리합니다.
		// main이 있는 클래스는 실행만 하고
		// 실제 로직은 다른 .java파일에 저장합니다.
		
		// 커스텀 디자인 자료형은 (까만색으로 나오는 자료형)
		// 아래와 같이 new 자료형(); 문법으로 생성합니다.
		//#대입연산자의 경우 오른쪽을 먼저 실행하고 왼쪽으로 넘어감.  ★
		Person p1= new Person();//사설 자료형 생성
		// p1내부에 정의한 변수를
		// p1.변수명 = 대입할 값; 형태로 저장합니다.
		p1.name ="이창훈";
		System.out.println(p1.name);
		p1.age = 23;
		System.out.println(p1.age);
		p1.pNum ="01000000000";
		System.out.println(p1.pNum);
		p1.uNum = 7777777;
		System.out.println(p1.uNum);
		
		// 또 다른 사람을 하나 만들어봅니다.
		Person p2= new Person();
		
		p2.name="양윤수";
		System.out.println(p2.name);
		p2.age = 28;
		System.out.println(p2.age);
		p2.pNum = "01047567777";
		System.out.println(p2.pNum);
		p2.uNum = 7228;
		System.out.println(p2.uNum);
		
		Person p3=new Person();
		
		p3.name="후추";
		p3.age=3;
		p3.pNum="없음";
		p3.uNum=77;
		System.out.println(p3.name);
		System.out.println(p3.age);
		System.out.println(p3.pNum);
		System.out.println(p3.uNum);
				
		
				
}

}
