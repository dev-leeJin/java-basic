package exception3;

public class Exception03P355 {

	public static void main(String[] args) {
		// 다중 catch는 블럭 내부에서 여러 유형의 예외가 발생할 수 있을 때
		// 각각 예외유형을 다르게 처리할 때 사용합니다.
		// 이 때 catch구문을 여러번 사용할 수 있습니다.
		int[] number = {1, 2, 3, 4, 5, 0};
		
		// 예외가 발생할지도 모르는 코드부터 try블럭에 넣습니다.
		try {
			for(int i= 0; i < 6; i++) { //ArrayIndexOutOfBoundsException (예외의 이름) = 예외를 따로 분리
				System.out.println(number[i]);
			}
			System.out.println("0으로 나누기");
			System.out.println(number[4] / number[5]); //ArithmeticException
		
		}catch(ArrayIndexOutOfBoundsException a) { //ArithmeticException랑은 다형성으로도 상속으로도 
												   //연결되어 있지 않아서 호환이 되지 않아 Exception으로 넘어간다.
			System.out.println("범위를 벗어난 인덱스 번호를 입력했습니다");
		
		}catch(ArithmeticException b) {// ArithmeticException도 특별 처리를 해주세요
			System.out.println("0으로 나눌 수 없습니다. ");// 0으로 나눌 수 없습니다 라고 메세지가 남도록 해주세요
			
		}catch(Exception e) { //#여러 예외유형으로 처리할 경우 Exception을 제일 밑에 둔다 !!!
			// Exception e는 만능처리구문으로 어떤 예외도 다 일괄적으로 처리해줍니다.
			//#Exception은 모든 예외처리의 부모계층이기 때문에 다향성에 의해 만능으로 처리 가능.
			System.out.println("예외 발생");
		}
		

	}

}
