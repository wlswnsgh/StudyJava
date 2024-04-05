package thisex;

public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BirthDay bDay = new BirthDay();
		
		bDay.setYear(2000);
		
		System.out.println(bDay);
		bDay.printThis();
		
	}

}

class BirthDay{
	int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}
