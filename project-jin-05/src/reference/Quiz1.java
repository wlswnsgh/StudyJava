package reference;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		book bookEl = new book();
		bookEl.number = 123;
		bookEl.name = "jinjunho";
		bookEl.book1 = "hi";
		bookEl.book2 = "hello";
		bookEl.book3 = "world";
		
		
	}

}

class book {
	int number;
	String name;
	String book1;
	String book2;
	String book3;
	
	public book() {
		
	}
	
	public book(int number, String name, String book1, String book2, String book3) {
		number = number;
		name = name;
		book1 = book1;
		book2 = book2;
		book3 = book3;
	}
}