package main;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("문자열을 입력하세요 : ");
			String str = scn.nextLine();
			
			// 대소문자 상관없이 비교
			if(str.equalsIgnoreCase("STOP")) {
				break; // stop이 입력되었으면 빠져나가기
			}
			
		} System.out.println("종료되었습니다.");
		
	}
}

