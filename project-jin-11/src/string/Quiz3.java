package string;

public class Quiz3 {

	public static void main(String[] args) {
		String str1 = "자바 프로그래밍 입문 진준호";
		String str2 = str1.replace(" ","");
		System.out.println(str1.length());
		
		if(str1.length() > 0) {
//			System.out.println(str1.replace(" ",""));
			System.out.println(str2.length());
		}
		
	}
}