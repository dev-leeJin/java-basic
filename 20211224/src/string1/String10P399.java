package string1;

import java.util.Scanner;

public class String10P399 {

	public static void main(String[] args) {
		//#가장 원시적인 형태의 로그인
		// 로그인 로직을 만들어보겠습니다.
		// 먼저 String id에 여러분이 설정한 아이디를 
		// String pw에 여러분이 설정한 임의의 비밀번호를 저장해주세요.
		// 다음 사용자에게 Scanner를 이용해
		// uId 변수에는 아이디를(사용자입력)
		// uPw 변수에는 비밀번호(사용자입력)를 받아서
		// 조건문을 이용해서 기존 id,pw가 입력받은 자료와 모두 일치하면
		// "xx님이 로그인 하셨습니다."
		// id는 일치하는데 비밀번호가 틀리면 "비밀번호가 틀렸습니다."
		// id가 일치하지 않으면 "회원 정보가 없습니다."
		// 라고 출력되도록 코드를 작성해주세요.
		
		String id = "dlckdgns00";
		String pw = "dlckdgns12";
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디 입력");
		String uId = scan.nextLine();
		System.out.println("비밀번호 입력");
		String uPw = scan.nextLine();
		
		if(id.equals(uId)) {
			if(pw.equals(uPw)) {
				System.out.println(id + "님이 로그인 하였습니다.");
			}else{
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}else 
			System.out.println("회원 정보가 없습니다.");
		
		//문자열 비교는 비교 연산자 ==가 아닌 객체 비교 메서드 .equals()를 사용한다.
		//else if문은 활용이 안되므로 &&로 조건을 여럿 하거나 if문 안에 if문을 또 작성하는 방법으로 사용한다. 
		

	}

}
