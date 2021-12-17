package constructor;

// 농구선수를 자바 내에서 구현
public class BasketballPlayer {
	
	public double height; //키
	public int jumpHeight; //점프력
	// 변수명은 첫단어 첫글자는 소문자,이후 단어 첫글자는 대문자 나머지는 소문자로 작성하는것이 규칙.
	// 위 표기법을 카멜케이스라고 부릅니다.
	
	// 생성자 생성
	public BasketballPlayer(double a, int b) {
		height = a;
		jumpHeight = b;
		System.out.println("생성된 선수 키 : "+ a + "점프력 : "+b);
		
	}
	// 덩크슛하기 라는 행동을 작성
	public void dunkShoot() {
		if((height + jumpHeight) > 300) { //a+b로 해서 처음에 실패햇음.
			System.out.println("플레이어는 덩크슛에 성공했습니다");
			
		}else {
			System.out.println("골대에 닿지 않았습니다.");
		}
			
	}

}
