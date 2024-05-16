package main;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		int sum = 0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요:");
		
		// 첫 번째 방법
//		arr[0] = scn.nextInt();
//		arr[1] = scn.nextInt();
//		arr[2] = scn.nextInt();
//		arr[3] = scn.nextInt();
//		arr[4] = scn.nextInt();
		
		// 두 번째 방법
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
			sum = sum + i;
		} 
		System.out.println("배열: " + Arrays.toString(arr)); // 배열값들 출력
		System.out.println("합계: " + sum); // 배열의 합계
	}

}
