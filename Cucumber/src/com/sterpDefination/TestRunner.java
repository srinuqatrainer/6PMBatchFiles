package com.sterpDefination;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features="OHRM",glue={"com.OHRMApplicationLogInTest"})


public class TestRunner 
{

}
