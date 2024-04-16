package main;

public class EX3 {

	public static void main(String[] args) {
		
		Calc calc = new NewCalculator();
		
		if(calc instanceof NewCalculator) { // 인스턴스의 형이 Calculator이면
			NewCalculator calculator = (NewCalculator) calc; // calculator형으로 다운캐스팅
			calculator.Inshow();
		}

	}

}

// 새로운 버전의 계산기 클래스
class NewCalculator implements Calc{

	@Override
	public int add(int num1, int num2) {
	
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		
		return num1 - num2;
	}

	@Override
	public int times(int num1, int num2) {
	
		int result = num1 * num2;
		
		if(result == 0 || result < 0) {
			return ERROR;
		} else {
			return num1 * num2;
		}
		
	}

	@Override
	public int divide(int num1, int num2) {
		
		if(num2 > num1) {
			return ERROR;
		} else {
			return num1 / num2;
		}
		
	}
	
	public void Inshow() {
		System.out.println("합: "+ add(7,2));
		System.out.println("차: "+ substract(7,2));
		System.out.println("곱: "+ times(4,10));
		System.out.println("나누기: "+ divide(60,20));
	}
	
}