package main;

public class EX5 {

	public static void main(String[] args) {
		
		try {
			int[] arr = new int[5];
			arr[5] = 5;
			
		} catch (ClassCastException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		
		// Exception형 매개변수를 사용하면, 모든 에러를 처리할 수 있음.
		catch (Exception e) {
			System.out.println(e); // 에러메세지만 출력
			// printStackTrace(): 추적하다라는 명령어
			e.printStackTrace(); // 에러가 발생한 위치와 에러메세지를 함께 출력
		}

		System.out.println("프로그램이 정상 종료 했습니다.");
	}

}
