package Quiz;

public class forel {
	
	public static int numEl(int num1, int num2) {
		int i;
		int sum = 0;
		for(i = num1; num1 <= num2; num1++) {
			System.out.print(num1+" ");
			sum = sum + num1;
		}
		
		System.out.println();
		System.out.println("합계: " + sum);
		return num1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numEl(5,10);
	}

}
