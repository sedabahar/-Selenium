package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver drive=new ChromeDriver();
		
		drive.get("http://google.com");
		
		String title=drive.getTitle();
		System.out.println(title);
		
		final String expectedTitle="Google";
		
		if(expectedTitle.equalsIgnoreCase(title)) {
			System.out.println("I am on the right matched");
		}
		else {
			System.out.println("expectedTitle and title did not matched");
		}
		
		

	}

}
