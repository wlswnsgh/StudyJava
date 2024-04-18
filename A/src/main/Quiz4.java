package main;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int cnt = 0;
		
		for(int i = 1; i <= arr.length; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int j = 1; j <= 10; j++) {
			if(j % 2 == 0) {
				arr[cnt] = j;
				cnt++;
			}
		}
		
		System.out.print(Arrays.toString(arr));
	}
}
