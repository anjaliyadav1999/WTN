package com.wipro.flowControlsStatements;

public class Ex_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ch=args[0];
		int age=Integer.parseInt(args[1]);
		if(ch.equals("Female")&& (age>=1 && age<=58))
		{
			System.out.println("The percentage of interset is 8.2%");
		}
		else if(ch.equals("Female")&& (age>=59 && age<=100))
		{
			System.out.println("The percentage of interset is 9.2%");
		}
		else if(ch.equals("Male")&& (age>=1 && age<=58))
		{
			System.out.println("The percentage of interset is 8.4%");
		}
		else if(ch.equals("Male")&& (age>=59 && age<=100))
		{
			System.out.println("The percentage of interset is 10.5%");
		}
	}

}
