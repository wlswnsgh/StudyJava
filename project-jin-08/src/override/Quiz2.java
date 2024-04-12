package override;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coffee coffee = new Coffee();
		Americano americano = new Americano();
		Latte latte = new Latte();
		
		coffee.show1();
		americano.show1();
		latte.show1();
		
	}

}

class Coffee{
	public void show1() {
		System.out.println("커피를 마신다.");
	}
}

class Americano extends Coffee{

	@Override
	public void show1() {
		System.out.println("아메리카노를 마신다.");
	}
	
}

class Latte extends Coffee{

	@Override
	public void show1() {
		System.out.println("라떼를 마신다.");
	}
	
}