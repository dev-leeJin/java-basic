import java.util.Arrays;

public class EnhancedFor01P162 {

	public static void main(String[] args) {
		// 향상된 for문은 반복문 진행시 타겟으로 배열을 넣습니다.
		// 이 경우 반복실행 횟수는 배열의 내부요소 갯수만큼입니다.
		
		// 7개의 요소를 묶어서 arr1에 저장
		int [] arr1 = {100, 211, 339, 475, 591, 600, 700};
		// arr1[순번] 을 입력해서 내부 요소를 하나만 꺼낼 수 있음(순번은 0부터 시작)
		System.out.println(arr1[5]);
		System.out.println(Arrays.toString(arr1));
		// for(하나씩받을변수 : 배열){
		//      실행문들...;
		// }
		
		// 배열 내부 요소의 개수는 배열명.length로 확인할 수 있다.
		System.out.println("배열 내부 요소 객수");
		System.out.println(arr1.length);
		
		
		for(int item: arr1) {
			System.out.println(item);
			// 한 번 소모된 아이템은 다시 쓸수 없고 다음값으로 넘어감.(7바퀴 실행)
		}
		//향상된 for문 이전//
		//for(int i =0; i<7; i++) {
		//	System.out.println(arr1[i]);
		//}
		// 단점: arr1에 숫자가 추가되거나 누락 될 경우 (i<7)제약이 걸려있어 나오지 않음.
		//     2군대를 수정해야만 정확한 결과값이 나옴.
		
		// 7자리에 lenght를 적어주면 향상된 for문이 없어도 수정하지 않아도 됌.
	}

}
