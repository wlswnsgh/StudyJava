package polymorphism;

public class EX2 {

	public static void main(String[] args) {
		Customer2 customer1 = new Customer2("둘리");
		customer1.calcPrice(10000);
		customer1.showInfo();
		
		Customer2 customer2 = new Customer2("또치");
		customer2.calcPrice(10000);
		customer2.showInfo();
	}

}

//일반회원 클래스
class Customer2 {
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률
	
	// 디폴트 생성자 삭제 또는 주석처리
	public Customer2(String customerName) {
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
//		System.out.println("Customer() 생성자 호출");
	}
	
	// 보인스 포인트 적립하고, 지불 가격을 계산하는 메소드
	public void calcPrice(int price) {
		
		bonusPoint = bonusPoint + (price * bonusRatio); // 보너스 포인트 계산
		System.out.println(customerName + "님이 " + price + "원을 결제했습니다");
	}
	
	public void showInfo() {
		System.out.println(customerName + "님의 등급은 "
				+ customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.");
	}
	
}

//VIP 회원 클래스
class VIPCustomer2 extends Customer2 {
	double saleRatio; // 활인률
	
	public VIPCustomer2(String customerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
//		System.out.println("VIPCustomer() 생성자 호출");
	}
}