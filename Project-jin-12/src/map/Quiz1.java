package map;

import java.util.HashMap;

public class Quiz1 {

	public static void main(String[] args) {
		HashMap<Character, String> aa = new HashMap<>();
		
		aa.put('a', "사과");
		aa.put('b', "바나나");
		aa.put('c', "코코넛");
		
		System.out.println("데이터를 추가해주세요");
		System.out.println(aa);
		
		System.out.println("b인 값을 출력하세요");
		System.out.println("b키 값: "+aa.get('b'));
		
		System.out.println("바나나를 블루베리로 변경해주세요");
		aa.replace('b', "블루베리");
		System.out.println(aa);
		
		
	}

}
