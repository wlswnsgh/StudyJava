package inheritance;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicTV basic = new BasicTV();
	    basic.PowerStatus = "on";
	    basic.channel = 7;
	    basic.volum = 30;
	    basic.Ex1();
	    
	    System.out.println();
	    Smart smart = new Smart();
	    smart.PowerStatus = "on";
	    smart.channel = 11;
	    smart.volum = 10;
	    smart.IP = "192.168.10.1";
	    smart.Ex1();
	    smart.Ex2();
	}

}

class BasicTV{
	String PowerStatus;
	int channel;
	int volum;
	
	public void Ex1() {
		System.out.print("전원상태:" + PowerStatus + " 채널:" + channel + " 볼륨:" + volum);
	}
}

class Smart extends BasicTV{
	String IP;
	public void Ex2() {
		System.out.print(" 아이피:" + IP);
	}
}
