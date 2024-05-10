package lambda;

public class Quiz2 {

	public static void main(String[] args) {
		
		// 람다식 
		Hello str1 = (str) -> System.out.println("Hello World-01");
		str1.helloPrint(null);
		
		// 익명클래스
		Hello str2 = new Hello() {
			@Override
			public void helloPrint(String str) {
				System.out.println("Hello World-02");
			}
		}; str2.helloPrint(null);
		
		// 구현 클래스
		Hello str3 = new HelloTmpl();
		str3.helloPrint(null);
		
		
	}

}

// 함수형 인터페이스
interface Hello {
	// 안녕하세요를 출력하는 메소드
	void helloPrint(String str);
}

// Q.Hello의 구현 클래스 만들기
class HelloTmpl implements Hello {

	@Override
	public void helloPrint(String str) {
		System.out.println("Hello World-03");
	}
	
}





