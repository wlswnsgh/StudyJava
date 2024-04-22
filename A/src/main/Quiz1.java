package main;

public class Quiz1 {

	public static void main(String[] args) {
		
		int sum = Sum(5,10);
		System.out.println();
		System.out.println("합계: "+ sum);	
		
	}
	
	public static int Sum(int n1, int n2) {
		int sum = 0;
		
		for(int i = n1; i <= n2; i++) {
			sum = sum + i;
			System.out.print(i+" ");
		}
		
		return sum;
	}
	
}


