package com.class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertDEmo1 extends CommonMethods  {
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
	CommonMethods.setup("chrome",jirav_url);
		
		driver.findElement(By.linkText("Alerts & Modals")).click();
		
		driver.findElement(By.linkText("Javascript Alerts")).click();
	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//button[@onclick=\"myConfirmFunction()\"]")).click();
		Thread.sleep(2000);
		
		Alert alertt=driver.switchTo().alert();
		alertt.accept();
		
	 
		
		
		
		
		
		

}}
