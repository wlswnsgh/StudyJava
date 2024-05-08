package map;

import java.util.Collection;
import java.util.HashMap;

public class Quiz5 {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		Member member1 = new Member(1001, "둘리");
		Member member2 = new Member(1002, "또치");
		Member member3 = new Member(1003, "도우너");
		Member member4 = new Member(1004, "고길동");
		
		memberHashMap.addMember(member1);
		memberHashMap.addMember(member2);
		memberHashMap.addMember(member3);
		memberHashMap.addMember(member4);
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1001);
		memberHashMap.removeMember(1002);
		memberHashMap.showAllMember();
		
//		memberHashMap.removeMember(1009);
//		memberHashMap.showAllMember();
	}

}

// 전체 회원을 출력하는 메소드
class MemberHashMap{
	
	HashMap<Integer, Member> map; 
	
	public MemberHashMap() {
		map = new HashMap<>();
	}
	
	// 맵에 회원을 추가하는 메소드
	public void addMember(Member member) {
		map.put(member.memberId, member);
	}
	
	// 아이디로 회원을 삭제하는 메소드
	public void removeMember(int memberid) {
		
		// 해당 아이디가 존재하면 삭제하고 메소드 종료
		if(map.containsKey(memberid)) {
			map.remove(memberid);
			System.out.println(memberid + "번 회원을 삭제하였습니다.");
		} else { // 없으면 에러메세지 출력
			System.out.println(memberid + "번 회원이 존재하지 않습니다.");
		}
		
	}
	
	// 전체 회원을 출력하는 메소드
	public void showAllMember() {
		
		Collection<Member> values = map.values();
		
		for(Member member : values) {
			System.out.println(member);
		}
		System.out.println();
	}
}