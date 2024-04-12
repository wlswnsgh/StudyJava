package inheritance;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.customerName = "홍길동"; 
		customer.bonusPoint = 1.5;
		customer.calcPrice(1500);
		customer.showInfo();
		
		VIPCustomer vip = new VIPCustomer();
		vip.customerName = "홍길동"; // 부모클래스에서 물려받은 속성
		vip.calcPrice(10000); // 할인안됨
		vip.showInfo();
		
	}

}

//일반회원 클래스
class Customer {
	String customerName; // 회원 이름
	String customerGrade; // 회원 등급
	double bonusPoint; // 보너스 포인트
	double bonusRatio; // 적립률
	
	public Customer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
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
class VIPCustomer extends Customer {
	double saleRatio; // 활인률
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
}