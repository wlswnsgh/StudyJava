package hiding;

public class EX3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person();
		
	}

}

class Person {
	
	private String name;
	private int height;
	private double weight;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	// source 메뉴 - generate getter and setter
	
	
}