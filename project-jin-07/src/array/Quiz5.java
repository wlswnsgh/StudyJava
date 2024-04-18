package array;

public class Quiz5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {5, 20, 100, 30, 77};
		
		int numEl = num[0];
		for(int i = 0; i < num.length; i++) {
			if(num[i] > numEl) {
				numEl = num[i];
			}
		}
		System.out.println("최대값: "+numEl);
	}
}