package collection;

import java.util.HashSet;
import java.util.Iterator;

public class Quiz4 {

	public static void main(String[] args) {
		HashSet<Integer> num = new HashSet<>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println("set의 크기를 출력하세요");
		System.out.println("크기: "+num.size());
		
		System.out.println("Iterator를 이용하여 set의 요소를 하나씩 출력하세요");
		Iterator<Integer> numEl = num.iterator();
		while(numEl.hasNext()) {
//			int numEls = numEl.next();
//			System.out.print(numEls.next() + " "); 
			System.out.print(numEl.next() + " ");    }
		
		System.out.println();
		
		System.out.println("람다식 for문으로 출력하세요");
		for(int numElm : num) {
			System.out.print(numElm + " ");    }

	}
}