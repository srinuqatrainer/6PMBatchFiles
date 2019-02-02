package com.BasicJava;

public class SwitchCaseExample {

	public static void main(String[] args)
	{
		int number=40;
		switch(number)
		{
		case 10:
			System.out.println("Selenium");
			break;
			
		case 20:
			System.out.println("LoadRunner");
			break;
			
		case 30:
			System.out.println("QTP");
			break;
		
		default:
			System.out.println("Not in 10,20 and 30");
			break;
		}

	}

}
