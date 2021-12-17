
public class Overflow {
public static void main(String[] args) {
	// 오퍼플로우는 표현할 수 있는 최대 숫자를 넘겨서 표현하면
	// 그 자료형으로 표현할 수 있는 최소값으로 초기와되는 현상을 의미합니다.
	// 아래와같이 -128~127 사이의 범위를 표현할 수 있는 byte의 최대 값인
	// 127을 넘겨버리면 최소 표현값인 -128부터 다시 수가 잡히는것을 볼 수 있습니다.
	// 다시 뒤로 돌아옴
	byte a = 127;
	byte b = 1;
	System.out.println((byte)(a+b));
	// byte를 안쓰면 int로 강제 변환이 된다.
	// 오버플로우를 방지하기 위해 long(큰 수)을 써버리는 대책이 있음.
}
}
