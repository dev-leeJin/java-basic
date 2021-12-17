import java.util.Scanner;

public class Scanner01P93 {

	public static void main(String[] args) {
		// 코드 실행 중 사용자의 입력을 받게 하고 싶은 경우 스캐너 기능을 사용합니다.
		// 아래 Scanner 라고 적은 부분에 마우스를 갖다대고 import를 해주세요.
		// # scan도 적어줘야됌 그리고 new Scanner(System.in); 외워서 입력해야됌.
		Scanner scan = new Scanner(System.in);  //고정
			
	    // 정수 하나를 입력받음
		// # 내가 콘솔에 입력한 값이 여기에 저장이 됌
		// # scan.nextInt();도 외워야됌.
	    int a = scan.nextInt();
        
	    // 입력받은 정수 출력
	    // # enter을 누르면 내가 입력한 값이 콘솔에 적힘.
	    System.out.println(a);
	    
	    scan.close();
	}

}
