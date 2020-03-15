package com.class11;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Recap extends CommonMethods {

	public static void main(String[] args) {
		setup("chrome","https://www.google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone 11");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		
		
		
		
	}

}
