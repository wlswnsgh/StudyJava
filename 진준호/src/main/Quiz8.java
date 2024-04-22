package main;

public class Quiz8 {

	public static void main(String[] args) {
		Calc calc = new Calculator();
		
		System.out.println(calc.add(10, 5));
		System.out.println(calc.substract(10, 5));
		System.out.println(calc.times(10, 5));
		System.out.println(calc.divide(10, 5));
		System.out.println();
		System.out.println(calc.add(10, 25));
		System.out.println(calc.substract(0, 0));
	}

}

class Calculator implements Calc {

	@Override
	public int add(int num1, int num2) {
		if(num1 > num2 ) {
			return num1 + num2;
		} else if (num1 + num2 == 0) {
			return ERROR; 
		} else {
			return ERROR; 
		}
		
	}

	@Override
	public int substract(int num1, int num2) {
		if(num1 > num2) {
			return num1 - num2;
		} else if (num1 - num2 == 0) {
			return ERROR; 
		} else {
			 return ERROR;
		}
	}

	@Override
	public int times(int num1, int num2) {
		if(num1 > num2) {
			 return num1 * num2;
		} else if (num1 * num2 == 0) {
			return ERROR; 
		} else {
			return ERROR;
		}
	}

	@Override
	public int divide(int num1, int num2) {
		if(num1 > num2) {
			return num1 / num2;
		} else if (num1 / num2 == 0) {
			return ERROR; 
		} else {
			return ERROR; 
		}
	}
	
}