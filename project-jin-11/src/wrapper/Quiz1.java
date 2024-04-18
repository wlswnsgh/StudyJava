package wrapper;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 1번 문제
		int Num1 = Integer.parseInt("10");
		System.out.println(Num1);
		
		int Num2 = (byte) Integer.parseInt("10");
		System.out.println(Num2);
		
		int Num3 = (short) Integer.parseInt("10");
		System.out.println(Num3);
		
		long Num4 = (long) Integer.parseInt("10");
		System.out.println(Num4);
		
		// 2번 문제
//		Integer iNum1 = Integer.valueOf(10);
//		System.out.println(iNum1);
//		
//		float iNum5 = Integer.valueOf("10.0");
//		System.out.println(iNum5);
//		double iNum6 = Integer.valueOf("1.123");
//		System.out.println(iNum6);
		
		// 숫자를 문자열로 반환하려면 "toString" 메소드를 사용해야됨
		String str1 = String.valueOf(10); // 10 -> "10"
		String str2 = String.valueOf(1.123);
		String str3 = String.valueOf('c');
		String str4 = String.valueOf(true);		
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
