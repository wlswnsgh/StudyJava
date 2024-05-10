package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex4 {

	public static void main(String[] args) {
		
		int[] inArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		IntStream stream1 = Arrays.stream(inArr);
		
		// count: 스트림 요소의 개수 구하기
		IntStream stream2 = Arrays.stream(inArr);
		System.out.println(stream2.count());
		
		// sum: 스트림 요소의 합 구하기
		IntStream stream3 = Arrays.stream(inArr);
		System.out.println(stream3.sum());
		
		// reduce: 초기값을 넣고, 반복 작업 수행
		IntStream stream4 = Arrays.stream(inArr);
		int result = stream4.reduce(10, (total, n) -> total + n); 
		System.out.println(result);
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		
		// collect: 스트림을 다른 자료구조로 변환. stream -> set
		Stream<Integer> stream5 = list.stream();
		Set<Integer> set = stream5.collect(Collectors.toSet());
		System.out.println(set);
		
		Stream<Integer> stream6 = list.stream();
		List<Integer> strList = stream6.collect(Collectors.toList());
		System.out.println(strList);
		
		
	}

}