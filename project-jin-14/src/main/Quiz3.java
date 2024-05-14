package main;

public class Quiz3 {

	public static void main(String[] args) {

//		Object obj = new Integer(0);
//		String str = (String) obj; // 형변환을 잘못해서 에러남
		
		
		try {
			Object obj = new Integer(0);
			String str = (String) obj;
		} catch (ClassCastException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
