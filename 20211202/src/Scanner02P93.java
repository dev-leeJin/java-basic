import java.util.Scanner;

public class Scanner02P93 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//문자열을 입력받는 경우
		// String name = scan.nextLine();
		System.out.println("이름을 입력해주세요 :");
	  String name = scan.nextLine(); //문자  //#공백을 포함하지 않기 때문에 next()로만 해도 됌.
	  System.out.println("이름 :" + name);
		//# 더하기로 부연설명을 추가 시킬 수 있다
	  
		// 실수를 입력받는 경우
		// double height = scan.nextDouble();
		System.out.println("나이를 입력해주세요 :");
      double height = scan.nextDouble(); //실수
      System.out.println("나이 :" + height);
      
      scan.close();
		
		//System.out.println(name);
		//System.out.println(height);

	}

}
