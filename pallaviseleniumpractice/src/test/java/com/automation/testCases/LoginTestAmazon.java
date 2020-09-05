package com.automation.testCases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import com.automation.pages.BaseClass;
import com.automation.pages.WelcomePage;

public class LoginTestAmazon extends BaseClass{

	@Test(priority=1)
	public void loginApp() throws InterruptedException
	{
		logger=report.createTest("Login to Facebook");
		
		WelcomePage loginpage=PageFactory.initElements(driver, WelcomePage.class);
		
		logger.info("Starting application");

		loginpage.findSignInButton(excel.getStringData("Login",0,0),excel.getStringData("Login",0,1));
		
		logger.pass("Login done successfully");
	
	
	}
	
	
	@Test(priority=2)
	public void loginApp1() throws InterruptedException
	{
		logger=report.createTest("Logout");
		
		logger.fail("Logout failed");
	
	
	}
	
	
}
