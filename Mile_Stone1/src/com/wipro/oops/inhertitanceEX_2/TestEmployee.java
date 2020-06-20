package com.wipro.oops.inhertitanceEX_2;

public class TestEmployee {
	public static void main(String args[])
	{
		String s=args[0];
		double a=Double.parseDouble(args[1]);
		int year=Integer.parseInt(args[2]);
		String insuranceNumber=args[3];
		Employee e=new Employee(s,a,year,insuranceNumber);
		//Employee b=new Employee("Ram",10000,2019,"01765213");
		System.out.println("Details of Employee");
		System.out.println("Name:"+e.getName());
		System.out.println("AnnualSalary:"+e.getAnnualSalary());
		System.out.println("Year:"+e.getYear());
		System.out.println("InsuranceNumber:"+e.getInsuranceNumber());
	}
}
