package static1;

public class Main02P276 {

	public static void main(String[] args) {
		// static변수는 생성 없이도 활용할 수 있다.
		// main보다도 우선으로 생성되기 때문에 바로 힙의 정적영역의 메모리에서 소환. 
		System.out.println(StaticTest.num2); //이미 메모리에 생성이 되있기 때문에 바로 활용 가능
		
		//System.out.println(num2); = 스태틱테스트 안의 넘투만 생성가능.
		//System.out.println(StaticTest.num1); = 넘원은 뉴키워드로 만들어서 조회해야함.
		
		//static 메서드도 설정 가능하며 나머지 사항은 변수와 같습니다.
		StaticTest.cheak();
		
		//s1 생성 후 s1을 이용해 .cheak()를 호출해보세요.
		StaticTest s1 = new StaticTest();
		s1.cheak();
		//똑같이 실행되는 것을 볼 수 있음.

	}

}
