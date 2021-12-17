
public class Binary01P63 {

	public static void main(String[] args) {
		// 이항 연산자는 양 변에 하나씩 항목을 취하는 연산자입니다.
		// 산술연산자는 우리가 잘 알고 있는 사칙연산 등을 활용하기 위한
		// 연산자이며, 연산 우선순위도 그대로 계승합니다.
		// 단, % 연산자의 우선순위는 *,/와 동일합니다.
		// +,-,*
		System.out.println(3+5);
		System.out.println(17-21);
		System.out.println(2*3);
		// /는 왼쪽 수를 오른쪽 수로 나눠서 몫을 구합니다.(정수/정수=정수)
		System.out.println(7/2 ); //3.5를 정수로 바꿔서 출력
		// 둘 중 하나만 실수로 변경하면 강제로 실수로 변환(자동형변환)
		System.out.println(7/2.0);
		System.out.println((double)7/2);
		// %(나머지)는 정수 최대 몫을 구하고 남은 값만 출력합니다.
		System.out.println(10%4);
		// 연산자의 우선순위는 그대로 존재합니다. *,/뿐만 아니라 %도 포함한다.
		System.out.println(10+6%4);
		System.out.println((10+6)%4);

	}

}
