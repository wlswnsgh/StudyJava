package polymorphism;

public class Quiz1 {

	public static void main(String[] args) {
		
		runCar(new Car());
		runCar(new Bus());
		runCar(new Sportcar());
		System.out.println();
		runBus(new Bus());
	}

	// 1. 부모 타입의 매개변수를 사용해서 자식클래스인 버스와 스포츠카를 받았다.
	public static void runCar(Car car) {
		car.car(); // 재정의된 메소드가 호출됨
	}
	
	public static void runBus(Bus bus) {
		bus.car();
	}
}

class Car {
	
	public void car() {
		System.out.println("자동차가 주행하다.");
	}
}

class Bus extends Car{

	@Override
	public void car() {
		System.out.println("버스가 달린다.");
	}
	
}

class Sportcar extends Car{

	@Override
	public void car() {
		System.out.println("스포츠카가 달린다.");
	}
	
}

