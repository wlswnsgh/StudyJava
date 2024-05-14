package main;

import java.io.IOException;

public class EX1 {

	public static void main(String[] args) {
		
		// 1. 표준 출력으로 화면에 내용 출력하기
//		System.out.println("안녕하세요.");
		
		// 2. 표준 입력으로 문자 입력받기
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요");
		
		// 문자를 입력받아 변수에 값을 저장
		try {
			int i = System.in.read(); // a 입력
//			System.out.println((char)i); // 문자로 입력하기 위해 형변환을 한 것이다.
			System.out.println(i);
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
	}
}
