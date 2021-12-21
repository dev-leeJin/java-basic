package interface1;

public class Airplane implements Vehicle {
	private int speed;
	private int gas;
	private String name;
	
	public Airplane(String name) {
		this.speed = AIRPLANE_MIM;
		this.gas = AIRPLANE_MAX_GAS;
		this.name = name;
		
	}

	@Override
	public void accel() {
		if(speed+AIRPLANE_INCREAT_SPD >  AIRPLANE_MAX_SPEED) {
			speed = AIRPLANE_MAX_SPEED;
		}else {
			speed += AIRPLANE_INCREAT_SPD;
		}
		gas -= AIRPLANE_DECREAT_GAS;
	}

	@Override
	public void breakSpeed() {
		if(speed-AIRPLANE_DECRENT_SPD < AIRPLANE_MIM ) {
			speed =AIRPLANE_MIM;
		}else {
			speed -= AIRPLANE_DECRENT_SPD;
		}
		gas -= AIRPLANE_DECREAT_GAS;
	}

	@Override
	public void reFuel() {
		if(gas+AIRPLANE_INCREAT_GAS > AIRPLANE_MAX_GAS) {
			gas = AIRPLANE_MAX_GAS;
		}else {
			gas += AIRPLANE_INCREAT_GAS;
			System.out.println("기장 : " + name);
			System.out.println("현재 속도 : " + speed);
			System.out.println("현재 주유량 : " + gas);
			System.out.println("=====================");
		}
		
	}

	@Override
	public void showStatus() {
		System.out.println("기장 : " + name);
		System.out.println("현재 속도 : " + speed);
		System.out.println("현재 주유량 : " + gas);
		System.out.println("=====================");
		
	}

}
