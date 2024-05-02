package collection;

import java.util.ArrayList;

public class EX1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println();
		
		System.out.println("리스트 전체 요소: " + list);
		
		list.remove(2);
		System.out.println("리스트 요소 삭제 후: " + list);
		
		int size = list.size();
		System.out.println("리스트 크기: " + size);
		
	}

}
