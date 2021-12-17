package structure;

public class ClassMain02P196 {

	public static void main(String[] args) { //실행부
		Car a = new Car();
		
		a.model = "쉐보레";
		a.price = 2500;
		a.owner = "이창훈";
		
		Car b = new Car();
		
		b.model ="기아";
		b.price =1500;
		b.owner = "박치훈";
		
		a.getInfo();
		b.getInfo();

	}

}
