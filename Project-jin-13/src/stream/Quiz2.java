package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Quiz2 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("file1.txt", "file2.pdf", "file3.txt", "file4.img", "file5.txt", "file6.img");
		list.stream().filter(n -> n.endsWith(".txt")).forEach(n -> System.out.print(n + " ")); 
		
		System.out.println();
		
		Stream<String> str1 = list.stream();
		long a1 = str1.filter(n -> n.endsWith(".txt")).count();
		System.out.println("txt의 파일 개수: "+ a1);
		
		Stream<String> str2 = list.stream();
		long a2 = str2.filter(n -> n.endsWith(".pdf")).count();
		System.out.println("pdf의 파일 개수: "+ a2);
		
		Stream<String> str3 = list.stream();
		long a3 = str3.filter(n -> n.endsWith(".img")).count();
		System.out.println("txt의 파일 개수: "+ a3);
		
		Stream<String> str4 = list.stream();
		str4.map(n -> {
			String[] strArr = n.split("\\.");
			return strArr[1];
		}).distinct().forEach(n -> System.out.print(n + " "));
	}

}