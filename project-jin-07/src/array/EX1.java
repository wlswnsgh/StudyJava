package array;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 숫자 3개를 저장하기 위해 배열 생성
		int[] arr = new int[3]; //3개 크기의 정수형 배열 생성
		
		arr[0] = 10; // 배열의 첫번째 요소에 값 10 저장
		arr[1] = 20;
		arr[2] = 30;
		
		//arr[3] = 40; //에러남.
		int value = arr[1];
		System.out.println(value);
		
		
	}

}
