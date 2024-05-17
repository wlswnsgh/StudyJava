package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX10 {

	public static void main(String[] args) {
		
		try {
			// 기반 스트림 생성
			FileInputStream fis = new FileInputStream("reader.txt");
			
			while (true) {
				int i = fis.read(); // 1바이트씩 읽기
				if(i == -1) {
					break;
				}
				System.out.println(i + " ");
			}
			System.out.println();
			
			// 보조 스트림
			/* FileInputStream, InputStreamReader 한번 쓰면 쓸 수 없으므로 스트림을 다시 만들어준다. */
			FileInputStream fis1 = new FileInputStream("reader.txt");
			InputStreamReader isr1 = new InputStreamReader(fis1);
			
			while (true) {
				int i = isr1.read(); // 내용을 문자(2byte)로 변환하여 가지고 옴
				if(i == -1) {
					break;
				}
				System.out.println(i + " "); // 50504 45397 54616 49464 50836 
			} System.out.println();
			
			FileInputStream fis2 = new FileInputStream("reader.txt");
			InputStreamReader isr2 = new InputStreamReader(fis2);
			
			while (true) {
				int i = isr2.read();
				if(i == -1) {
					break;
				}
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
