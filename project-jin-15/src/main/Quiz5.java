package main;

import java.io.FileWriter;
import java.io.IOException;

public class Quiz5 {

	public static void main(String[] args) {
		
		
		try {
			FileWriter num = new FileWriter("number.txt");
			
			for(int i = 1; i <= 10; i++) {
				if(i % 2 == 0) {
//					num.write(i); // 숫자로 인식 -> 코드체계에 따라 문자로 변환
					num.write(i + " "); // + " "즉 이걸로 써야 문자로 인식
				}	
			}
			
			num.flush(); // 버퍼에 남아있는 데이터 강제로 출력
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
