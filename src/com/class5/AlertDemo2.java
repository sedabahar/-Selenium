package com.class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertDemo2 extends CommonMethods {
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setup("chrome",jirav_url);
		
driver.findElement(By.linkText("Alerts & Modals")).click();
		
		driver.findElement(By.linkText("Javascript Alerts")).click();
		
		//driver.findElement(By.xpath("//[@onclick='myPromptFunction()']")).click();
	 
	driver.findElement(By.xpath("//button[@onclick=\"myPromptFunction()\"]")).click();
		
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Berke");
		alert.accept();
		
		
		
		
	}

}
