package structure;

public class ClassMain01P196 {
	// PersonClass의 메서드는 작성할 필요가 없다. 
	// 이미 PersonClass의 내부에 필요한 메서드를 PersonClass파일에 다 작성해놨기 때문.
	
	public static void main(String[] args) {
		// 사람을 두 명 만들어 보세요.
		PersonClass a=new PersonClass();
		
		a.name = "이창훈";
		a.age = 23;
		a.pNum = "01049211920";
		a.uNum = 7;
		a.gender = "남";
	
		PersonClass b=new PersonClass();
		
		b.name="양윤수";
		b.age =28;
		b.pNum="01047567777";
		b.uNum =8;
		b.gender ="여";
		
		// 만든 사람 두 명의 정보를 콘솔에 찍어보세요.
		// 힌트 : getInfo의 소속은? : a소속 PersonClass or b소속 PersonClass 
		a.getInfo(); //# a주소 번지의 getInfo 
		b.getInfo(); //# b주소 번지의 getInfo
		
		//# 메서드이기때문에 가로;는 쳐줘야함.
		//# PersonClass에는 5개뿐만 아니라 getInfo까지 6개의 자료가 들어감. 
		//# 메서드도 소속이 생김.
} 
}