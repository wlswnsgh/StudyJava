package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz4 {

	public static void main(String[] args) {
		
		List<Customer> list = new ArrayList<>();
		list.add(new Customer("둘리", 40, 100));
		list.add(new Customer("또치", 13, 50));
		list.add(new Customer("도우너", 25, 70));
		
		// Q1 답: 둘리, 또치, 도우너 === 220
		System.out.print("고객명단: ");
		list.stream().map(b -> b.이름).forEach(s -> System.out.print(s + " "));
		
		System.out.println();
		Stream<Customer> str1 = list.stream();
		int b1 = str1.mapToInt(n -> n.여행비용).sum();
		System.out.println("총 여행 비용: " + b1);
		
		// Q2 답: 도우너 둘리
		Stream<Customer> str2 = list.stream();
		System.out.print("20살 이상 고객 명단: ");
		str2.filter(n -> n.나이 >= 20).map(n -> n.이름).forEach(s -> System.out.print(s + " "));
		
		// Q3 답: 역순(둘리, 도우너)
		
	}

}

class Customer {
	String 이름;
	int 나이;
	int 여행비용;

	public Customer(String 이름, int 나이, int 여행비용) {
		super();
		this.이름 = 이름;
		this.나이 = 나이;
		this.여행비용 = 여행비용;
	}
	
}