package com.wipro.packages;

public class Ex_2 {
	public static void main(String args[]) {
		double height=Double.parseDouble(args[0]);
		double weight=Double.parseDouble(args[1]);
		double breadth=Double.parseDouble(args[2]);
		Compartment co=new Compartment(height, weight, breadth);
		co.display();
	}

}
