package string;

public class EX2 {

	public static void main(String[] args) {
		
		// 이 같은 경우는 같은 상수풀로 저장하는 것이므로 str 변수를 재사용을 해도 사용할 수 있다.
		// 만약 new 라는 객체를 사용하면 완전히 버리는 것이므로 이 내용을 잘 구분하도록 하자.
		String str = "test";
		System.out.println("str 문자열 값: " + str + 
				", 주소: " + str.hashCode());
		
		str = "aaa";
		System.out.println("str 문자열 값: "+ str +
				", 주소: " + str.hashCode());
	
		
	}

}
