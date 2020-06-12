package com.wipro.flowControlsStatements;

public class Ex_12 {
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int flag=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println(n+" is not a Prime Number");
		}
		else
		{
			System.out.println(n+" is a Prime Number");
		}
	}
}
