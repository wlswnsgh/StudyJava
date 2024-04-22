package main;

public class Quiz2 {

	public static void main(String[] args) {
		
		int a = 1;
		
		if(a >= 3 && a <= 5) {
			System.out.println(a + "월은 봄입니다.");
		} else if (a >= 6 && a <= 8) {
			System.out.println(a + "월은 여름입니다.");
		} else if (a >= 9 && a <= 11) {
			System.out.println(a + "월은 가을입니다.");
		}  else if (a >= 1 && a <= 2 || a == 12 ) {
			System.out.println(a + "월은 겨울입니다.");
		} else {
			System.out.println("잘못된 값입니다.");
		}

	}

}
