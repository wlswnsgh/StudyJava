package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class EX2 {

	public static void main(String[] args) {
		
//		Member member1 = new Member(1, "jin");
//		Member member2 = new Member(2, "jun");
//		Member member3 = new Member(3, "ho");
//		System.out.println(member1.toString());
//		System.out.println(member2.toString());
//		System.out.println(member3.toString());
		
		HashMap<Integer, Member> map1 = new HashMap<>();
		Member member1 = new Member(1, "jin");
		Member member2 = new Member(2, "jun");
		Member member3 = new Member(3, "ho");
		
		// 회원 추가
		map1.put(member1.memberId, member1);
		map1.put(member2.memberId, member2);
		map1.put(member3.memberId, member3);
		
		// 1번째 회원 삭제
		map1.remove(1);
		
		// 전체 회원 수 출력
		System.out.println("전체 회원 수 : " + map1.size());
		
		// 전체 회원 목록 출력
		System.out.println(map1);
		
		// 회원 목록 순회하기
		Set<Integer> keyset = map1.keySet();
		
		// 변수 : 자료구조 (배열 리스트 출력)
		for (int key : keyset) {
			System.out.println("[key]: " + key + "[Value]"+ map1.get(key));
		}
		
	}

}

// 회원 클래스 만들기
class Member {
	int memberId; // 회원아이디
	String memeberName; // 회원이름
	
	// 모든 멤버변수를 초기화 하는 생성자
	public Member(int memberId, String memeberName) {
		super();
		this.memberId = memberId;
		this.memeberName = memeberName;
	}

	// 회원의 정보를 반환하도록 toString 재정의
	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memeberName=" + memeberName + "]";
	}
	
	
	
	
}