package animal;

import action.FishMove;

public class Fish extends Animal {
	public Fish() {
		Animalname="fish";
		move=new FishMove();
		move.getself(this);
	}
	public void produce() {			//����һ������
		System.out.println("you get some fish meat!");
	}
	public void feed() {
		System.out.println("The fish eats some water!");
	}
}
