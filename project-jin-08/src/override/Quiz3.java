package override;

public class Quiz3 {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Laptop laptop = new Laptop();
		Desktop desktop = new Desktop();
		
		computer.show1();
		computer.show2();
		laptop.show1();
		laptop.show2();
		desktop.show1();
		desktop.show2();
		
	}

}

class Computer {
	public void show1() {
		System.out.println("컴퓨터을 켠다()");
	}
	
	public void show2() {
		System.out.println("컴퓨터을 끈다()");
	}
}

class Laptop extends Computer {

	// 노트북에 맞게 재정의
	@Override
	public void show1() {
		System.out.println("노트북을 켠다()");
	}

	@Override
	public void show2() {
		System.out.println("노트북을 끈다()");
	}
	
	
}

class Desktop extends Computer {

	// 데스크탑에 맞게 재정의
	@Override
	public void show1() {
		System.out.println("데스크탑을 켠다()");
	}

	@Override
	public void show2() {
		System.out.println("데스크탑을 끈다()");
	}
	
}