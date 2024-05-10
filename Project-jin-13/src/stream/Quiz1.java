package stream;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class Quiz1 {

	public static void main(String[] args) {
		
		String[] arr1 = {"aaa", "aaa", "b", "b", "ccccc"};
		Stream<String> arr2 = Arrays.stream(arr1);
		
		// Q1
		// 정답: 3
		Stream<String> arr3 = Arrays.stream(arr1);
		long a1 = arr3.filter(n -> n.length() >= 3).count();
		System.out.println(a1);
	
		// Q2
		// 정답: 13
		Stream<String> arr4 = Arrays.stream(arr1);
		int a2 = arr4.mapToInt(s -> s.length()).sum();
		System.out.println(a2);
		
		// Q3
		// 3. 가장 길이가 짧은 문자열의 길이를 구하세요
		// 정답: 1
		Stream<String> arr5 = Arrays.stream(arr1);
		OptionalInt a3 = arr5.mapToInt(s -> s.length()).min();
		System.out.println(a3.getAsInt());
		
		// Q4
		// 4. 중복을 제거한 리스트를 제거하세요.
		// 정답: aaa, b, ccccc
		Stream<String> arr6 = Arrays.stream(arr1);
		arr6.distinct().forEach(n -> System.out.print(n + " "));
	}

}
