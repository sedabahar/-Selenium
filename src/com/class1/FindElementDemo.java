package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chrome.driver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		
		
		
		
		

	}

}
