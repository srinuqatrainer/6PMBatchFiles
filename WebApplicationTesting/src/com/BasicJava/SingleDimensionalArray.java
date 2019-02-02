package com.BasicJava;

public class SingleDimensionalArray {

	public static void main(String[] args)
	{
		// Array index always starts with 0
		// An array can store only one data Type value
		// the size of the array is constant/static
		// we cannot even add an extra value in an array once declared the size of it
		// we can have less values in an array then the size declared
		// we an index of an array has no value store the it display null value
		
		/*int a=10;
		a=20;
		System.out.println(a);*/
		
		int a[] = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
			
		/*System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);*/
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(i+"-"+a[i]);
		}
		
		
		

	}

}
