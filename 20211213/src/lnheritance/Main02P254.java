 package lnheritance;

public class Main02P254 {

	public static void main(String[] args) {
		// 여기에 학생 하나와 샐러리맨 하나를 임의로 만들어보세요.
		// 샐러리맨에는 본인 이름과 희망 연봉을 적어주세요.
		// 학생은 그냥 알아서 작성해주세요.
		
		Student s2 = new Student();
		s2.name = "학생2";
		s2.age = 19;
		s2.stuNum = 17;
		
		s2.getInfo();
		s2.getStudentInfo();
		
		Salaryman m1= new Salaryman();
		m1.name = "이창훈";
		m1.age = 24;
		m1.salary = "2억";
		
		m1.getInfo();
		m1.getSalaryIno();
				

	}

}
