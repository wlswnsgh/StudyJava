package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz9 {

	public static void main(String[] args) {
		
		try {
			FileWriter Q9 = new FileWriter("quiz9.txt"); // quiz9 파일 생성
			
			File file = new File("C:\\풀스택"); // 풀스텍 파일 경로
			File[] list1 = file.listFiles(); // .listFiles()로 풀스텍 파일 안에 있는 파일들을 리스트로 가져오기
			
			for(int i = 0; i < list1.length; i++) {
				 Q9.write(list1[i].getName() + "\n"); // 풀스텍 파일 목록 출력
			} Q9.flush();		
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
