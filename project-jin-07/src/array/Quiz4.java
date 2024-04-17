package array;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Arry = new int[5];
		// System.out.println(Arrays.toString(Arry));
		int cnt = 0; // 인덱스를 저장할 변수
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				Arry[cnt] = i;
				cnt++;
			}
		}
		
		System.out.println(Arrays.toString(Arry));
		
		// int[] Num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		// for(int i = 0; i < Num.length; i++) {
			// if(Num[i] % 2 != 0) {
				//continue;     
			//}
			// System.out.print(Num[i]+" ");
		//}
		
	}
}
