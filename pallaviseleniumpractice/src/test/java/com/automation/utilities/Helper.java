package com.automation.utilities;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	
//	captureScreenshots, handleAlerts, handleFrames,handleWindows, javascriptExecutor
	
	public static String captureScreenshots(WebDriver driver)
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String screenshotPath=System.getProperty("user.dir") + "/Screenshots/Facebook_" + getCurrentDateTime() + ".png";
		
		try {
			FileHandler.copy(srcFile, new File("./Screenshots/Facebook_" + getCurrentDateTime() +".png"));
			System.out.println("captured screenshot");
		}
		catch (IOException e) {
			System.out.println("Unable to capture screenshot"+e.getMessage());
		}
		return screenshotPath;
		
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
		
	}
	

}
