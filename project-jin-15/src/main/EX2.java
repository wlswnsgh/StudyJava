package main;

import java.util.Scanner;

public class EX2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// 문자열 입력받기
		System.out.println("이름: ");
		String name = scanner.nextLine();
		
		// 숫자 입력하기
		System.out.println("나이: ");
		int age = scanner.nextInt();
		
		System.out.print(name + ", ");
		System.out.print(age);
		
		// 사용한 리소스 닫기
		scanner.close();
		
	}

}
