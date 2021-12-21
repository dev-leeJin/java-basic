package interface1;

// 인터페이스는 interface 선언을 사용합니다.
// 내부에는 상수인 값과 추상메서드만 선언할 수 있습니다. // 변수 불가능
// 애초에 구현(implements)을 전제로 설계되기 때문에 //미완성을 완성
// 일반 변수, 메서드를 내부에 선언할 수 없습니다.
// 다형성에서는 부모클래스 역할을 합니다.
public interface Vehicle { //애초에 클래스가 아닌 인터페이스로 만듬. 인터페이스에는 I가 붙음
	// 최대 연료량, 공용(최저속도), 최대속도, 연료증가량, 연료 감소량, 속도 증가량, 속도 감소량
	// 바로 상수로 잡힙니다.
	int MAX_GAS = 100;
	int CAR_MIN = 0;
	int CAR_MAX_SPEED = 200;
	int CAR_GAS_PL = 30;
	int CAR_GAS_MA = 1;
	int CAR_SPEED_PL =10;
	int CAR_SPEED_MA = 10;
	
	int TRAIN_MIN =0;
	int TRAIN_MAX_SPEED = 300;
	int TRAIN_GAS_PL = 70;
	int TRAIN_GAS_MA = 7;
	int TRAIN_SPEED_PL = 50;
	int TRAIN_SPEED_MA = 50;
	
	// 비행기 전용으로 만드는 상수
	int AIRPLANE_MIM =0;
	int AIRPLANE_MAX_GAS =1000;
	int AIRPLANE_MAX_SPEED = 900;
	int AIRPLANE_INCREAT_SPD = 400;
	int AIRPLANE_DECRENT_SPD = 300;
	int AIRPLANE_INCREAT_GAS = 500;
	int AIRPLANE_DECREAT_GAS = 150;
	
	
	// 탈 것이라면 가지고 있을 공통적 기능을 전부 추상메서드로 작성
	// {
	// 		실행문...
	// }
	// 와 같이 실행문 부분(메서드의 body) 없이 선언만 해주세요.
	public void accel(); //가속
	public void breakSpeed(); //감속
	public void reFuel(); //주유
	public void showStatus(); //계기판 조회

}
