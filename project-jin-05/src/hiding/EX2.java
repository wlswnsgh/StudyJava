package hiding;

public class EX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyDate2 date = new MyDate2();
		
		date.setMonth(2);
		
		date.setDay(20);
		
		System.out.println("현재 날짜는 "+date.getMonth() + "월 "
				+ date.getDay() + "일 입니다.");
		
		date.setDay(10);
		
		System.out.println("현재 날짜는 "+date.getMonth() + "월 "
				+ date.getDay() + "일 입니다.");
	}

}

// 두번째 날짜 클래스. 이름이 중복되니까 "2"를 붙여주세요!
class MyDate2{
	
	private int month; // 월
	private int day; // 일
	
	//get은 return을 사용할때 사용하는 명령어이다.
	public int getMonth() {
		return month;
	}
	
	// set은 입력함수의 명령어이다.
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		
		if (month == 2) {
			if (day < 1 || day >28) {
				System.out.println("2월에는"+day
						+ " 일이 없습니다!!");
				
				return;
			}
		}
		
		this.day = day;
	}
	
	
	
}