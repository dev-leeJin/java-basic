package abstract1;

// Parent를 상속
public class Child extends Parent{//#Child는 반드시 추상 메서드인 getAge()를 실행해줘야 한다는 에러발생

	@Override
	public void getAge() {
		System.out.println("부모쪽 나이는 Private입니다.");
		
	}

//Child에 마우스를 갖다대고 'Add unimplemented methods'를 클릭하면
	//자동으로 getAge() 메서드 생성


}
