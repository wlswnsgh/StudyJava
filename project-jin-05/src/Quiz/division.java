package Quiz;

public class division {
	
	public static void division(int n1, int n2) {
		
		if(n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return;
		}
		
		int result = n1 / n2;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		division(10, 2);
		division(15, 4);
		division(10, 0);
	}

}