package Quiz;

public class ThreeDigitSum {
	
	public static void ThreeDigitSum(int num) {
		int sum = 0;
		//1의 자리
		sum = sum + (num%10);
		
		//10의 자리
		num = num/10;
		sum = sum + (num%10);
		
		//100의 자리
		num = num/10;
		sum = sum + num;
		
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeDigitSum(934);
	}

}
