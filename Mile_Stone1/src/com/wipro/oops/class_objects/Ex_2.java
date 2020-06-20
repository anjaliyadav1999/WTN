package com.wipro.oops.class_objects;
class Calculator
{
	public static int powerInt(int num,int power)
	{
		int res=1;
		for(int i=0;i<power;i++)
		{
			res*=num;
		}
		return res;
	}
	public static double powerDouble(double num1,int num2)
	{
		int res=1;
		for(int i=0;i<num2;i++)
		{
			res*=num1;
		}
		return res;
	}
}
public class Ex_2 {
	public static void main(String args[])
	{
		System.out.println("Power value using Integer:"+Calculator.powerInt(2,10));
		System.out.println("Power value using Double: "+Calculator.powerDouble(3.14,3));
	}

}
