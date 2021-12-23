package system1;

public class TimeCheak01P384 {

	public static void main(String[] args) {
		// currentTimeMills의 자료는 long형에 저장해야 합니다.
		// 시작지점
		long start = System.currentTimeMillis();
		System.out.println("시작시간 " + start); //지금 시작하는 시간
		
		long all = 0;
		
		for(int i = 0; i < 2000000001; i++) {
			all += i;
		}
		System.out.println("1부터 20억까지 다 더하면 : " + all); //1부터20억까지 싹 다 더하라는 코드
		
		//끝나는 시점
		long end = System.currentTimeMillis(); //끝난 시간
		System.out.println("끝난시간 : " + end);
		System.out.println("소요시간 : " + (end - start)); //끝난시간에서 시작시간을 빼서 걸린 시간 확인
		
		//524의 소요시간 = 0.52초 //밀리세컨드

	}

}
