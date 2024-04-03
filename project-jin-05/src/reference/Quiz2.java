package reference;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department department01 = new Department();
		department01.dpm = "jin";
		department01.asr = "jun";
		department01.alr = "ho";
		
		Department department02 = new Department("jin", "jun", "ho");
	}

}

class  Department{
	String dpm;
	String asr;
	String alr;
	
	public Department() {
		
	}
	
	public Department(String dpm, String asr, String alr) {
			dpm = dpm;
			asr = asr;
			alr = alr;
	}
}	