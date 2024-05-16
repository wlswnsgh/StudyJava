package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EX5 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("input3.txt");
			
			byte[] arr = new byte[10];
			
			int size;
			
			while(true) {
				
				
				// .read()는 (인자값)이 없으면 값을 하나씩 가져온다.
				size = fis.read(arr); // .read라는 명령어를 쓰면 arr에 있는 값을 10바이트씩 가져온다.
				
				if(size == -1) {
					break;
				}
				
				for(int i = 0; i < size; i++) {
					System.out.print((char) arr[i]);
				}
				
				System.out.println(": " + size + "바이트 없음");
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
