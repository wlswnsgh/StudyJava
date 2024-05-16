package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EX3 {

	public static void main(String[] args) {
		
		
		try {
			// 입력 스트림 생성
			FileInputStream fis = new FileInputStream("input.txt");
			
			// 문자 하나씩 읽어오기
			System.out.print(fis.read() + " "); // 65
			System.out.print(fis.read() + " "); // 66
			System.out.print(fis.read() + " "); // 67
			System.out.print(fis.read()); // 68
			System.out.println();
			
			FileInputStream fis2 = new FileInputStream("input.txt");
			System.out.print((char) fis2.read() + " "); // A
			System.out.print((char) fis2.read() + " "); // B
			System.out.print((char) fis2.read() + " "); // C
			System.out.print((char) fis2.read()); // D
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
