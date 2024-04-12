package typecasting;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

}


class Parent {
	String nationality; 
	String lastname;
	
	public Parent(String nationality, String lastname) {
		this.nationality = nationality;
		this.lastname = lastname;
	}
	
}

class Descendent extends Parent{
	String firstName;
	
	public Descendent(String nationality, String lastname, String firstname) {
		super(nationality, lastname);
		this.firstName  = "junho";
		lastname = "jin";
		nationality = "한국";
		System.out.println("Descendent() 호출");
	}
}