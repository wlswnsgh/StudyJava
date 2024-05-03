package collection;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		
		ArrayList<String> book = new ArrayList<String>();
		book.add("C프로그래밍");
		book.add("JAVA프로그래밍");
		book.add("C#프로그래밍");
		System.out.println(book);
		
//		첫번째 방법
		for(int i= book.size()-1; i >= 0; i--) { book.remove(i); }
		System.out.println(book);
		
//		두번째 방법
		int j = book.size()-1;
		while(j >= 0) {
			book.remove(j);
			j--;  } System.out.println(book);
		
	}
}