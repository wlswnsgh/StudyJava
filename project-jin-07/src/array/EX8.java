package array;

public class EX8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 2차원 배열 생성 및 초기화
		int[][] arr = {{2,4,6}, {3,6,9}};
		// 위와 같음
		int[][] arr1 = new int[2][3];
		
		// i는 행 인덱스(0~1) j는 열 인덱스(0~2)
		for (int i = 0; i < 2; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
