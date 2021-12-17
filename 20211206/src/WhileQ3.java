import java.util.Scanner;

public class WhileQ3 {

	public static void main(String[] args) {
		// ForQ5P118을 While문을 사용하는 로직으로 고쳐보세요.
		// i, j변수, 조건식, 증감식 부분을 신경써서 옮겨주세요.
		Scanner scan = new Scanner(System.in);
		int a= scan.nextInt();
		
		int i=0;
		while(i<a) {
			int j=0;
			while(j<a) {
				System.out.print("* ");
			j++;
			}System.out.println();
			i++;
			}
		}

	}


