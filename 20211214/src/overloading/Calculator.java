package overloading;

public class Calculator {

	public void plus(int a) { // 파라미터값으로 int a만 요구
		System.out.println(a + "에 1을 더한 값은 " +  (a+1) + "입니다.");
	}
	
	public void plus(int a, int b) { // 파라미터값으로 int a, int b 요구
		System.out.println(a + "에" + b + "를 더한 값은 " + (a+b) + "입니다.");
	}
	public void plus(double a) { // 파라미터값으로 double a 만 요구
		System.out.println(a + "에 0.5를 더한 값은" + (a + 0.5)+ "입니다.");
	}
	public void plus(String a) {
		System.out.println("문자열은 연산대상이 아닙니다.");
	}
	
}
	// ex) plus(7) 을 넣으면 1번 호출.  plus(1.5)를 넣으면 3번 호출.