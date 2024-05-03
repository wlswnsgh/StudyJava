package collection;

import java.util.HashSet;
import java.util.Iterator;

public class EX3 {

	public static void main(String[] args) {
		
		// add, remove는 쓸 수 있지만 get은 쓸 수 없다. 왜냐하면은 인덱스 값이 없기 때문이다.
		HashSet<String> hashSet = new HashSet<>();
		
		hashSet.add("둘리");
		hashSet.add("또치");
		hashSet.add("도우너");
		hashSet.add("도우너");
		
		// 리스트와 삭제 방법이 다름
//		hashSet.remove("도우너");
		
		// Iterator(제네릭 함수) 객체 생성하여 set을 순회하기
		Iterator<String> ir = hashSet.iterator();
		
		// 첫번째 방법
//		while(ir.hasNext()) { // 다음요소가 있으면
//			String member = ir.next(); // 다음요소를 가져옴
//			System.out.println(member + " ");
//		}
		
		// 두번째 방법
//		while(true) {
//			if(ir.hasNext() == true) { // 다음요소가 있으면
//				String member = ir.next(); // 다음요소를 가져옴
//				System.out.println(member + " ");
//			} else {
//				break;
//			}
//		}
	
		// 세번째 방법
		// 일반포문 - index 필요함
		// 람다식 포문
		// 값을 저장할 변수: 자료구조
		for(String member : hashSet) {
			System.out.println(member + " ");
		}
	
	}
}
