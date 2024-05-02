package collection;

import java.util.ArrayList;

public class EX2 {

	public static void main(String[] args) {
		
		ArrayList<Member> list = new ArrayList<Member>();
		
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		
		list.add(member1); //회원 추가
		list.add(member2);
		list.add(member3);
//		list.add(member3);
		
		System.out.println(list);
		
		// for문을 이용해서 전체 회원 정보 출력하기
		for(int i = 0; i < list.size(); i++) {
			Member member = list.get(i); // 리스트에서 회원을 꺼냄
			System.out.println(member.toString());
		}
		
	}
}

// 쇼핑몰 회원
class Member {
	
	int memberID; // 회원아이디
	String memberName; // 회원이름

	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "memberID=" + memberID + ", memberName=" + memberName;
	}
	
}






