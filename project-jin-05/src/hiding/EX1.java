package hiding;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate date = new MyDate();
		
		date.month = 2;
		date.day = 31; // 2월 28일이나 29일까지 인데 31일이 저장됨
		System.out.println("현재 날짜는 "+
		date.month + "월 " + date.day + "일 입니다.");
	}

}

class MyDate {
	public int month; // 월
	public int day; // 일
	
}
