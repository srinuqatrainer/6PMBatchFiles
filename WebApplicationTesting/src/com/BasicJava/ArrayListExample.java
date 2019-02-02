package com.BasicJava;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args)
	{
		
		ArrayList<Object>a = new ArrayList<>();
		
		a.add("Selenium");
		a.add("QTP");
		a.add("LoadRunner");
		a.add(10);
		
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		 

	}

}
