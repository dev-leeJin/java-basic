package arrays1;

import java.util.Arrays;

public class Arrays06 {

	public static void main(String[] args) {
		// 유니코드를 활용하는 모든 문자
		// 이모지도 가능(윈도우 + .)
		String[] arr= {"이창훈","李昌勳","😂😂","캐나다","こんにちは"};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}
