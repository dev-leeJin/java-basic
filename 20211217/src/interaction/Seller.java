package interaction;

public class Seller {
	
	private int money; //매출액
	private int mango; //재고(개수)
	private int grape;
	
	public Seller(int mango, int grape) {
		this.money = 0;
		this.mango = mango;
		this.grape = grape;
	}
	public void sellMango(int mango) {
		if(this.mango < mango) {
			System.out.println("망고가 모자랍니다. 현재 재고 : "+this.mango);
			return; 
		}
		this.mango-=mango;
		this.money =mango * 3000;
	}
	public void sellGrape(int grape) {
		if(this.grape < grape) {
			System.out.println("포도가 모자랍니다. 현재 재고 : "+ this.grape);
			return;
		}
		this.grape -= grape;
		this.money = grape * 5000;
	}
	public void showSeller() {
		System.out.println("=========판매자 정보=========");
		System.out.println("현재 소지금 : "+money+" 망고 개수 : "+mango + " 포도 개수 : "+grape);
		System.out.println("===========================");
	}

		public int getMango() {
		return mango;
	}

		public int getGrape() {
		return grape;
	}
	
	
}
