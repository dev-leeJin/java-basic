import java.util.Scanner;

public class ContinueQ1_2P123 {

	public static void main(String[] args) {
		// Q1을 for문으로
		
		Scanner scan =new Scanner(System.in);
		System.out.println("숫자입력");
		int a = scan.hashCode();
		
		int total = 0;
		
		for(int b=1; b<=a; b++) {
			if(b%2 ==0) {
			continue;
		}
		total +=b;
	}
		System.out.println("총합"+total);
	}

}
