package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageCommands {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	
	WebDriver drive=new ChromeDriver();
		
	drive.get("http://google.com");	
	//drive.navigate().to("http://www.facebook.com");
	
	String actualTitle=drive.getTitle();
	System.out.println(actualTitle);
	
	//String expected="Facebook - Log In or Sign Up";
	
	if(actualTitle.equals("Facebook - Log In or Sign Up")) {
		
		System.out.println("expected title match 'Facebook Log in or Sign up ");
	}
	else {
		System.out.println("Both Title did not match");
	}
		
		
		
		
		
		

	}

}
