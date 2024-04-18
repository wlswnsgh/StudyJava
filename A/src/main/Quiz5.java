package main;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {
		
		ArrayList<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true);
		list.add(true);
		list.add(false);
		
		for(int i = 0; i < list.size(); i++) {
			Boolean j = list.get(i);
			System.out.println(j);
		}
		
		int lastIndex = list.size() -1;
		System.out.println("첫번째 요소:" + list.get(0));
		System.out.println("마지막 요소:" + list.get(lastIndex));
	}

}
