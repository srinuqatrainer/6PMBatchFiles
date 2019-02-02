package com.Annotations;

import org.testng.annotations.Test;

public class Annotations1
{

	@Test(priority=0)
	public void browserLaunch()
	{
		System.out.println("FireFox Browser Launch");
	}
	
	@Test(priority=1)
	public void logIn()
	{
		System.out.println("Gmail LogIn");
	}
	
	@Test(priority=2)
	public void inBox()
	{
		System.out.println("Testing InBox Functionality");
	}
	
	@Test(enabled=false) 
	public void composeMail()
	{
		System.out.println("Testing composeMail functionality");
	}
	
	}
