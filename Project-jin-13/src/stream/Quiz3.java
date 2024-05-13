package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Quiz3 {

	public static void main(String[] args) {
		
		List<Shopping> list1 = new ArrayList<>();
		list1.add(new Shopping(1001,2022,300));
		list1.add(new Shopping(1002,2022,150));
		list1.add(new Shopping(1003,2022,200));
		list1.add(new Shopping(1004,2023,500));
		list1.add(new Shopping(1005,2023,400));
		list1.add(new Shopping(1006,2023,600));
		list1.add(new Shopping(1007,2023,650));
		
		// Q1
		list1.stream().map(b -> b.orderNo).forEach(s -> System.out.print(s + " "));
		System.out.println();
		
		// Q2
		// 650, 3
		
		
		
		Stream<Shopping> str1 = list1.stream();
		str1
		.filter(b -> b.orderNo == 1007)
		.mapToInt(b -> b.price)
		.forEach(b -> System.out.print(b + " "));
		
		Stream<Shopping> str2 = list1.stream();
		long z1 = str2.filter(s -> s.year == 2022).count();
		System.out.print(z1);
		
		System.out.println();
		
		// Q3
		// 2150, 4
		Stream<Shopping> str3 = list1.stream();
		int z2 = str3.filter(n -> n.year == 2023).mapToInt(m -> m.price).sum();
		System.out.print(z2 + " ");
		
		Stream<Shopping> str4 = list1.stream();
		long z4 = str4.filter(s -> s.year == 2023).count();
		System.out.println(z4);

	}

}

class Shopping {
	
	int orderNo;
	int year;
	int price;

	public Shopping(int orderNo, int year, int price) {
		super();
		this.orderNo = orderNo;
		this.year = year;
		this.price = price;
	}	
	
}