import java.util.Scanner;

public class ForQ3P112 {

	public static void main(String[] args) {
		// 구구단을 작성해보겠습니다.
		// Scanner를 이용해서 int dan 에 정수를 받아주세요.
		// dan변수에 2~9 사이에 값이 들어왔는지 확인해서
		// 2~9 라면 구구단 결과값을 보여주고,
		// 그렇지 않다면 "구구단의 유효 범위는 2~9단입니다."
		// 라는 안내문구가 나오도록 작성해주세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("2~9단 사이에 숫자를 입력해주세요.");
		int dan=scan.nextInt();
		
		// if(1<dan<10)은 불가능하다. 이항연산자이기 때문에 1<dan이 이항으로 성립해서
		// 가져가기 때문에 10이라는 숫자가 혼자 남는다. 
		if( 1 < dan && dan < 10) {
			for(int i = 1; i < 10; i++) {
				System.out.println(dan+ "*" + i + "=" + dan*i);
			}
		}else {
			System.out.println("수의 범위는 2~9로 넣어주세요.");
		}
		

	}

}
