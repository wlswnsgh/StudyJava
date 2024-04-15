package abstractex;

public class Quiz1 {

	public static void main(String[] args) {
		
		Car bus = new Bus();
		Car autoCar = new AutoCar();
		
		bus.Run();
		bus.Refuel();
		bus.takebus();
		System.out.println();
		autoCar.Run();
		autoCar.Refuel();
		autoCar.load();
	}

}

abstract class Car {

	public abstract void Run();
	public abstract void Refuel();
	
	public void takebus() {
		System.out.println("승객을 버스에 태웁니다.");
	}
	
	public void load() {
		System.out.println("짐을 싣습니다.");
	}
	
}

class Bus extends Car{

	@Override
	public void Run() {
		System.out.println("버스가 달립니다.");
	}

	@Override
	public void Refuel() {
		System.out.println("천연 가스를 충전합니다.");
	}

}

class AutoCar extends Car {

	@Override
	public void Run() {
		System.out.println("자동차를 달립니다.");
	}

	@Override
	public void Refuel() {
		System.out.println("휘발유를 주유합니다.");
	}
	
}