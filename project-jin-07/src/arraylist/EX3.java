package arraylist;

import java.util.ArrayList;

public class EX3 {

	public static void main(String[] args) {
		
		// 리스트 생성
		ArrayList<Book> list = new ArrayList<Book>();
		
		// 리스트에 도서정보를 추가
		Book book1 = new Book("태백산맥", "조정래");
		list.add(book1);

		list.add(new Book("데미안", "헤르만 헤세"));
		list.add(new Book("어떻게 살 것인가", "유시민"));
		
		// 람다식 for문 사용
		for(Book book : list) {
			book.showInfo();
		}
		
		// 일반 for문 사용
		for(int i =0; i < list.size(); i++) {
			Book book = list.get(i);
			book.showInfo();
		}
	}
}

// 도서 클래스
class Book {
	String bookName; // 제목
	String author; // 저자
	
	public Book(String bookName, String author) {
		super();
		this.bookName = bookName;
		this.author = author;
	}
	
	public void showInfo() {
		System.out.println(bookName + "," + author);
	}
}