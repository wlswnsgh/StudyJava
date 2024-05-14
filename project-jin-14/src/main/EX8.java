package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class EX8 {

	// throws는 바로 예외처리를 던진하든 의미를 뜻한다. 
	public static void openTextFile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("src/main/a.txt");
	}
	
	public static void main(String[] args) {
		
		try { // 예외처리를 main함수에 해준다는 뜻이다.
			openTextFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}

