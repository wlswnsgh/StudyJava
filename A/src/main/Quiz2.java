package main;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		Aaa aa = new Aaa();
		int sss = aa.Minus(num1, num2);
		System.out.println(sss);
		
	}
	
}

class Aaa {

	public int Minus(int n1, int n2) {
		
		if(n1 < n2) {
			return -999;
		} 
		
		return n1 -n2;
	}
	
}

