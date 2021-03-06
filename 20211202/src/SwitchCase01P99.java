
public class SwitchCase01P99 {
     public static void main(String[] args) {
         // switch~ case 구문은 변수에 들어가는 자료가 case문에 제시된
         // 자료와 일치하는지 여부로 논리식을 실행합니다.
         // switch(변수){
    	 // case 값1:
    	 //     실행문;
    	 // case 값2...
    	 // }
    	 // 와 같이 작성합니다.
    	 // 마자믹에 default 문을 작성시 if~else문의 else처럼 기능합니다.
    	 
    	 //# switch~case 구문은 범위로 지정하는 것이 번거로움 ex)ifelseQ1
    	 
    	 int a =3;
    	 switch(a) {
    	 case 1: //a라는 변수에 1일 들어있는지 확인(첫번째케이스X)
    		 System.out.println("one");
    		  //각 케이스 종료시마다 break를 작성해야 줄줄이 실행되지 않음;
    	 case 2:
    		 System.out.println("two");
    		 
    	 case 3:
    		 System.out.println("three");
    		 break;
    	 case 4:
    		 System.out.println("four");
    		 
    	 case 5:
    		 System.out.println("five");
    		 
    		
         default :
    			 System.out.println("1~5가 아니네요.");
    	     ; //가독성을 위해 필요없지만 default에도 break를 작성하기도 함.
    	 }
}
}
