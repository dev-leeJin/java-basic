
public class ContinueQ2P123 {

	public static void main(String[] args) {
		// 다음은 학생들의 과목별 성적입니다.
		// math = 96, 23, 52, 82, 72, 31, 58
		// eng = 62, 42, 68, 31, 80, 77, 45
		// com =10, 28, 39, 74, 65, 90, 98
		// 각 과목별 평균점수를 내주시되, 합격자 평균만 내주세요.
		// 합격점수는 60점 입니다.
		int [] math = {96, 23, 52, 82, 72, 31, 58};
		int [] eng = {62, 42, 68, 31, 80, 77, 45};
		int [] com = {10, 28, 39, 74, 65, 90, 98};
		
		// 1. 총점 변수와 합격자수 변수 생성
			int total1 =0;
			int total2 =0;
		// 2. 반복문 실행 (향상된 for문 권장)
		for(int a : math) {
			// 3. 검사해서 60점 미만이면 continue
			if(a < 60) {
				continue;
				// 4. 60점 이상이면 합격자수 +1, 총점에 합격점수 더하기
			}else { //# else는 굳이 필요없음.
				total2++;
				total1+=a;
			}
	
		}
		// 5. 다 돌고 나오면 총점 / 합격자수 로 합격자평균 내기
		System.out.println("수학 평균 : "+ total1/total2);
		
		total1=0;  // 한 코드에 두개의 같은 문서가 들어갈수 없음. intx
	    total2=0;
	    
	    for(int a:eng) {
	    	if(a<60) {
	    		continue;
	    	}
	    	total2++;
	    	total1+=a;
	    } System.out.println("영어 평균 : "+ total1/total2);
	    
		total1=0;  
	    total2=0;
	    
	    for(int a:com) {
	    	if(a<60) {
	    		continue;
	    	}
	    	total2++;
	    	total1+=a;
	    } System.out.println("컴퓨터 평균 : "+ total1/total2);


	}

}
