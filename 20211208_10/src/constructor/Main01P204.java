package constructor;

public class Main01P204 {

	public static void main(String[] args) {
		// 자동차 한 대를 만들어주세요.
		// 연료량은 100
		// 속도는 0
		// 주인은 본인이름으로 만들어주세요.
		Car a =new Car(80,0,"장성빈"); //# 필수 입력값만 기입하고 고정 정보는 적지 않아도됌.
		// 생성자로 gas, speed, owner를 처리 // 실행부쪽이 깔끔해짐.
		//a.gas =100;
		//a.speed =0;
		//a.owner = "이창훈";
		
		// 차를 뽑자마자 먼저 상태 확인
		a.getInfo();
		// 엑셀을 두 번 밟아주세요
		a.accelSpeed();
		a.accelSpeed();
		// 상태 다시 확인
		a.getInfo();
		// 브레이크를 밟아주세요
		a.breakSpeed();
		// 상태 다시 확인
		a.getInfo();
		// 개솔린 충전
		a.putGas();
		// 상태확인
		a.getInfo();
		

	}

}
