package polymorphism;

public class EX3 {

	public static void main(String[] args) {
		moveAnimal(new Human()); // Animal animal = new Human()
		moveAnimal(new Tigger()); // Animal animal = new Tigger()
		moveAnimal(new Eagle()); // Animal animal = new Eagle()
		
	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}
	
	

}
