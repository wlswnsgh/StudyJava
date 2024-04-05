package staticex;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new Calculator();
		
		System.out.println(10 * 10 * calculator.pi); // 원의 둘레 구하기
		System.out.println(calculator.plus(20,30)); // 두 수의 합 출력
		System.out.println(calculator.minus(50,30)); // 두 수의 차 출력
	}

}

// 계산기 클래스
class Calculator {
	static double pi =3.14159; // 원의 둘레를 구하는 파이는 공통속성
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
	
}