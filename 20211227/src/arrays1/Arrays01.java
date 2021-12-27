package arrays1;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// 이진 탐색(binary search)은 탐색 알고리즘중
		// 상위권의 성능을 보여주는 알고리즘입니다. (최고의 탐색 성능) (2가지의 전제조건을 만족시켜야 사용 가능)
		// 1. 배열 내부에 중복되는 값이 없을것
		// 2. 배열이 오름차순(작은 숫자일수록 0번인덱스에 가깝게)이어야 함
		
		// 정렬이 안 된 상태의 배열 내부를 탐색할 때는 찾지 못함
		//#센터값 3번인덱스(1)보다 0이 작기 때문에 오른쪽을 다지움(0도 지워짐)
		//#왼쪽값 탐색중 0이 안나옴 (만약 0이 센터값보다 왼쪽에 있음 찾아지긴함) 
		int[] arr1  = {5, 7, 6, 1, 3, 9, 0, 12};
		
		// 이진탐색 수행 명령어 : Arrays.binarySearch(배열명, 찾는값);
		int a = Arrays.binarySearch(arr1, 0);
		System.out.println(a);
		
		// 정렬이 된 상태의 배열을 탐색하는 경우
		int[] arr2 = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
		
		int b = Arrays.binarySearch(arr2, 14);
		System.out.println(b); //7번 인덱스라고 찾아짐.

	}

}
