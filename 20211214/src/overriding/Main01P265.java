package overriding;

public class Main01P265 {

	public static void main(String[] args) {
		
		Cat c1= new Cat();
		c1.name = "후추";
		c1.age = 3;
		c1.gender = "남";
		c1.color = "회색";
		
		c1.howl();
		c1.getInfo();
		
		Dog d1 = new Dog();
		d1.name = "에리";
		d1.age = 3;
		d1.gender = "여";
		d1.size = "big";
		
		d1.howl();
		d1.getInfo();
				
				

	}

}
