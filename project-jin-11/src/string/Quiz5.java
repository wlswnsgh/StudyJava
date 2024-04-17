package string;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		show(str);
	}

	public static void show(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i)+"");
		}
	}
	
}
