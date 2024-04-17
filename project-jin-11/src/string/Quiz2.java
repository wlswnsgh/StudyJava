package string;

public class Quiz2 {

	public static void main(String[] args) {
		
		String number = "881120-1068234";

		if(number.charAt(7) == '1' || number.charAt(7) == '3') {
			System.out.println("성별은 남자입니다.");
		} else if (number.charAt(7) == '2' || number.charAt(7) == '4') {
			System.out.println("성별은 여자입니다.");
		} else {
			System.out.println("다시 입력하세요");
		}
		
	}
}