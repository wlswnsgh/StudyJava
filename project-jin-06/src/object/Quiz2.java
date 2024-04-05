package object;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class Cafe {
	String name; // 이름
	int money; // 소지금
	
//	public Cafe(int money) {
//		this.money = money;
//	}
	
	public void sellCoffee(int money) {
		this.money = money;
	}

	public void buyAmericano(Cafe cafe) {
		cafe.sellCoffee(4000);
		this.money = this.money - 4000;
	}
	
	public void buyCaffeelatte(Cafe cafe) {
		cafe.sellCoffee(4500);
		this.money = this.money - 4500;
	}
	
	public void showInfo() {
		System.out.println("");
	}
}
