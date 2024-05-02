package collection;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<String> book = new ArrayList<String>();
		book.add("C프로그래밍");
		book.add("JAVA프로그래밍");
		book.add("C#프로그래밍");
		System.out.println(book);
		
		for(int i= book.size()-1; i >= 0; i--) {
			String str = book.remove(i);
		}
		
		System.out.println(book);
	}
}