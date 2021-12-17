package accessmodifier;

public class MainP197 {

	public static void main(String[] args) {
		// 전사를 하나 만들고 사냥을 3번 하세요.
		Warrior w1 = new Warrior("장성빈"); 
	    	// w1.hp = 1000000000; //= 조작이 가능하다는 문제가 발생. main쪽에서 고치는 방법이 필요
			// 1. hp를 package friendly로 바꾸면
			//    다른 패키지일 경우 접근 불가능.
			// 2. private일 경우 다른 클래스라 main지역에서 바꿀 수 없고 접근 불간능.
			//# 생성자와 메서드가 퍼블릭이기 때문에 리턴이 문제없이 작동됌.
			w1.hunt();
			w1.hunt();
			w1.hunt();
		}

	}


