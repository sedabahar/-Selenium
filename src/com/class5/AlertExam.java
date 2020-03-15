package com.class5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AlertExam extends CommonMethods {
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setup("chrome",jirav_url);
		
 driver.findElement(By.linkText("Alerts & Modals")).click();


	driver.findElement(By.linkText("Javascript Alerts")).click();

	
driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]")).click();
Alert alert=driver.switchTo().alert();
alert.accept();

driver.findElement(By.xpath("//button[@onclick=\"myConfirmFunction()\"]")).click();

Alert al=driver.switchTo().alert();
al.accept();

driver.findElement(By.xpath("//button[@onclick=\"myPromptFunction()\"]")).click();


Alert all=driver.switchTo().alert();
all.sendKeys("Seda");
all.accept();




	}

}
