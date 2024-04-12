package polymorphism;

public class EX1 {

	public static void main(String[] args) {
		Animal animal = new Animal();
		Human human = new Human();
		Tigger tigger = new Tigger();
		Eagle eagle = new Eagle();
		
		animal.move();
		human.move();
		tigger.move();
		eagle.move();
		
	}

}

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
}

class Tigger extends Animal {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
}

class Eagle extends Animal {

	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
}