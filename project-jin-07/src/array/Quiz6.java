package array;

public class Quiz6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number = new int[] {5, 20, 100, 30, 77};
		
		for(int i =0; i < 5; i++) {
			//배열의 값 == 찾고 싶은 값
			if (number[i] == 20) {
				System.out.println(i);
				break;
			}
		}
		
	}
}
