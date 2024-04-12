package inheritance;

public class Quiz4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster mon = new Monster();
		mon.i = 100;
		mon.j = 30;
		mon.showInfo();
		
		Slime slime = new Slime();
		slime.i = 130;
		slime.j = 70;
		slime.y = "마비";
		slime.showInfo();
		slime.show();
		
	}

}

class Monster {
	int i;
	int j;
	
	public void showInfo() {
		System.out.println("몬스터의 공격력은 " + i +"이고 체력은"+ j +"이다.");
	}
}

class Slime extends Monster{
	String y;
	
	public void show(){
		System.out.println("스킬은 " + y + "입니다.");
	}
}