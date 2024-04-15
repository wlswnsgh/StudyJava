package abstractex;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<>();
		
		list.add(new Bus());
		list.add(new AutoCar());
		
		for (int i = 0; i < list.size(); i++) {
			
			Car carlist = list.get(i);
			
			carlist.Run();
			carlist.Refuel();

			if (carlist instanceof Bus) { 
				Bus bus = (Bus) carlist;
				bus.takebus();
			} else if (carlist instanceof AutoCar) { 
				AutoCar autocar = (AutoCar) carlist;
				autocar.load();
			}
			System.out.println();
		}
	}
}
