package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		String expectedUrl="https://www.google.com/" ;
		String actualUrl=driver.getCurrentUrl();
		System.out.println(actualUrl);
	
		
		if(expectedUrl.equals(actualUrl)) {
			System.out.println("Both URL matched");
		}
		else {
			System.out.println("Both URL not matched");
		}
		
	}

}
