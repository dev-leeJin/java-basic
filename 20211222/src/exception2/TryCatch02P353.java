package exception2;

import java.util.Scanner;

public class TryCatch02P353 {
	public static void main(String[] args) {
		// 아까 exception1 패키지 내부에 여러 예외 유형 중
		// 하나를 골라서 예외가 발생할 수 있는 코드를 작성해주세요.
		// 발생할 예외에 대한 처리는 try~catch블록을 활용합니다.
		
		Scanner scan = null;
		
		try {
			scan.nextInt();
		}catch(Exception e){
			System.out.println("저장된 데이터가 없습니다.");
		}
		
		//---------------------------------------------//
		
		try {
			String a = "12zx";
			int b = Integer.parseInt(a);
			System.out.println(b);
		}catch(Exception e) {
			System.out.println("zx는 정수형으로 바꿀 수 없습니다.");
		}finally {
			System.out.println("모든 코드에 예외가 발생하였습니다.");
		}
		
		
		//----------------------------------------------//
		
		String[] name = {"김자바" ,  "제이에스피", "박스프링"};
		try {
			// 0 , 1, 2번 인덱스까지 가지는데 3까지 조회하도록 반목문 작성
			//# for(String n : name); sysout(n); //향상된 for문은 절대 인덱스를 오버할 수 없음.
			for(int i = 0; i < 4; i++) {
				System.out.println(name[i]);
			}}catch(Exception e) {
				System.out.println("초과 인덱스를 조회했습니다.");
			}finally {
				System.out.println("끝");
			}
		}
		
	}


