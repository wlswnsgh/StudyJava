package hiding;

import java.util.Date;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CAR car = new CAR();
		car.setCompany("현대");
		car.setcar("소나타");
		car.setcolor("흰색");
		car.setprice(200);
		
		System.out.println(car.getCompany());
		System.out.println(car.getcar());
		System.out.println(car.getcolor());
		System.out.println(car.getprice());
	}

}

class CAR {
	private String Company;
	private String car;
	private String color;
	private int price;
	
	public String getCompany() {
		return Company;
	}
	
	public void setCompany(String Company) {
		this.Company = Company;
	}
	
	public String getcar() {
		return car;
	}
	
	public void setcar(String car) {
		this.car = car;
	}
	
	public String getcolor() {
		return color;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public int getprice() {
		return price;
	}
	
	public void setprice(int price) {
		this.price = price;
	}
}