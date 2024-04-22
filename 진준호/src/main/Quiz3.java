package main;

public class Quiz3 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 0; i < 100; i++) {
			sum = sum + i;
			if(i > 23) {
				System.out.print("i: "+ i);
				System.out.print(" , sum: "+ sum);
				break;
			}	
			
		}
		
	}

}
