package com.BasicJava;

public class MultiDimensionalArray {

	public static void main(String[] args)
	{
		String a[][] = new String[3][3];
		
		a[0][0] = "Ram";
		a[0][1] = "Raj";
		a[0][2]  = "Ramesh";
		
		a[1][0] = "Pavan";
		a[1][1] = "Pasha";
		a[1][2] = "Pradeep";
		
		a[2][0] = "Santhosh";
		a[2][1] = "Sandy";
		a[2][2] = "Suman";
				
		//for(int i=0;i<=2;i++)
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]+" ");
				
			}
			System.out.println();
		}
		

	}

}
