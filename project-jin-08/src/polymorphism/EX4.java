package polymorphism;

import java.util.ArrayList;

public class EX4 {

	public static void main(String[] args) {
		
		// 회원 리스트 생성
		ArrayList<Customer2> customerList = new ArrayList<Customer2>();
		
		Customer2 customer1 = new Customer2("둘리"); // 일반 회원 생성
		Customer2 customer2 = new Customer2("또치"); 
		Customer2 customer3 = new Customer2("도우너"); 
		Customer2 customer4 = new Customer2("마이콜"); // vip 회원 생성
		Customer2 customer5 = new Customer2("고길동"); 
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		for(Customer2 customer : customerList) {
			customer.calcPrice(10000);
		}
		
		for(Customer2 customer : customerList) {
			customer.showInfo(); // 고객정보 출력
		}
		
	}
}
