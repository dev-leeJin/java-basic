package overloading;

public class Main02 {

	public static void main(String[] args) {
		// 알바생 둘을 만들어주세요.
		// 하나는 시급을 15000원으로 해 주시고
		// 다른 하나는 입력 없이 생성해주세요.
		
		PartTimer p1 = new PartTimer(false, 15000, "카페", "이창훈" );
		
		PartTimer p2 = new PartTimer(true, "서울주막","한주윤");
		
		PartTimer p3 = new PartTimer(false, 1000, "주방", "노예" );

	}

}
