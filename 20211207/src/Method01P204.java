
public class Method01P204 {
	
	public static void add(int a) {
		// void는 결과물 없을 의미함
		// add라는 이름은 main내부에서 호출해야만 사용이 가능함
		// int a 자료를 호출시에 제공해야 내부 문자을 실행할 수 있음
		
		//# 자기 지역의 a를 씀. 20은 위의 괄호 안으로 전달된거임.
		System.out.println(a + 1);
	}

	public static void main(String[] args) {
		// method는 자주 사용할 코드를 특정한 이름으로 붙여둔 것 입니다.
		// method 내부에는 불완전한 코드가 들어올 수 있습니다.
		// -method는 이 불완전한 코드를 완성시킬 자료를 요청할 수 있습니다.-
		// method는 실행 결과물을 약속해야 사용할 수 있고,
		// 실행 결과물이 있다면 , return문을 이용해 약속된 실행결과물을
		// 호출 위치로 보내줍니다.
		// method는 main 외부에 작성합니다.
		
		//#add() -소괄호-가 붙어있음 다른 메서드 소환. 다른 지역으로 이동.
		//#add지역이 끝나면 스택에서 데이터를 확보하기 위해 add구역을 삭제시키고 다시 메인지역으로온다.
		add(20);

	}//# 메인지역에서 실행할거 없는거 확인하고 메인 종료

}
