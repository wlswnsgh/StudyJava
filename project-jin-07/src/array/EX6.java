package array;

import java.util.Arrays;

public class EX6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] srcArr = {'a', 'b', 'c', 'd', 'e'};
		char[] newArr = new char[2];
		
		System.arraycopy(srcArr, 3, newArr, 0, 2);
		System.out.println("원본배열: " + Arrays.toString(srcArr));
		System.out.println("새로운배열: " + Arrays.toString(newArr));
	}

}
