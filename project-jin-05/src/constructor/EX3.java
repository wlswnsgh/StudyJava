package constructor;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}

class Board {
	int no;
	String title;
	String content;
	String writer;
	
	public Board() {
		super();
	}

	public Board(String title) {
		super();
		
		this.title = title;
	}

	public Board(int no, String title, String content, String writer) {
		super();
		
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
}