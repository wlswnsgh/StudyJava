package array;

public class EX4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// (배열에서 꺼낸 값을 저장할 변수 : 배열)
		for(int value: arr) {
			System.out.print(value +" ");
		}
		
		System.out.println();
		
		// 기존 포문
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
