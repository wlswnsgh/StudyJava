package Quiz;

public class Comparison {
	
	// 두 수를 비교하는 함수 선언
	public static int comparison(int n1, int n2) {
		
		if(n1 > n2) {
			return n1;
		} else {
			return n2;
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("비교 값: "+comparison(10, 5));
		System.out.println("비교 값: "+comparison(2, 7));
		System.out.println("비교 값: "+comparison(100, 200));
		
		
	}

}