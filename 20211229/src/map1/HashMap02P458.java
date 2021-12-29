package map1;

import java.util.HashMap;
import java.util.Map;

public class HashMap02P458 {

	public static void main(String[] args) {
		// Q 식당 메뉴판을 만들어보세요.
		// key는 음식이름, value는 가격(정수)로 저장해주세요.
		// 메뉴는 5개 이상 집어넣어주세요.
		// 메뉴를 3개 조회해서 화면에 출력해주세요.
		// String Integer 대신에 Object기입도 가능. 
		Map<String, Integer> map = new HashMap<>();
		map.put("제육덮밥", 6000);
		map.put("소고기덮밥",9000);
		map.put("김치찌개", 5000);
		map.put("회덮밥",10000);
		map.put("삼겹살", 12000);
		
		System.out.println(map.get("삼겹살"));
		System.out.println(map.get("제육덮밥"));
		System.out.println(map.get("김치찌개"));
		

	}

}
