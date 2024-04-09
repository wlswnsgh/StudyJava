package inheritance;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		child.nationality = "한국"; // 부모 클래스에서 가져온 변수
		child.lastName = "홍"; // 부모 클래스에서 물려받은 변수
		child.firstName = "길동";
	}

}

// 부모 클래스
class Parents {
	String nationality; // 국적
	String lastName; // 성
}

class Child extends Parents{
	String firstName; // 이름
}