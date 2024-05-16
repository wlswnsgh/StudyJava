package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Quiz4 {

	public static void main(String[] args) {
		
		
		// 이 문제는 아스키 코드들을 잘 알아둘 것!!
		try {
			FileOutputStream fis = new FileOutputStream("output3.txt");
				
//				fis.write('A'); 
//				fis.write('B');
//				fis.write('C'); 
//				fis.write('D'); 
//				fis.write('E');
//				fis.write('F');
//				fis.write('G'); 
//				fis.write('H');
//				fis.write('I');
//				fis.write('J'); 
//				fis.write('K');
//				fis.write('L');
//				fis.write('M'); 
//				fis.write('N');
//				fis.write('O'); 
//				fis.write('P'); 
//				fis.write('Q');
//				fis.write('R');
//				fis.write('S'); 
//				fis.write('T');
//				fis.write('Y');
//				fis.write('V'); 
//				fis.write('W');
//				fis.write('X');
//				fis.write('Y');
//				fis.write('Z');
			
				// 시작! 'A'의 아스키 값
//				for(int i = 65; i <= 90; i++) {
//					fis.write(i); // A-Z 출력
//				}
				
				// 시작! 'A'의 아스키 값
				int i = 65;
				while(i < 90) {
					fis.write(i);
					i++;
				}
				
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
