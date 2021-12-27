package math01;

public class Math04 {

	public static void main(String[] args) {
		// Math.random()은 0이상 1미만인 난수를 구해줍니다.
		double a= Math.random();
		System.out.println(a);
		
		//50% 확률로 강화성공
		//30% 확률로 강화성공 =>0.7 70%=>0.3
		if(Math.random() > 0.5) {
			System.out.println("강화에 성공했습니다.");
		}else {
			System.out.println("강화에 실패했습니다.");
		}
		
		// 범위를 제한하고 싶은 경우(0이상 6미만) #일종의 공식
		int b = (int)(Math.random() * 6);
		System.out.println(b);
		
	}
	
	

}
