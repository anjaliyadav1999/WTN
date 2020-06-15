package com.wipro.arrayProblems;

public class Ex_5 {
	public static void main(String args[])
	{
		int max1=0,max2=0;
		int min1=9999,min2=9999;
		for(int i=0;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])>max1)
			{
				max2=max1;
				max1=Integer.parseInt(args[i]);
			}
			else if(Integer.parseInt(args[i])>max2)
			{
				max2=Integer.parseInt(args[i]);
			}
		}
		for(int i=0;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])<min1)
			{
				min2=min1;
				min1=Integer.parseInt(args[i]);
			}
			else if(Integer.parseInt(args[i])<min2)
			{
				min2=Integer.parseInt(args[i]);
			}
		}
		System.out.println("Largest 2 Numbers: "+max1+" "+max2);
		System.out.println("Smallest 2 Numbers: "+min1+" "+min2);
	}

}
