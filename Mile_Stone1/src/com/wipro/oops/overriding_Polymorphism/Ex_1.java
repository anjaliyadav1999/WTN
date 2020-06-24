package com.wipro.oops.overriding_Polymorphism;
class Fruit
{
	String name,taste;
	int size;
	Fruit()
	{
		name="";
		taste="";
		size=0;
	}
	void eat()
	{
		System.out.println("Name of the fruit is "+name+" and its taste is "+taste);
	}
}
class Apple extends Fruit
{
	Apple()
	{
		name="Apple";
		taste="Sweet";
		size=1;
	}
	@Override
	void eat()
	{
		System.out.println("The name of the fruit is "+name+" and its taste is "+taste);
	}
	
}
class Orange extends Fruit
{
	Orange()
	{
		name="Orange";
		taste="Sweet and Sour";
		size=1;
	}
	@Override
	void eat()
	{
		System.out.println("The name of the fruit is "+name+" and its taste is "+taste);
	}
	
}
public class Ex_1 {
	public static void main(String args[])
	{
		Fruit a=new Apple();
		a.eat();
		Fruit b=new Orange();
		b.eat();
	}
}
