package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ExplacitWaitDemo2  extends CommonMethods{

		
	/*
	 * navigate google
	 * search for wegmans
	 * click on the link "Wegmans Grocery Delivery | Powered By Instacart
	 * once we refirected to the side click "Log In"
	 * 
	 */
		
		public static void main(String[] args) throws InterruptedException {
		
		
		setup("chrome","https://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Wegmans");
		//send Wegmans text and hit enter
		//driver.findElement(By.name("q")).sendKeys("Wegmans,Keys.ENTER");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);//you can use click();same
		//click on the first link on result page
		driver.findElement(By.xpath("//h3[text()='Wegmans Food Markets - Fresh Groceries & Delicious Meals']")).click();
		//click login
		//driver.findElement(By.linkText("Log in")).click();
		System.out.println("----- LogIn was clicked -----");
		
		
		driver.findElement(By.id("sign-in")).click();
		
		
		
		
		
		
		
		
		
		
		
	}

}
