package com.Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations3
{
	@BeforeMethod
	public void browserLaunchAndLogIn()
	{
		System.out.println("FireFox browser launch and login to Gmail");
	}
	
	@Test(priority=0)
	public void inBox()
	{
		System.out.println("Testing InBox Functionality");
	}
	
	@Test(priority=1)
	public void composeMail()
	{
		System.out.println("Testing composeMail functionality");
	}
	
	@AfterMethod
	public void applicationClose()
	{
		System.out.println("Closing Gmail Application");
	
	}

}
