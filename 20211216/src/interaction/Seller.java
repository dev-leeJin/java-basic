package interaction;

public class Seller {
	
	private int money; //매출액
	private int mango; //재고(개수)
	
	//money는 초기값 0, mango는 입력받는다.
	public Seller(int mango) {
		this.money = 0;
		this.mango = mango;
	}
	
	// 망고개수를 입력받고 망고가 모자라면 모자라다는 메서드 작성 후 종료(doBattle과 유사)
	public void sellMango(int mango) {
		if(this.mango < mango) {
			System.out.println("망고가 모자랍니다. 현재 재고 : "+this.mango);
			return; //메서드 강제종료구문
		}
		this.mango-=mango;
		this.money =mango * 4000;
			
	}
	 // 현재 소지금 망고개수 확인
	public void showSeller() {
		System.out.println("=========판매자 정보=========");
		System.out.println("현재 소지금 : "+money+"망고 개수 : "+mango);
		System.out.println("===========================");
	}

	public int getMango() {
		return mango;
	}


}
