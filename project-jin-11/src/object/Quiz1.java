package object;

public class Quiz1 {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(2024, 4, 16);
		MyDate date2 = new MyDate(2024, 4, 16);
		MyDate date3 = new MyDate(2024, 4, 16);
		MyDate date4 = new MyDate(2024, 4, 17);
		
		System.out.println(date1.equals(date2));
		System.out.println(date3.equals(date4));
		
	}

}

class MyDate {
	int year;
	int month;
	int days;
	
	public MyDate(int year, int month, int days) {
		super();
		this.year = year;
		this.month = month;
		this.days = days;
	}

	@Override
	public boolean equals(Object obj) {
		
		// Object는 모든 객체가 매개 값으로 대입될 수 있다.
		// instanceof 객체를 확인하는 연산자이다.
		if(obj instanceof MyDate) { // 매개값 obj가 MyDate 타입형일 떄
			
			MyDate mydate = (MyDate)obj; // obj를 MyDate로 강제형 변환
			
			if(this.year == mydate.year && 
			   this.month == mydate.month &&
			   this.days == mydate.days) {
				return true;
			}
		}
		return false;
	}
	
}
