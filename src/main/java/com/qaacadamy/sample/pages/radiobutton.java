package com.qaacadamy.sample.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaacadamy.sample.testbase.Testbase;

public class radiobutton extends Testbase{
	
	@FindBy(xpath="//legend[text()='Radio Button Example']")
	WebElement radiobuttontext;
	
	@FindBy(xpath="//input[@value='radio2']")
	WebElement radiobutton;
	
	public radiobutton() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String  verifyradiobutton() {
		
		String name=radiobuttontext.getText();
	
	    return name;
	}
	
	
	public boolean verifyradiobuttonselection() {
		
		boolean result=radiobutton.isDisplayed();
		
		return result;
	}
	
public boolean verifyradiobuttonselection1() {
		
		boolean result=radiobutton.isEnabled();
		
		return result;
	}
	
public boolean verifyradiobuttonselection2() throws InterruptedException {
	
	radiobutton.click();
	
	
	Thread.sleep(5000);
	
	
	 boolean result=radiobutton.isSelected();
	
	return result;
}

}
