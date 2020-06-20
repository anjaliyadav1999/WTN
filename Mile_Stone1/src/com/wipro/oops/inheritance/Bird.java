package com.wipro.oops.inheritance;
class Animal
{
	void eat()
	{
		System.out.println("Animal is eating:");
	}
	void sleep()
	{
		System.out.println("Animal is sleeping");
	}
}
public class Bird extends Animal {
	@Override
	void eat()
	{
		System.out.println("Bird is eating");
	}
	@Override
	void sleep()
	{
		System.out.println("Bird is sleeping");
	}
	void fly()
	{
		System.out.println("Bird is flying");
	}
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.eat();
		a.sleep();
		
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
	}
}
