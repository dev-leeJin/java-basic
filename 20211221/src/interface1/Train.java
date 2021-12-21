package interface1;

// Vehicle을 구현하기 위해 implements 을 활용
public class Train implements Vehicle {
	
	private int speed;
	private int gas;
	private String name;
	
	public Train(String name) {
		this.speed = TRAIN_MIN;
		this.gas = MAX_GAS;
		this.name = name;
	}
	
	//오버라이드 해서 사용해야하는 구현메서드
	@Override
	public void accel() {
		if(speed+TRAIN_SPEED_PL > TRAIN_MAX_SPEED) {
			speed=TRAIN_MAX_SPEED;
		}else {
			speed += TRAIN_SPEED_PL;
		}
		gas -= TRAIN_GAS_MA;
		
	}

	@Override
	public void breakSpeed() {
		if(speed-CAR_SPEED_MA <TRAIN_MIN) {
			speed=TRAIN_MIN;
		}else {
			speed -= CAR_SPEED_MA;
		}
		
	}

	@Override
	public void reFuel() {
		speed = TRAIN_MIN;
		if(gas+70 > MAX_GAS) {
			gas =MAX_GAS;
		}else {
			gas += TRAIN_GAS_PL;
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("기관사 : " + name);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 연료량 : " + gas);
		System.out.println("====================");
		
		
	}

}
