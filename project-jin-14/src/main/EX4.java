package main;

public class EX4 {

	public static void main(String[] args) {
		
		try {
			int[] arr = new int[5];
			arr[5] = 5;
//			arr[4] = 5;
//			System.out.println(arr[4]);
		} catch (ClassCastException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

		System.out.println("프로그램이 정상 종료 했습니다.");
	}

}
