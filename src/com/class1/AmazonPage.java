package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://Amazon.com/");
		
		//System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		
	}

}
