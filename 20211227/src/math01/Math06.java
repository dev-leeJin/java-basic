package math01;

public class Math06 {

	public static void main(String[] args) {
		// 가위바위보 게임을 만들어보겠습니다.
		// Math.random()을 이용해 1/3확률로 가위, 바위, 보를 부여받으며
		// 같은 요소가 나오면 무승부입니다.
		// 가위 바위 보를 뽑는 부분부터 작성해주세요.
		// 0 = 가위, 1 = 바위, 2 = 보
		int myValue	= (int)(Math.random()*3);
		int comValue	= (int)(Math.random()*3);
		
		//상수 활용으로 가독성 높이기
		final int SCISSORS = 0;
		final int ROCK = 1;
		final int PAPER = 2; 
		
		if((myValue == SCISSORS && comValue == PAPER) ||
			(myValue == ROCK && comValue == SCISSORS) ||
			(myValue == PAPER && comValue == ROCK)) {
			System.out.println("나의 승리입니다");
		}else if ((myValue == PAPER && comValue == SCISSORS) ||
				(myValue == SCISSORS && comValue == ROCK) ||
				(myValue == ROCK && comValue == PAPER)) {
			System.out.println("컴퓨터가 이겼습니다.");
		}else if (myValue == comValue) {
			System.out.println("무승부입니다.");
		}
		
		//#배열을 활용하여 결과값을 출력
		// 내가 낸 것과 컴퓨터가 낸 것을 숫자에서 문자로 치환해주는 배열
		String [] items = {"가위","바위","보"}; //인덱스 번호 0번째~2번째
		
		// 내가 낸 것과 컴퓨터가 낸 것을 출력해주는 부분
		System.out.println("내가 낸 것 : "+items[myValue]);
		System.out.println("컴퓨터가 낸 것 : "+items[comValue]);

		
		
		
		//#노가다식의 방식
		/*System.out.println("나 : "+myValue+" 컴퓨터 : "+comValue);
		if(myValue == comValue) {
			System.out.println("무승부입니다");
		}else if(myValue==0 && comValue==1) {
			System.out.println("컴퓨터의 승리입니다.");
		}else if(myValue==0 && comValue==2) {
			System.out.println("나의 승리입니다.");
		}else if(myValue==1 && comValue==0) {
			System.out.println("나의 승리입니다.");
		}else if(myValue==1 && comValue==2) {
			System.out.println("컴퓨터의 승리입니다.");
		}else if(myValue==2 && comValue==0) {
			System.out.println("컴퓨터의 승리입니다.");
		}else {
			System.out.println("나의 승리입니다.");
		} */  
		

	}

}
