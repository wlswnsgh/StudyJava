package downcasting;

import java.util.ArrayList;

public class Quiz1 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("독수리");
		list.add("호랑이");
		list.add("사자");
		
//		readBook(new Human());
		for(int i = 0; i < list.size(); i++) {
			
		}
	}
	
	public static void readBook(Human human) {
		human.readBook();
	}
	
	public static void hunting(Tigger tiger) {
		tiger.hunting();
	}
	
	public static void flying(Eagle eagle) {
		eagle.flying();
	}
	
}