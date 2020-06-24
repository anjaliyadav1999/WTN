package com.wipro.oops.overriding_Polymorphism;
class Shape
{
	void draw()
	{
		System.out.println("Drawing");
	}
	void erase()
	{
		System.out.println("Erasing");
	}
}
class Triangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Triangle");
	}
	@Override
	void erase()
	{
		System.out.println("Erasing Triangle");
	}
}
class Circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Circle");
	}
	@Override
	void erase()
	{
		System.out.println("Erasing Circle");
	}
}
class Square extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Drawing Square");
	}
	@Override
	void erase()
	{
		System.out.println("Erasing Square");
	}
}
public class Ex_2 {
	public static void main(String args[])
	{
		Shape s=new Square();
		s.draw();
		s.erase();
		Shape t=new Triangle();
		t.draw();
		t.erase();
		Shape c=new Circle();
		c.draw();
		c.erase();
	}

}
