
public class Binary03P75 {

	public static void main(String[] args) {
		// 5=>0000000 0000000 0000000 0000101
		// 3=>0000000 0000000 0000000 0000011
		// 비트 연산자는 비트 행 위 아래를 따져서
		// &는 위 아래가 모드 1인 경우만 1
		// |는 위 아래가 모두 0인 경우만 0
		// ^은 위 아래가 다를때만 1을 부여합니다.
		System.out.println(5 & 3); // 1
		System.out.println(5 | 3); // 7
		System.out.println(5 ^ 3);

	}

}
