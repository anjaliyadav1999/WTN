package com.wipro.flowControlsStatements;

public class Ex_13 {
	public static void main(String args[])
	{
		int start=Integer.parseInt(args[0]);
		int end=Integer.parseInt(args[1]);
		while(start<end)
		{
			int flag=1;
			for(int i=2;i<=start/2;i++)
			{
				if(start%i==0)
				{
					flag=0;
					break;
				}
			}
			if(flag==1 && start!=0 && start!=1)
			{
				System.out.println(start+" ");
			}
			++start;
		}
	}

}
