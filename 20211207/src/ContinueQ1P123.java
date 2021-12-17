import java.util.Scanner;

public class ContinueQ1P123 {

	public static void main(String[] args) {
		// 1부터 n까지 총합을 구하되 홀수끼리만 더한
		// 총합을 구하는 구문을 작성해주세요.
		// continue문을 반드시 사용하는 로직으로 작성해주세요.
		// n은 스캐너로 입력받습니다.
		
		Scanner scan= new Scanner(System.in);
		
		// 1.정수입력받기
		System.out.println("목표 정수를 입력해주세요.");
		int a= scan.nextInt();
		int count = 0;
		int total = 0;
		
		// 2.반복문 만들기
		while(count < a) {
			count += 1;
			//# 짝수만 만드려면 컨티뉴 없이도 count+=2를 해줘도 됌.
			// 3.짝수면 스킵 (★★★) (힌트: %, 짝수는 몇으로 나눴을 때 나머지가 0인 수?)
		    if(count%2 ==0) {
				continue;
			}
			// 4.홀수면 총합 더히기
			total += count;
			// 5.진행상황 콘솔에 찍기
			System.out.println("1부터"+ count +"까지 더했습니다.");
			System.out.println("총합은 "+ total+ "입니다.");
			
				
			
			}
		

	}

}
