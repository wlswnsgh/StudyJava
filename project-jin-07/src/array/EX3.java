package array;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 10개 크기의 정수형 배열 생성
		int[] intArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		// 배열의 요소를 직접 하나씩 출력하기
		System.out.println(intArr[0]);// 배열의 첫번째 요소에 10 저장
		System.out.println(intArr[1]);
		System.out.println(intArr[2]);
		System.out.println(intArr[3]);
		System.out.println(intArr[4]);
		System.out.println(intArr[5]);
		System.out.println(intArr[6]);
		System.out.println(intArr[7]);
		System.out.println(intArr[8]);
		System.out.println(intArr[9]);
		
		// 조건식은 배열의 크기를 바로 알 수 있도록 쓰는 게 좋음
		for(int i = 0; i <= 9; i++) { // i를 인덱스로 사용
			System.out.print(intArr[i]+" ");
		}
		
		// 배열의 길이를 나타낼 때는 length 속성 사용
		System.out.println("배열의 길이:" + intArr.length);
		
		for(int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i]+" ");
		}
	}

}
