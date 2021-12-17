import java.util.Scanner;

public class WhileQ1P105 {

	public static void main(String[] args) {
		// 스캐너를 이용해서 String num 변수에
		// "문자열 형태인 숫자" 를 입력받게 해주세요.(scan.nextLine()으로 문자열 입력받기)
		// 이 문자자료 num을 int loop 변수에 Interger.parseInt()로 정수변환해 저장하세요.
		// loop 변수에 입력된 정수 횟수만큼
		// "반복문을 실행합니다." 라는 문장이 콘솔에 출력되도록
		// while문을 작성해주세요.
		
		//실패
		//Scanner scan= new Scanner(System.in);
		//String num = scan.nextLine();
		//System.out.println(num);
		
		//int loop = Integer.parseInt(num);
		
		//while(loop>loop);
		//   loop+=1;
		//	System.out.println(loop + "반복문을 실행합니다.");
		
		// 정답
		Scanner scan= new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		String num = scan.nextLine();
		int count = 0;
		
		int loop= Integer.parseInt(num);
		while(count < loop) {
			count += 1;
			System.out.println("반복문을 실행합니다. " + count);
		}
		}
		
		
		

	}


