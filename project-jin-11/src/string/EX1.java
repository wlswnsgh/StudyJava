package string;

public class EX1 {

	public static void main(String[] args) {
		
		// 리터럴 방식으로 문자열 객체 생성
		String str1 = "test";
		String str2 = "test";
		
		// new 방식으로 문자열 객체 생성
		String str3 = new String("test");
		
		System.out.println(str1 == str2); // 같은 객체를 공유
		System.out.println(str1 == str3); // new 키워드를 쓸 때는 힙 메모리를 생성하므로 내용은 같지만 메모리가 다르기 때문에 false를 사용
		
		System.out.println(str1.hashCode()); // 주소값 확인방법
		
	}

}
