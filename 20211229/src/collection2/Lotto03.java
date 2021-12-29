package collection2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto03 {

	public static void main(String[] args) {
		// 로도복권 당첨 시뮬레이터를 만들어주세요.
		// 1. 당첨번호 6개를 뽑습니다.
		// 2. 추첨번호 6개를 뽑습니다.
		// 3. 당첨번호와 추첨번호를 비교해서 일치하면 반복 중지
		// 4. 3에서 일치하지 않으면 반복횟수를 1 더하고 다시 추첨번호 6개를 뽑고
		// 이어서 비교해서 일치여부 검사
		List<Integer> lotto = new ArrayList<>();
		List<Integer> luckyNum = new ArrayList<>();
		
		int num = 0; //당첨번호
		int num2 =0; //추첨번호
		int count =0; //반복문 횟수
		
		while(lotto.size() != 6) {
			num = (int)(Math.random() * 45)+1;
			if(!lotto.contains(num)) {
				lotto.add(num);
			}
		}Collections.sort(lotto);
		
		while(! lotto.equals(luckyNum)) {
			luckyNum.clear(); //★
			while(luckyNum.size() != 6) {
				num2 = (int)(Math.random() * 45)+1;
				if(!luckyNum.contains(num2)) {
					luckyNum.add(num2);
				}
			}Collections.sort(luckyNum);
			System.out.println("" + lotto + luckyNum);
			System.out.println(lotto.equals(luckyNum));
			count++;   // 모든 로직이 끝난 시점이 번호를 1세트 뽑은 시점임
			  		   // 그러므로 모든 로직이 다 끝나고 마지막에 1을 더해줌.
		} 
		// 반복문이 몇 바퀴 돌았는지 카운팅하는 로직을 위에 추가해주세요.
		// 저의경우는 반복문 진입 전에 int count = 0; 을 만들어놓고
		// 반복문이 한 바퀴 돌 때 마다 count++; 를 이용해 1씩 증가시켜놓고
		// 탈출 후에 콘솔에 최종 횟수만 찍히도록 합니다. 
		System.out.println(count + "번의 시도 후 당첨");
		
		
		

	}}
