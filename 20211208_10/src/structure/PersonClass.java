package structure;

public class PersonClass {//    //# -클래스 설계-
	// 사람 정보를 Person에서 만들었던 것처럼 만들어주시되
	// 여러분들이 추가하고 싶은 특성을 하나 더 추가해서 만들어주세요.
	public String name;
	public int age;
	public String pNum;
	public int uNum;
	public String gender;
	
	// 추가로 아까의 조회 메서드를 내부에 생성해주세요.
	// 클래스 내부에 생성할때는 static을 적지 않습니다. ★
	// 클래스는 자기와 같은 지역에 있는 요소를 소속 없이 조회 가능합니다.
	public void getInfo() { //# 같은 소속(지역)에 있는 정보이기 때문에 굳이 명시가 필요하지 않다.ex)Person p, p.name
		System.out.println(name +"님의 정보를 조회합니다.");
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 연락처 : " + pNum + ", 번호 : " + uNum +", 성별 : " + gender);
		System.out.println("=======================");
	}
}//    //# 클래스와 메서드의 지역이 다르면 Structure02P190처럼 (소속) 언급을 해줘야한다.
	   //# 클래스와 메서드의 지역이 같으면 언급을 하지 않아도 된다. 

       //# main 지역이 없으면 실행이 안되기 때문에 가장 최근에 실행했던 main 지역의 결과값이 뜬다. 