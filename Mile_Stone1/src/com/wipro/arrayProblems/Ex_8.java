package com.wipro.arrayProblems;

public class Ex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[100];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		int sum=0,sum1=0;
		for(int i=0;i<args.length-1;i++)
		{
			if(a[i]==6)
			{
				for(int j=args.length-1;j>=0;j--)
				{
					if(a[j]==7)
						break;
					sum1=sum1+a[j];
				}
				break;
			}
			sum=sum+a[i];
		}
		System.out.println(sum1+sum);
	}

}
