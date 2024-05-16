package main;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int a1 = scn.nextInt();
		
		int num1 = a1 / 10; // 십의 자리
		int num2 = a1 % 10; // 일의 자리
		int sum = num1 + num2; // 합계
		
		System.out.println("합계: " + sum);

	}

}
