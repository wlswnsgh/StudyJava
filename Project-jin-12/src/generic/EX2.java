package generic;

public class EX2 {

	public static void main(String[] args) {
		
		ThreeDPrinter3 printer = new ThreeDPrinter3();
		Power p1 = new Power(); // Powder를 재료로 선택
		printer.setMaterial(p1); // Object material = p1;
		
		// 재료를 꺼낼때는 직접 형변환을 해야함
		Power p2 = (Power)printer.getMaterial();
		p2.doPrinting();
	}
	
}

class ThreeDPrinter3 {
	
	private Object material;
	
	public void setMaterial(Object material) {
		this.material = material;
	}
	
	public Object getMaterial() {
		return material;
	}
	
}