package Quiz;

public class CarClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car();
		car1.commany = "현대";
		car1.model = "쏘나타";
		car1.model = "흰색";
		car1.maxiumSpeed = 200;
		
		Car car2 = new Car("기아", "레이", "검정색", 150);
	}

}

class Car {
	
	String commany;
	String model;
	String color;
	int maxiumSpeed;
	
	public Car(){
	}
	
	public Car(String commany,  String model, String color, int maxiumSpeed) {
		commany = commany;
		model = model;
		color = color;
		maxiumSpeed = maxiumSpeed;
	}
}