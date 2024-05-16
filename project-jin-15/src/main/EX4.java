package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EX4 {

	public static void main(String[] args) {
		
		
		
		try {
			
			// 입력 스트링 생성
			FileInputStream fis = new FileInputStream("input.txt");
			
			// 반복문을 사용해서 파일 내용 끝까지 읽기
			while(true) {
				
				int i = fis.read(); // 1바이트씩 읽기
				
				if (i == -1) { // 파일의 끝에 도달하면 -1을 반환
					break;
				}
				
				// 문자로 변환하여 출력
				System.out.println((char) i);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}

}
