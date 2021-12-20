package static2;

public class Asean {
	// 출석 (cheak), 중간고사 (midTerm), 기말고사 (finalTerm)을 변수로 설정해주세요.
	// 위 변수들은 개별 객체가 따로따로 관리하는 변수들입니다.
	private int cheak;
	private int midTerm;
	private int finalTerm;
	
	// 공용 발표점수인 persentationScore를 static으로 만들어주세요.
	// 이 점수는 19점입니다.
	// public으로 설정하면 바로 System.out.println()으로 조회 가능하고 
	// private인 경우는 오로지 static 메서드를 통해서만 조회할 수 있습니다. ☆
	//public static int persentationScore = 19;//
	private static int persentationScore = 19; //private인 경우 힙쪽에서만 접근가능.
	
	// 생성자는 개체 생성시 출석, 중간고사, 기말고사 점수만 받아서 초기화합니다.
	public Asean(int cheak, int midTerm, int finalTerm) {
		this.cheak = cheak;
		this.midTerm = midTerm;
		this.finalTerm = finalTerm;
	}
	
	// 일반 메서드로 showAseanInfo()를 생성해주시되 성적 전체를 콘솔에 조회하게 해주세요.
	// 중간고사 : xx점, 기말고사 : yy점 ...
	public void showAseanInfo() {
		System.out.println("출석률 : "+ this.cheak +" 중간고사 : "+ this.midTerm 
							+ " 기말고사 : " + this.finalTerm );
						// 이 메서드는 힙쪽에 존재하는 메서드이기 때문에 스태틱도 접근가능
	}
	// private static은 같은 static영역에서 접근하도록 만들어야 합니다.
	public static void showPre() {
		System.out.println("발표점수 : " + persentationScore);
		//showAseanInfo()메서드에도 작성하면 접근가능하지만 new키워드를 만들어서 실행해야하므로
		//new키워드 없이 바로 생성 가능한 static의 장점을 잃게 된다.
		//그래서static메서드를 따로 생성해주면 정적영역에 메서드가 생기기 때문에 바로 실행 가능하다. ★
	}
	
	// 위 요소 정의 후 Main01P276.java를 생성해서 구성원 4명을 만들어서 활용해보세요.

}
