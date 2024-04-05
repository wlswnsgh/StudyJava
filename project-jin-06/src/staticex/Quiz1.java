package staticex;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CARD card1 = new CARD();
		card1.Cardname = "jin";
		System.out.println(card1.Cardname + "카드 "
				+ card1.cardID);
		
		CARD card2 = new CARD();
		card2.Cardname = "jun";
		System.out.println(card2.Cardname + "카드 "
				+ card2.cardID);
		
		CARD card3 = new CARD();
		card3.Cardname = "ho";
		System.out.println(card3.Cardname + "카드 "
				+ card3.cardID);
		
	}

}

class CARD{
	static int count = 100; 
	int cardID;
	String Cardname;
	
	public CARD() {
		count++; // count++이므로 1씩증가
		cardID = count; //count 증가값을 cardID에 저장
	}
}