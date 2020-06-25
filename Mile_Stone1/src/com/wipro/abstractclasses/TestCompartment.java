package com.wipro.abstractclasses;
import java.util.*;
abstract class Compartment {
	public abstract void notice();
}

class FirstClass extends Compartment {
	public void notice() {
		System.out.println("Notice: You're in FirstClass");
	}

}

class General extends Compartment {

	@Override
	public void notice() {
		System.out.println("Notice: You're in General");
	}

}

class Ladies extends Compartment {

	@Override
	public void notice() {
		System.out.println("Notice: You're in Ladies");
	}

}

class Luggage extends Compartment {

	@Override
	public void notice() {
		System.out.println("Notice: You're in Luggage");
	}

}

public class TestCompartment {
	public static void main(String[] args) {
		Compartment[] c = new Compartment[10];

		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			int randomNum = rand.nextInt(4) + 1;

			if (randomNum == 1)
				c[i] = new FirstClass();
			else if (randomNum == 2)
				c[i] = new Ladies();
			else if (randomNum == 3)
				c[i] = new General();
			else if (randomNum == 4)
				c[i] = new Luggage();

			c[i].notice();
		}
	}
}
