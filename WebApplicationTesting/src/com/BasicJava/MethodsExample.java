package com.BasicJava;

public class MethodsExample
{

	int a=10;
	int b=20;
	int c;
	
	public void add()
	{
		c=a+b;
		System.out.println(" The addition of a and b is :"+c);
	}
	
	public void subtraction()
	{
		c=a-b;
		System.out.println(" The Subtraction of Two number :"+c);
	}
	
	public void division()
	{
		c=a/b;
		System.out.println(" The division of Two number :"+c);
	}
		
	public static void main(String[] args)
	{
	
		MethodsExample m = new MethodsExample();
		
		m.add();
		m.subtraction();
		m.division();
		

	}

}
