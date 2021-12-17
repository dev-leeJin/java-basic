import java.util.Scanner;

public class MethodQ1P204 {
	// 화씨온도를 입력하면 섭씨온도로 바꿔주는 메서드를 작성해보겠습니다.
	// 메서드 이름은 FToC이고, double을 리턴합니다.
	// 리턴받은 결과값은 main 메서드에서 System.out.println()으로 출력해주세요.
	// 화씨 = (섭씨 x 1.8) + 32
	// 1.양변에 32를 뺍니다.(변경된 식 => 화씨 -32 = 섭씨 x 1.8)
	// 2.양변을 1.8로 나눕니다. (변경된 식 => (화씨 -32)/ 1.8 = 섭씨
	Scanner scan=new Scanner(System.in);
	
	public static double FToC(double a) {
		return ((a-32)/1.8);
		
	}
	public static double FToC2(double a) {
		return ((a*1.8)+32);
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("화씨온도를 쓰려면 1을 섭씨온도로 쓰려면 0을 쓰시오");
	
		int f =scan.nextInt();
		if(f>0) {
		System.out.println("오늘의 화씨온도");
		double b= scan.nextDouble();
		
		double c = FToC(b);
		System.out.println("섭씨온도로 변환하면"+c+"입니다");
	

	}else {
		System.out.println("오늘의 섭씨온도");
		double g= scan.nextDouble();
		
		double u = FToC2(g);
		System.out.println("화씨온도로 변환하면"+u+"입니다.");
	}scan.close();

} }
