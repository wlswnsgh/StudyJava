package abstractex;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human = new Human();
		human.sleep();
		human.move();
		human.readBook();
		System.out.println();
		Tiger tiger = new Tiger();
		tiger.sleep();
		tiger.move();
		tiger.hunting();
	}

}

abstract class Animal2 {
	
	public void sleep() {
		System.out.println("밤에는 잠을 잡니다.");
	}
	
	public abstract void move();
	
}

class Human extends Animal2 {

	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	// 책을 읽는 메소드 추가
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal2 {

	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
