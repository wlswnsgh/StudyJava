package override;

public class Quiz1 {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		cat.show1();
		cat.show2();
		dog.show1();
		dog.show2();
		
	}

}

class Ani {

	public void show1() {
		System.out.println("먹는다.");
	}
	
	public void show2() {
		System.out.println("짖는다.");
	}
	
}

class Cat extends Ani {

	@Override
	public void show1() {
		System.out.println("고양이는 쥐를 먹는다");
	}

	@Override
	public void show2() {
		System.out.println("고양이는 야옹하고 먹는다");
	}
	
}

class Dog extends Ani {
	
	@Override
	public void show1() {
		System.out.println("개는 고기를 먹는다");
	}

	@Override
	public void show2() {
		System.out.println("개는 멍멍하고 짖는다");
	}
	
}

