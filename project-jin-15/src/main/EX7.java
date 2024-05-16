package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EX7 {

	public static void main(String[] args) {
		
		// 내용이 많으면 배열를 사용해 1번만 출력해준다.
		
		try {
			// 출력 스트림 생성
			FileOutputStream fos = new FileOutputStream("output2.txt");
			
			// 배열 생성
			byte[] arr = { 65, 66, 67 };
			
			// 배열을 사용해서 내용 쓰기. 배열의 모든 내용을 한번에 출력
			fos.write(arr);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
