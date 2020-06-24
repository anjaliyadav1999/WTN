package com.wipro.packages;

public class Compartment {
	 double height;
	 double weight;
	 double breadth;
	 Compartment(double height,double weight,double breadth)
	 {
		 this.height=height;
		 this.weight=weight;
		 this.breadth=breadth;
	 }
	 void display()
	 {
		 System.out.println("Height: "+height);
		 System.out.println("Weight: "+weight);
		 System.out.println("Breadth: "+breadth);
	 }
}
