package collection1;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01P447 {

	public static void main(String[] args) {
		// List는 생성자료형으로 ArrayList, LinkedList를 받을 수 있고
		// 기본적으로는 ArrayList를 쓰게 됩니다.
		// java.utill의 List나 ArrayList를 사용할 수 있습니다.
		
		// List는 생성시 List<자료형> 을 적어넣어 해당 자료형을
		// 가변 길이 배열형태로 받아줄 수 있습니다. (길이를 넣을 필요가없음)
		// <>사이에는 기본자료형(int, double, boolean 등 (보라색 글씨))은 제네릭 자료에 올 수 없습니다.
		
		// 정수 자료를 받을 수 있는 리스트 생성(길이는 가변적)
		//#좌측에는 리스트 우측에는 어레이리스트를 작성
		List<Integer> list1 = new ArrayList<>(); // 빈 리스트 생성
		
		// 기본자료형이므로 추가하고싶은만큼 자료 추가 가능 //#100번지에 확장
		list1.add(1);
		list1.add(2);
		list1.add(3);
		System.out.println(list1);
		list1.add(10);
		System.out.println(list1);
		
		list1.add(1,100); //1번에 100을 넣는 로직
		System.out.println(list1);
		
		list1.set(1,99); //1번을 99로 교체하는 로직
		System.out.println(list1);

	}

}
