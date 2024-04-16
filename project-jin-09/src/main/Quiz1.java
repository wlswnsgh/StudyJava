package main;

public class Quiz1 {

	public static void main(String[] args) {
		
		Calc calc = new Calculator();
		
		if(calc instanceof Calculator) { // 인스턴스의 형이 Calculator이면
			Calculator calculator = (Calculator) calc; // calculator형으로 다운캐스팅
			calculator.Inshow();
		}
		
		
	}

}
