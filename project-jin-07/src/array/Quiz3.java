package array;

public class Quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrNumber = { 10, 15, 20, 25, 30 };
		int sum = 0;
		
		for(int i = 0; i < arrNumber.length; i++) {
			sum  = sum + arrNumber[i];
		}
		System.out.println("합계: "+sum);
	}
}