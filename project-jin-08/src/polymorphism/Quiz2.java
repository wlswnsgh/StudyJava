package polymorphism;

public class Quiz2 {

	public static void main(String[] args) {
		Member member = new Member();
		member.Price(5000);
		member.show();
	}

}

class Member {
	String Name;
	String Rating;
	double Bounspoint;
	double AreserveRate;
	
//	public Member(String name) {
//		this.Name = name;
//		
//	}
	
	public void Price(int price) {
		Bounspoint = 0.02; // 2% 할인
		AreserveRate = 0.5; // 10% 할인
		Bounspoint = Bounspoint * price;
		AreserveRate = AreserveRate * price;
	}
	
	
	public void show() {
		System.out.println("이름: " + Name);
		System.out.println("등급: " + Rating);
		System.out.println("보너스 포인트: " + Bounspoint);
		System.out.println("보너스 포인트 적립률: " + AreserveRate);
		
	}
}

//class Gold extends Member {
//	double AreserveRate;
//}

//class Vip extends Member {
//	double AreserveRate;
//}