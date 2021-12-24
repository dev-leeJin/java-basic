package stringbuilder1;

public class Builder05P408 {

	public static void main(String[] args) {
		// 다음 문자열의 문자를 0번부터 시작해서 3번째마다 삭제해주세요.
		// 힌트 :  반목문을 쓰세요.
		
		// 문자열은"abcdefghijklmnopqrstuvwxyz" 입니다.
		
		StringBuilder a = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		

		
		for(int i=3 ; i < a.length(); i+=3) {
		//	if(i % 3 == 0) { //if문 지우고 i+=3;도 가능(i=0)
				a.deleteCharAt(i); //3을 나눴을때 나머지가 0이되는 3의 배수를 한번에 지움.
		//	}
		}System.out.println(a);

	} //int b=0;
	  //while( b < a.length()) {
	  //b += 3;
	  //a.deletCharAt(b);
	  //System.out.println(a);   
	
	//마지막 반복문을 생각해보면 와일이 트루여서 통과가 됐는데 없는 초과숫자를 삭제하라는 명령에 에러가 뜸.
	//b += 3;을 삭제 후에 넣으면 됌.(삭제 후 더하기로 순서변경)

}
