package com.wipro.flowControlsStatements;

public class Ex_7 {

	public static void main(String[] args) {
		char a=args[0].charAt(0);
		if(a>='A'&&a<='Z')
		{
			System.out.println(Character.toLowerCase(a));
		}
		else
		{
			System.out.println(Character.toUpperCase(a));
		}
	}

}
