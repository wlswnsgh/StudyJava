package string;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
//		System.out.println("문장을 입력하세요");
//		Scanner scanner = new Scanner(System.in); // 콘솔 창에 데이터를 입력할 수 있다.
//		String str = scanner.nextLine(); // String 자료형이므로 문자열을 입력할 수 있다.  
//		show(str);
//		System.out.println();
		
		while(true) {
			System.out.println("문장을 입력하세요");
			Scanner line = new Scanner(System.in);
			String str = line.nextLine();
			show(str);
			System.out.println();
			
			if(line.equals("end")||line.equals("END")) {
				break;
			}
			
//			if(line.toLowerCase().equals("end")) {
//				break;
//			}
//			
//			if(line.equalsIgnoreCase("end")) {
//				break;
//			}
			
		}
		
	}

	public static void show(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i)+"");
		}
		
	}
	
}
