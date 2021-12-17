package lnheritance;

// Person을 상속해서 Salaryman을 만들어보세요.
// 샐러리맨은 연봉(salary)를 가집니다.
// getSalaryInfo()로 상태를 조회할 수 있습니다.
public class Salaryman extends Person {
	
	public String salary;
	
	public void getSalaryIno() {
		System.out.println("샐러리맨의 이름은 "+ name + "입니다. 나이는 " + age + "이고 연봉은 "+salary+"입니다.");
	}
	
	

}
