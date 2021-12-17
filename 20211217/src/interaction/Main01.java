package interaction;

public class Main01 {

	public static void main(String[] args) {
		Seller s1 = new Seller(30 , 30);
		Buyer b1 = new Buyer(100000);
		
		s1.showSeller(); //상인1정보
		b1.showBuyer(); //구매자1정보
		
		// 포도 5개와 망고 3개 구입
		b1.buyGrape(s1, 5);
		b1.buyMango(s1, 3);
		
		System.out.println("--------구매 후 결과-------");
		s1.showSeller();
		b1.showBuyer();
		

	}

}
