package com.qaacadamy.sample.testscript;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qaacadamy.sample.pages.radiobutton;
import com.qaacadamy.sample.testbase.Testbase;
import com.qaacadamy.sample.utils.utils;

public class Testscript extends Testbase {
	
	radiobutton ra;
	utils ui;
	
	public Testscript() {
		super();
	}
  
	@BeforeTest
	public void setup() {
		inilisation();
		ra=new radiobutton();
		ui=new utils();
		
	}
	
	@Test
	public void validateradiobutton() {
		
		String name1=ra.verifyradiobutton();
		if(name1.equals("Radio Button Example")){
			System.out.println("radio button title is matching");
		}else
		{
			System.out.println("radio button text is not matching");
		}
	}
	
	@Test
	public void validatebuttonselection() {
		
		if(ra.verifyradiobuttonselection()==true) {
			System.out.println("radio button is displayed");
		}else
		{
			System.out.println("radio button is not displayed");
		}
	
	}
  @Test
  
	private void validatebuttonselection1() {
	  if(ra.verifyradiobuttonselection1()==true) {
		  System.out.println("radiobutton is enabled");
	  }else {
		  System.out.println("radio button is not enabled");
	  }
  }
	  
	  @Test
	  

public void valiaidatebuttonselection2() throws InterruptedException {
	if(ra.verifyradiobuttonselection2()==true) {
		System.out.println("radio button is selected");
	}
	
	  else {
		  System.out.println("radio button is not selected");
	  }
}  
}