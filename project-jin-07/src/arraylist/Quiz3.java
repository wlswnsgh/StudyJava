package arraylist;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		str.add("AA");
		str.add("BB");
		str.add("CC");
		str.add("DD");
		str.add("EE");
		
		for(String list : str) {
			System.out.print(list + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < str.size(); i++) {
			str.remove(i);
			System.out.print(str+" ");
		}
		
	}
}
