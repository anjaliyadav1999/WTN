package com.wipro.oops.inhertitanceEX_2;

public class Employee extends Person {
	double annualSalary;
	int year;
	String insuranceNumber;
	Employee()
	{
		name="Raju";
		annualSalary=100000;
		year=2010;
		insuranceNumber="0123416";
	}
	Employee(String name,double salary,int yOfs,String number)
	{
		this.name=name;
		annualSalary=salary;
		year=yOfs;
		insuranceNumber=number;
	}
     String getName() {
		return name;
	}
	double getAnnualSalary() {
		return annualSalary;
	}
	int getYear() {
		return year;
	}
	 String getInsuranceNumber() {
		return insuranceNumber;
	}
	
}
