package interaction;

public class Buyer {
	
	private int money; //소유금액
	private int mango; //소지 망고 개수
	private int grape; //소지 포도 개수
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
		this.grape = 0;
	}
	
	public void buyMango(Seller seller, int mango) {
		if((mango*3000) > this.money) {
			System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
			return; 
		}if(seller.getMango() < mango ) {
			System.out.println("망고재고가 부족합니다. 망고 재고 : " + seller.getMango());
			return;
		}
		this.money -= mango * 3000 ;
		this.mango += mango;
		//seller의 망고를 차감하고 돈을 올려주는 로직
		seller.sellMango(mango); 	
	}
	public void buyGrape(Seller seller, int grape) {
		if((grape*5000 > this.money)) {
			System.out.println("돈이 모잡랍니다. 소지금 : " + this.money);
			return;
		}if(seller.getGrape() < grape) {
			System.out.println("포도재고가 부족합니다. 포도 재고 : " + seller.getGrape());
		}
		this.money -= grape * 5000 ;
		this.grape += grape;
		seller.sellGrape(grape);	
	}
	public void showBuyer() {
		System.out.println("=========구매자 정보=========");
		System.out.println("소지중인 망고개수 : "+mango+ " 포도 개수 : " + grape + ", 잔여금액 : "+money);
		System.out.println("===========================");
	}
}
