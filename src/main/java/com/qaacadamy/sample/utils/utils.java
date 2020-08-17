package com.qaacadamy.sample.utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import com.qaacadamy.sample.testbase.Testbase;

public class utils  extends Testbase{
	
	public static void screenshot(WebDriver driver,String name) throws IOException {
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File location=new File("C:\\Users\\jolin\\eclipse-workspace\\com.qaacadamy.sample\\Screenshot"+name+".exe");
	    FileHandler.copy(src, location);
	    }
	
	public static void implicitwait(int  milliseconds) {
		
		driver.manage().timeouts().implicitlyWait (milliseconds , TimeUnit.MILLISECONDS);
	}
	
	
	public static void maximize() {
		
		driver.manage().window().maximize();
	}
}
