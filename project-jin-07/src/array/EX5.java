package array;

import java.util.Arrays;

public class EX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] srcArr = {'a', 'b', 'c', 'd', 'e'}; // 원본 배열
		char[] newArr = new char[3]; //새로운 배열
		
		// 배열 복사하기
		// 원본배열, 시작위치, 새배열, 시작위치, 개수
		System.arraycopy(srcArr, 0, newArr, 0, 3);
		System.out.println("원본배열: " + Arrays.toString(srcArr));
		System.out.println("새로운배열: " + Arrays.toString(newArr));
		
	}

}
