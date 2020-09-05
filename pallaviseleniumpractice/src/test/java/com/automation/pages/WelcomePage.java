package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BaseClass {
	
     WebDriver driver;
     
 //New Test comment by pallavi
	
	public WelcomePage(WebDriver locdriver)
	{
		this.driver=locdriver;
	}

	@FindBy(xpath="//input[@id='email']") WebElement email;
	
	@FindBy(xpath= "//input[@id='pass']") WebElement pass;
	
	@FindBy(name="login") WebElement loginButton;
		
	public void findSignInButton(String emailIdOfApplication, String passwordOfApplication) throws InterruptedException 
	{
		email.sendKeys(emailIdOfApplication);
		pass.sendKeys(passwordOfApplication);
		loginButton.click();	
		Thread.sleep(10000);
		System.out.println(driver.getTitle());

		}
}

