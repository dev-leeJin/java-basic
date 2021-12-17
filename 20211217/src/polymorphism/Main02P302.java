package polymorphism;

public class Main02P302 {

	public static void main(String[] args) {
		Person p1 = new Person ("아동", 7);
		Person s1 = new Student("학생" , 17, 90);
		Person o1 = new Officer("회사원", 28, 1500);
		Person j1 = new Jabless("백수", 24, 1);
		
		p1.showPerson();
		System.out.println("--------------------");
		
		s1.showPerson();
		System.out.println("--------------------");
		
		o1.showPerson();
		System.out.println("--------------------");
		
		j1.showPerson();
		System.out.println("--------------------");
		
		

	}

}
