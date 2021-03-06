package polymorphism;

public class Main01P302 {

	public static void main(String[] args) {
		// 부모타입인 Person으로 자식인 Student까지 받을 수 있음.
		Person p1 = new Person("사람1",10);
		Person s1 = new Student("학생1",20,100); //#이렇게 작성하면 Person을 상속한 모든 타입(자식 타입)을 
												// 부모쪽에서 가져올 수 있다.
		
		// p1과 s1의 showPerson은 다르게 돌아갑니다.
		p1.showPerson(); // Person측 showPerson()호출
		s1.showPerson(); // Student측 showPerson()호출
		
		// 신분밝히기용 showStudent()를 호출시도해보세요.
		// s1.showStudent();
		
		// s1은 Person타입이므로 Person에 소속된 자원만 호출할 수 있습니다. ★★★

	}

}
