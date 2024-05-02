package collection;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		
		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('A');
		list.add('B');
		list.add('C');
		
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list.size());
		
		for(int i = 0; i < list.size(); i++) {
			Character str = list.get(i);
			if(str == 'A') {
				list.remove(i);
			}
		}
		System.out.println(list);
	}
}
