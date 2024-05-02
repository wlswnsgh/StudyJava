package generic;

public class EX3 {

	public static void main(String[] args) {
		
		// 파우더를 사용하는 프린터기 생성
		ThreeDPrinter<Power> printer1 = new ThreeDPrinter<>();
		printer1.setMaterial(new Power());
		Power power = printer1.getMaterial();
		power.doPrinting();
		
		// 플라스틱을 사용하는 프린터기 생성
		ThreeDPrinter<Plastic> printer2 = new ThreeDPrinter<>();
		printer2.setMaterial(new Plastic());
		Plastic plastic = printer2.getMaterial();
		plastic.doPrinting();
		
	}

}

class ThreeDPrinter<T> {
	
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
}






