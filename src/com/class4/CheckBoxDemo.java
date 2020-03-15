package com.class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utils.CommonMethods;

public class CheckBoxDemo extends CommonMethods {

	public static final String HRMS_URL="http://166.62.36.207/humanresources/symfony/web/inde";
	
	public static void main(String[] args) {
		CommonMethods.setup("chrome",HRMS_URL);
	     driver.get("htts://www.google.com");
	     driver.manage().window().fullscreen();
	
	//WebDriver driver=CommonMethods.setup("chrome");	
    //driver.findElement(By.linkText(""));		
		
		
		

	}

}
