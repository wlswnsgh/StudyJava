package main;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz6 {

	public static void main(String[] args) {
		
		// 구구단 출력
		try {
			FileWriter EX1 = new FileWriter("multiplication table.txt");
			
			for(int i = 2; i <= 9; i++) {
				
				for(int j = 1; j <= 9; j++) {
					EX1.write(" "+ i + "*" + j + "=" + i * j);
					EX1.write('\n'); // 특수기호 출력
				}
				EX1.write('\n'); 
			}
			EX1.flush(); // 버퍼에 남아있는 데이터 강제로 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
