package method;

public class Ex2 {
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 3;
		int num2 = 5;
		
		int sum = add(num1, num2);
		System.out.println("합계: "+ sum);
		
		// System.out.println("sum: "+ add(5,6));
		
	}

}