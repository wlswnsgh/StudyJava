package main;

public class EX1 {

	public static void main(String[] args) {
//		Calc calc = new Calc(); // 에러
		Calculator calculator = new Calculator();
		
//		System.out.println("더하기 결과값: "+calculator.add(5, 4));
//		System.out.println("빼기 결과값: "+calculator.substract(5, 4));
//		System.out.println("곱하기 결과값: "+calculator.times(5, 4));
//		System.out.println("나누기 결과값: "+calculator.divide(5, 4));
		
		calculator.Inshow();
	}
}

class Calculator implements Calc {

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
	
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		
		return num1 / num2;
	}
	
	public void Inshow() {
		System.out.println("더하기 결과값: "+ add(5, 4));
		System.out.println("빼기 결과값: "+ substract(5, 4));
		System.out.println("곱하기 결과값: "+ times(5, 4));
		System.out.println("나누기 결과값: "+ divide(5, 4));
	}
}