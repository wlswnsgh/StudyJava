package abstractex;

import java.util.ArrayList;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Animal2> mallist = new ArrayList<>();
		mallist.add(new Human());
		mallist.add(new Tiger());
		
		for(int i = 0; i < mallist.size(); i++) {
			Animal2 mals = mallist.get(i);
			
			mals.sleep();
			mals.move();
			
			if(mals instanceof Human) {
				Human hum = (Human) mals;
				hum.readBook();
			} else if (mals instanceof Tiger) {
				Tiger tig = (Tiger) mals;
				tig.hunting();
			} 
			System.out.println();
		}
	}
}
