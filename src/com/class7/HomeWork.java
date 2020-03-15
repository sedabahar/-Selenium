package com.class7;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class HomeWork  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setup("chrome"," https://the-internet.herokuapp.com/");
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		
		driver.findElement(By.xpath("//a[starts-with(text(),'Example 1: Element')]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Start']")).click();

		 boolean x=driver.findElement(By.xpath("//div[@id=\"content\"]")).isDisplayed();
		 
		 if(x) {
				System.out.println("Hello World!");
			}
				
			else {
				System.out.println("NO");
			}
			
			
		
		
		
		

	}

}
