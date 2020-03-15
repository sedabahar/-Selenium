package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.utils.CommonMethods;

public class Actionn extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setup("chrome","https://www.google.com");
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Iphone 11",Keys.ESCAPE);
		
		Actions act=new Actions(driver);
		
		//identfy an element
		
		WebElement button=driver.findElement(By.name("btnk"));
		//1.way -
		act.moveToElement(button).click().perform();
		//2.way-click and spesfy the element on which to click
		act.click(button).perform();
		
		Thread.sleep(3000);
 driver.quit();
	}

}
