package collection;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		
		MemberArrayList list = new MemberArrayList();
		
		// 회원 4명 추가
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		System.out.println(member4);
		
		
	}	
	
}

// 회원 관리 클래스
class MemberArrayList {
	
	// 회원 목록
	ArrayList<Member> list; // 리스트 선언
	
	public MemberArrayList() {
		list = new ArrayList<Member>(); // 리스트를 생성해주세요.
	}
	
	public void addMember(Member member) {
		list.add(member);
	}
	
	public void removeMeber(int memberId) {
		
		for(int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			int id = member.memberID;
			
			if(id == memberId) { // 만약 아이디가 1004번 아이디가 있다면
				list.remove(i);
				System.out.println(memberId + "번 회원을 삭제하였습니다.");
				return;
			}
		}
		System.out.println(memberId + "번 회원을 삭제하였습니다.");
	}
	
	// 전체 회원을 출력하는 메소드
	public void showAllMember() {
		for(int i = 0; i < list.size(); i++) {
			Member member = list.get(i);
			System.out.println(member);
		}
	}
}