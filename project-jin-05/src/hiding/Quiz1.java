package hiding;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BOOK book = new BOOK();
		book.settittle("자바프로그래밍");
		book.setprice(20000);
		book.setApublishingHouse("jun");
		book.setNumberOfPages(200);
		System.out.println(book.gettittle());
		System.out.println(book.getprice());
		System.out.println(book.getApublishingHouse());
		System.out.println(book.getNumberOfPages());
		
	}

}

class BOOK{
	
	private String tittle;
	private int price;
	private String ApublishingHouse;
	private int NumberOfPages;
	
	public void settittle(String tittle) {
		this.tittle = tittle;
	}
	
	public String gettittle() {
		return tittle;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
	
	public int getprice() {
		return price;
	}
	
	public void setApublishingHouse(String ApublishingHouse) {
		this.ApublishingHouse = ApublishingHouse;
	}
	
	public String getApublishingHouse() {
		return ApublishingHouse;
	}
	
	public void setNumberOfPages(int NumberOfPages) {
		this.NumberOfPages = NumberOfPages;
	}
	
	public int getNumberOfPages() {
		return NumberOfPages;
	}
	
}
