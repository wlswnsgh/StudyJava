package wrapper;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('a');
		list.add('b');
		list.add('c');
		// list.add(new Character('a'))으로 변환됨. (오토박싱)
		list.add('d');
		
		char ch1 = list.get(0);   // 언박싱
		System.out.println(ch1);
		
		for(int i = 0; i < list.size(); i++) {
			// list.get(i).charValue()에서 언박싱이 일어남
			char ch2 = list.get(i);
			Character chara = list.get(i);
			System.out.println(ch2);
			System.out.println(chara);
			
			// 래퍼클래스: 기초타입을 객체로 사용하기 위해서이다.
			// 기초타입: 자료형을 말한다.
		}
		
	}

}
