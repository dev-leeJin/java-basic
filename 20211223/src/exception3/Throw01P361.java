package exception3;

public class Throw01P361 {
	
	public static void main(String[] args) {
		// throw는 예외상황이 아니지만 예외를 강제로 발생시킵니다.
		// math.random() 은 0 <= 난수 < 1 범위를 가지는 난수를 발생시킵니다. (무작위)
		// 범위를 0~9로 만들고 싶다면? * (범위수 +1)
		System.out.println(Math.random() * 10);
		System.out.println((int)(Math.random() * 10)); // random*10을 한 후에 int로 바꿔주면 정수.
		
		int randomNum = (int)(Math.random() * 10);
		System.out.println("나온 난수값 : " + randomNum); //이런식으로 정리	
	
		
		try {
			if(randomNum > 3) {
				// 발생하지도 않은 ArrayIndexOutOfBoundsException 만들기
				throw new ArrayIndexOutOfBoundsException();
			}else {
				System.out.println("정상 범위 난수 발생");
			}
		}catch(Exception e) {
			System.out.println("없던 예외를 만들었습니다.");
			// 콘솔에 상세 예외 정보를 보여주는 구문입니다.
			e.printStackTrace();
		}
	
	
	}
	
	
	

}