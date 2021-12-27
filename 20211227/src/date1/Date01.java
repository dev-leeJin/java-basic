package date1;

import java.text.SimpleDateFormat; //자동 생성
import java.util.Date; //변경

public class Date01 {

	public static void main(String[] args) {
		// Date는 날짜를 표현하는 클래스로 DB등과 통신할 때 
		// Date를 이용해 날짜자료를 받아오거나 넘겨주는것을 권장합니다.
		// 사용시 import java.util.Date를 해야합니다.
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(now);
		System.out.println(strNow);
		
		// 표현되는 양식을 바꿀 때 SimpleDateFormat을 활용합니다.
		// import를 추가로 해야합니다. ctrl + space를 활용해주세요.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm");
		//양식을 넣어줘야함. yyyy는 연도, MM은 월, dd는 일, hh는 시, mm은 분, ss는 초
		String strNow2 = sdf.format(now); //원래 만들었던 Date를 .format()에 넣어줌
		System.out.println(strNow2);
		
		//Q now 변수에 들어잇는 출력양식을 2021년 12월 27일 aa시 bb분 cc초로 변경해서 콘솔에 찍어주세요.
		//HH로 대문자로 작성하면 시간(0~23)로 표기되고 소문자로 하면 시간(1~12)로 표시된다.
		//(시간도 소문자 대문자로 표시방법 변경가능0)
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		String strNow3= sdf2.format(now);
		System.out.println(strNow3);
		
		//#우리나라는 그리니치 평균시(GMT) + 9H이다.

	}

}
