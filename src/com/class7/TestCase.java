package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class TestCase  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		setup("chrome","https://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Dynamic Controls")).click();
		
		driver.findElement(By.xpath("//button[@onclick=\"swapCheckbox()\"]")).click();
	Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Add']")).click();
		

	boolean x=driver.findElement(By.xpath("//button[text()='Add']")).isDisplayed();
	if(x) {
		System.out.println("passed");
	}
	else {
		System.out.println("failed");
	}
		
	}

}
