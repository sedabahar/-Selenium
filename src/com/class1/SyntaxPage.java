package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyntaxPage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://Syntaxtechs.com");
		driver.navigate().to("https://www.google.com");
		driver.navigate().back();
		driver.navigate().refresh();
		
		System.out.println(driver.getCurrentUrl());
		
		String except="https://syntaxtechs.com/";
		String actual=driver.getCurrentUrl();
		
		if(except.equals(actual)) {
			System.out.println("Both URL are matched");
		}
		else {
			System.out.println("Both URL are not matched");
		}

		
		
		
		
		
		
		
		
	}

}
