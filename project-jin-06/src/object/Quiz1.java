package object;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TEXI ex1 = new TEXI();
		// ex1.TEXIEL(5000);
	}

}

class TEXI {
	int money;
	
	public void texis(int money) {
		this.money = money;
	}
	
	public void TEXIEL() {
		
		if (money < 10000) {
			System.out.println("손님 환영합니다.^^");
		} else {
			System.out.println("손님 택시에서 내리세요.^^");
		}
	}
	
}