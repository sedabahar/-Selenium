package com.class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Task extends CommonMethods {
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	
	public static void main(String[] args) {
	
		CommonMethods.setup("chrome",jirav_url);

	driver.findElement(By.linkText("Alerts & Modals")).click();
	driver.findElement(By.linkText("Javascript Alerts")).click();
	driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]")).click();	
		
	Alert alert=driver.switchTo().alert();	
	alert.accept();
	
	String x=driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]")).getText();
	System.out.println(x);
	
	if(x.equals("Click me!")) {
		System.out.println("I am an alert box!");
	}else {
		System.out.println("not");
	}
	
	driver.findElement(By.xpath("//button[@onclick=\"myConfirmFunction()\"]")).click();
	Alert al=driver.switchTo().alert();
	al.accept();
	
	
		
		
	}

}
