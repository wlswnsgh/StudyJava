package Quiz;

public class BookMenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookMenu bookmenu1 = new BookMenu();
		
		bookmenu1.tittle = "자바프로그래밍";
		bookmenu1.Price = 20000;
		bookmenu1.ApublishingHouse = "한빛컴퍼니";
		bookmenu1.pages = 300;
		
		System.out.println(bookmenu1.tittle);
		System.out.println(bookmenu1.Price);
		System.out.println(bookmenu1.ApublishingHouse);
		System.out.println(bookmenu1.pages);
//		bookmenu1.showInfo();
		
		System.out.println();
		
		BookMenu bookmenu2 = new BookMenu();
		
		bookmenu2.tittle = "스프링";
		bookmenu2.Price = 15000;
		bookmenu2.ApublishingHouse = "한빛미디어";
		bookmenu2.pages = 500;
//		bookmenu2.showInfo();
		
		System.out.println(bookmenu2.tittle);
		System.out.println(bookmenu2.Price);
		System.out.println(bookmenu2.ApublishingHouse);
		System.out.println(bookmenu2.pages);
	}

}
