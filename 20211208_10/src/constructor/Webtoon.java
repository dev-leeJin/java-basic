package constructor;

public class Webtoon {
	public String name;
	public int series;
	public String painter;
	public boolean complete;
	
	
	public Webtoon(String n, String p) {
		name = n; //제목
		series = 1; //회차
		painter = p; //작가
		complete = false; //완결여부

		
	}
	public void getInfo() { //회차 정보 가져오기
		System.out.println("제목 : "+name+", 회차 : "+series );
		System.out.println("작가 : "+ painter + ", 완결여부 : "+complete);
	}
	public void uploadWebtoon() { //웹툰 업데이트시키기
		series += 1;
		if(series >=7) {
			System.out.println("시리즈가 종료되었습니다.");
		}
	}
	public void completeWebtoon() { //완결여부 확인
		if(series>=7) {
		complete = true;
	    
	}}
}
