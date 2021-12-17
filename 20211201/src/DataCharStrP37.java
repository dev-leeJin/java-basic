
public class DataCharStrP37 {

	public static void main(String[] args) {
		// 문자 자료형은 크게 두 가지로
		// 단일 문자인 char('문자')
		// 문자 배열인 String("문자열...")
		// 이 존재하며 보통은 String만 씁니다.
		char a ='a';
		String b = "문자열입니다.";
		// char c = "문자열"; // 문자열과 단일문자는
		//String d = 'd'; // 서로 다른 자료형으로 간주
		System.out.println(a);
		System.out.println(b);
        // String은 기본자료가 아니기 때문에 앞에 대문자가 들어가야된다는 차이가 있음
		// String에 char도 포함되어있기 때문에 통합해서 쓰면 됌
	}

}
