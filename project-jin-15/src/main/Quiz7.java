package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Quiz7 {

	public static void main(String[] args) {
		
		try {
			// 바이트 스트림 생성
			// 한글을 쓰지 못한다.
			FileOutputStream fis = new FileOutputStream("quiz7.txt");
		
			// 보조 스트림 생성
			OutputStreamWriter osw = new OutputStreamWriter(fis);
			
			osw.write('프');
			osw.write('로');
			osw.write('그');
			osw.write('래');
			osw.write('밍');
			osw.write('\n');
			osw.write("프로그래밍");
			
			// OutputStreamWriter도 버퍼를 사용함
			// 버퍼를 비워야 내용이 한번에 출력됨
			osw.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
