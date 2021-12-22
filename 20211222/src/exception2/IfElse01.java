package exception2;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		//#원시적인 형태의 예외처리 방법 
		//#단점 : 예외처리는 가능하지만 예외처리를 위한 조건문인지 아닌지 구별이 어려움.
		// int a, b에 스캐너로 각각 정수를 입력받아주세요.
		// a / b의 결과를 콘솔에 띄워주시되
		// b가 0인지 검사해서 0인 경우는
		// a / b를 하지말고 0으로 숫자를 나눌 수 없습니다.
		// 라는 경고만 띄우도록 만들어주세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1번 정수 입력");
		int a = scan.nextInt();
		System.out.println("2번 정수 입력");
		int b = scan.nextInt();
		if(b == 0) {
			System.out.println("0으로 숫자를 나눌 수 없습니다.");
		}else {
			System.out.println(a / b);
		}
		
		
		

	}

}
