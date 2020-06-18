package com.wipro.arrayProblems;

public class Ex_3 {
	public static void main(String args[])
	{
		
		int a[]=new int[20];
		int l=0;
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
			l++;
		}
		//System.out.print("Enter the Search Element: ");
		int k=Integer.parseInt(args[l-1]);
		//System.out.println(k);
		int index=0,flag=1;
		for(int i=1;i<args.length;i++)
		{
			if(a[i]==k)
			{
				index=i;
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
		System.out.println(index);
		}
		else
		{
			System.out.println("-1");
		}
	}
}
