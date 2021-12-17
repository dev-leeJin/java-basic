package structure;

public class Structure03P190 { // Cat의 실행부

	public static void getCatInfo(Cat a) { //# 메서드 명은 알아볼수 있는 동사형으로 쓰면 좋다
		System.out.println("이름 : " + a.name + ", 나이 : " + a.age + ", 색 : " + a.color + ", 성별 : " + a.gender);
	}
	
	
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.name = "후추";
		cat1.age = 3;
		cat1.color = "회색";
		cat1.gender = "남";
		
		Cat cat2= new Cat();
		cat2.name = "유부";
		cat2.age = 4;
		cat2.color = "노란색";
		cat2.gender = "남";
		
		getCatInfo(cat1);
		getCatInfo(cat2);
				
		

	}

}
