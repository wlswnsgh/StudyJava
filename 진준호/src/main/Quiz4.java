package main;

public class Quiz4 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {2, 4, 6, 8, 10};
		int scanner = 5;
		int sum = 0;
		
		for(int i = 0; i <= arr.length; i++) {
			if(scanner < 3) {
				System.out.println("-999");
				break;
			}
		}
		
		for(int j = 0; j <= arr.length; j++) {
			sum = sum + arr[j];
			if(scanner > 3) {
				System.out.println(arr[j]);
				break;
			}
		}
		
	}
}