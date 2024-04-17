package object;

public class EX5 {

	public static void main(String[] args) {
		
		String str1 = new String("test"); // String은 예약어이다.
		System.out.println(str1.toString());
		System.out.println(str1);
		
		String str2 = new String("test");
		
		if(str1.equals(str2)) {
			System.out.println("str1와 str2은 같은 문자열입니다.");
		}
		
		
	}
}
