package Quiz;

import java.util.Date;

public class OrderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oreder order = new Oreder();
		
		order.number = 1111;
		order.DateOfOrder = "2018년3월12일";
		order.name = "둘리";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		
		System.out.println("주문번호: "+ order.number);
		System.out.println("주문날짜: "+ order.DateOfOrder);
		System.out.println("주문자이름: "+ order.name);
		System.out.println("배송지: "+ order.address);
		
		
		
	}

}
