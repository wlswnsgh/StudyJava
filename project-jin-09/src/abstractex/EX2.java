package abstractex;

public class EX2 {

	public static void main(String[] args) {
		
		Animal animal1 = new Dog();
		Animal animal2 = new Cat();
		
		animal1.sound();
		animal1.breathe();
		System.out.println();
		animal2.sound();
		animal2.breathe();
	}

}

// 동물 클래스
abstract class Animal {
	
	// 공통기능은 일반메소드로 선언
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 동물마다 내는 소리가 다르니까 추상메소드로 선언
	public abstract void sound();
	
}


// 고양이 클래스
class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야'옹'");
	}
	
}

// 강아지 클래스
class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("왈!");
	}
	
}