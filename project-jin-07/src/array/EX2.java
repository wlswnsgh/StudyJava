package array;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[3];
		
		arr[0] = 10; // 배열의 첫번째 요소에 10 저장
		arr[1] = 20; // 배열의 첫번째 요소에 20 저장
		arr[2] = 30; // 배열의 첫번째 요소에 30 저장
		
		// arr[3] = 40; //error
		
		int value = arr[1]; // 배열의 두번째 요소값을 가져와서 value에 저장
		System.out.println(value);
	}

}
