package day005;

import day005.protectedClass.Machine;

public class Computer extends Machine {
	public Computer(int a) {
		super(a);
	}

	@Override
	public void work() {
		System.out.println("추상 메소드를 override~~");
	}

}
