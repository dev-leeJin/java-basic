package interaction;

public class Buyer {
	
	private int money; //소지금액
	private int mango; //소지망고개수
	
	public Buyer(int money) {
		this.money = money;
		this.mango = 0;
	}
	
	//어떤 상인에게 몇개를 살지 
	public void buyMango(Seller seller, int mango) {
		//구매하려는 망고총액이 내 소지금을 넘어설경우
		if((mango*4000) > this.money) {
		System.out.println("돈이 모자랍니다. 소지금 : " + this.money);
		return; //강제중지
	} 	
		//판매자의 망고가 내가 구매하려는 망고보다 적은경우
		if(seller.getMango() < mango ) {
			System.out.println("망고재고가 부족합니다. 망고 재고 : " + seller.getMango());
			return;
		}
		//내 금액은 차감되고 망고가 늘어나는 로직
		this.money -= mango * 4000 ;
		this.mango += mango;
		//seller의 망고를 차감하고 돈을 올려주는 로직
		seller.sellMango(mango);
}	
	//소지 망고, 소지금을 볼 수 있다. 
	public void showBuyer() {
		System.out.println("=========구매자 정보=========");
		System.out.println("소지중인 망고개소 : "+mango+ ", 잔여금액 : "+money);
		System.out.println("===========================");
	}
}
