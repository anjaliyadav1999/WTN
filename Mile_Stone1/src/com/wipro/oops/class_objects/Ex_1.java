package com.wipro.oops.class_objects;

class Box {
	double width,height,depth;
	Box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public double volume()
	{
		return width*height*depth;
	}
}
class Ex_1
{
	public static void main(String args[])
	{
		int wi=Integer.parseInt(args[0]);
		int he=Integer.parseInt(args[1]);
		int de=Integer.parseInt(args[2]);
		Box b=new Box(wi,he,de);
		System.out.println("Volume of the box: "+b.volume());
	}
}
