package override;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer vc = new VIPCustomer("둘리"); //일반회원 참조변수 선언하고 VIP 인스턴스 생성
		vc.calcPrice(10000); //계산메소드를 호출하면 재정의된 메소드가 호출됨
	}

}
