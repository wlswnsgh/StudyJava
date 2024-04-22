package main;

import java.util.ArrayList;

public class Quiz7 {

	public static void main(String[] args) {
		
		ArrayList<Animal> list = new ArrayList<Animal>();
		list.add(new Human());
		list.add(new Tiger());
		
		for(int i = 0; i < list.size(); i++) {
			Animal str = list.get(i);
			str.show();
			
			if(str instanceof Animal) {
				Animal ani = (Animal) str;
				ani.sleep();
			}
			
			if(str instanceof Animal) {
				Animal ani = (Animal) str;
				ani.move();		
			}
			
		}
		
	}
}

abstract class Animal {

	public void show() {
		System.out.println("밤에는 잠을 잡니다.");
	}
	
	public abstract void sleep();
	public abstract void move();
}

class Human extends Animal{

	@Override
	public void sleep() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	@Override
	public void move() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	
}

class Tiger extends Animal{

	@Override
	public void sleep() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	@Override
	public void move() {
		System.out.println("호랑이가 사냥을 합니다.");
	}	
	
}