package main;

public class EX3 {

	public static void main(String[] args) {
		

		
		try {
			int[] arr = new int[5];
			arr[5] = 5;
			System.out.println(arr[5]);
		} catch(ArithmeticException e) {
			System.out.println(e);
		}
		
		System.out.println("프로그램이 정상 종료됩니다.");

	}

}
