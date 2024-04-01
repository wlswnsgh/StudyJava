package conditional;

public class EX5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//			char rank = '3';
//			
//			switch (rank) {
//			case '1': //rank 값이 '1'이면
//				System.out.println("메달의 색은 금입니다.");
//				break;
//			case '2': //rank 값이 '2'이면
//				System.out.println("메달의 색은 은입니다.");
//				break;
//			case '3': //rank 값이 '3'이면
//				System.out.println("메달의 색은 동입니다.");
//				break;
//			default: //변수와 일치하는 값이 없으면 default로 출력
//				System.out.println("메달이 없습니다.");
//		}
		
		String rank = "3";
		
		switch (rank) {
		case "1": //rank 값이 '1'이면
			System.out.println("메달의 색은 금입니다.");
			break;
		case "2": //rank 값이 '2'이면
			System.out.println("메달의 색은 은입니다.");
			break;
		case "3": //rank 값이 '3'이면
			System.out.println("메달의 색은 동입니다.");
			break;
		default: //변수와 일치하는 값이 없으면 default로 출력
			System.out.println("메달이 없습니다.");
		}		
	}
}
