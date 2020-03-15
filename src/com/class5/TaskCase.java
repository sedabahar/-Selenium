package com.class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TaskCase  extends CommonMethods{
public static String url="https://www.seleniumeasy.com/test/javascript-alert-box-demo.html";
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setup("chrome", url);	
		
		driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]")).click();
		
		
		Alert alert=driver.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		driver.findElement(By.xpath("//button[@onclick=\"myConfirmFunction()\"]")).click();
		
		Alert alertt=driver.switchTo().alert();
		alertt.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick=\"myPromptFunction()\"]")).isEnabled();
		
		Alert al=driver.switchTo().alert();
		al.sendKeys("Sus herf Bok");
	 
		al.accept();
		
		
		
		
		
		
	}

}
