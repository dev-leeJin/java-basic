package garbagecollecting;

public class MainP201 {

	public static void main(String[] args) {
		// 6개 객체 생성
		Item i1 = new Item(1);
		Item i2 = new Item(2);
		i2 = null;
		Item i3 = new Item(3);
		// 메모리 중간에 회수하도록 강제 명령
		System.gc();
		Item i4 = new Item(4);
		i4 = null;
		Item i5 = new Item(5);
		i1 = null;
		System.gc();
		Item i6 = new Item(6);
		//System.gc();가 현재로는 한번도 성공못함.
		//간혹가다 될 때도 있음. 
		//자동으로 처리가 되기 때문에 쓸 필요가 없음.

	}

}
