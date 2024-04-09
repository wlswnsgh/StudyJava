package arraylist;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		
		ArrayList<Character> character = new ArrayList<Character>();
		character.add('A');
		character.add('B');
		character.add('C');
		
		char ch1 = character.get(0);
		System.out.println(ch1);
		
		for(int i = 0; i < character.size(); i++) {
			char ch = character.get(i);
			System.out.print(ch + " ");
		}
		
	}
}
