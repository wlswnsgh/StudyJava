package string;

public class Quiz4 {

	public static void main(String[] args) {
		
//		System.out.println(getCharCount("자바 프로그래밍 입문"));
//		getCharCount("자바 프로그래밍 입문");
//		getCharCount("equals 메소드는 두 객체가 같은지 비교한다.");
		
	}

}

class Java {
	
	public static int getCharCount(String str) {
		
		int cnt = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				cnt++;
			}
		}
		return cnt;
	}
	
    public static void main(String[] args) {
        System.out.println(getCharCount("자바 프로그래밍 입문"));  // 9   
        System.out.println(getCharCount("equals 메소드는 두 객체가 같은지 비교한다")); // 21
    }
    
}