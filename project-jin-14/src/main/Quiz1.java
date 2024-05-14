package main;

public class Quiz1 {

	// 프로그램이 정상적으로 종료되도록 예외를 처리하세요.
	public static void main(String[] args) {
		
		try {
			
			
			int num = 5/0;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상 종료되었습니다.");

	}

}
