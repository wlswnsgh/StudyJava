package array;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

		for(int i = 0; i < 10; i++) {
			Number[0] = 10;
			Number[9] = 1;
			System.out.print(Number[i]+" ");
		}
	}
}
