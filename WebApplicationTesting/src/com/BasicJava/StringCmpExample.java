package com.BasicJava;

public class StringCmpExample {

	public static void main(String[] args)
	{
		
		int i=10;
		
		String a="Hello";
		String b="hello";
		
		if(a.equals(b))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are not Equal");
		}
		
		System.out.println("*****************");
		
		if(a.equalsIgnoreCase(b))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are not Equal");
		}

		System.out.println("###########################");
		System.out.println("the length of variable a is: "+a.length());
		System.out.println("the length of variable b is: "+b.length());
		
		
		if(a.length()==b.length())
		{
			System.out.println("Both Strings length is equal");
		}
		else
		{
			System.out.println("Both Strings length are not equal");
		}
		
		System.out.println("======================================");
		
		String x="Hello";
		String y=" Hello";
		if(x.equalsIgnoreCase(y))
		{
			System.out.println(" Both Strings are Equal ");
		}
		else
		{
			System.out.println(" Both Strings are not Equal");
		}
		
		
		System.out.println("---------------------------------------------");
		
		String p="Hello";
		String q="ello";

		if(p.contains(q))
		{
			System.out.println("String existing");
		}
		else
		{
			System.out.println("String does not exist");
		}
	}

}
