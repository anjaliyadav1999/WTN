package com.wipro.flowControlsStatements;

public class Ex_11 {

	public static void main(String[] args) {
		int s=Integer.parseInt(args[0]);
		int e=Integer.parseInt(args[1]);
		for(int i=s;i<=e;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
	}

}
