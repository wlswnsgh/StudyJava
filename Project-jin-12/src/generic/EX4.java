package generic;

import java.util.ArrayList;

public class EX4 {

	public static void main(String[] args) {
		
		// 숫자를 저장하는 리스트 생성
		ArrayList<Integer> list1 = new ArrayList<>(); // 리스트의 자료형
		list1.add(10);
		list1.add(20);
		Integer i = list1.get(0); // 값을 꺼낼 때 형변환 할 필요 없음
		Integer j = list1.get(1);
		System.out.println(i);
		System.out.println(j);
		
		// 문자열을 사용하는 리스트 생성
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("aaa");
		String str = list2.get(0);
		System.out.println(str);
	
	}

}
