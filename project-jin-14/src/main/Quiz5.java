package main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		
		// "abc"를 입력하세요!
//		int num = scanner.nextInt(); // 다른 타입의 데이터가 들어와서 에러남
		
		try {
			int num = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println(e);
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
