package lambda;

public class Quiz1 {

	public static void main(String[] args) {
		
		Mynumber num = new Number();
		System.out.println(num.max(5,4));
		System.out.println(num.max(10,20));
		
		// 람다식 함수 출력결과
		Mynumber num2 = (x, y) -> x > y ? x : y;
		System.out.println(num2.max(13, 5));
		
		// 익명 함수 출력결과
		Mynumber num3 = new Mynumber(){
			@Override
			public int max(int x, int y) {
				return (x > y) ? x : y;
			}
		};
		System.out.println(num3.max(3,5));
		System.out.println(num3.max(15,5));
		
	}
}

// 함수형 인터페이스
@FunctionalInterface
interface Mynumber {
	// 더 큰 값을 구하는 메소드
	int max(int x, int y);
}

// 구현 클래스 만들기
class Number implements Mynumber {

	@Override
	public int max(int x, int y) {
		
		if(x > y) {
			return x;
		}
		
		return y;
	}
	
}
