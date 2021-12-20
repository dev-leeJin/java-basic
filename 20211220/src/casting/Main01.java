package casting;

public class Main01 {

	public static void main(String[] args) {
		// Animal 타입은 어떤 자료형이건 받을 수 있다.
		// Cat, Dog, Animal을 하나씩 만들어주세요.
		// Animal c1, d1, a1으로 받아주세요.
		Animal c1 = new Cat ("후추",3);
		Animal d1 = new Dog("애리",3);
		Animal a1= new Animal("동물",10);
		//c1, d1, a1에 sit()을 각각 호출해주세요.
		c1.sit();
		d1.sit();
		a1.sit();
		// c1.howl(); Cat에만 있는 자원에 접근불가능.
		
		//각 자료형에 맞는 변수로 바꿔서 대입.
		Cat cat = (Cat)c1; // c1은 Animal타입이지만 힙에 저장된 데이터가 Cat이므로 Cat으로 변환 가능
		cat.howl();
		//c1이랑 같은 주소를 가지고 있지만 케스팅을 하면 켓영역을 접근가능
		
		Dog dog = (Dog)d1;
		dog.eat();
		//에니멀 타입으로만 만들면 도그영역에 접근이 불가능하지만(오버라이딩 제외)
		//도그 타입으로 만들면 에니멀과 도그영역을 둘 다 가지고 있다(힙) 그래서 둘 다 접근이 가능해짐. 
		
		

	}

}
