package com.class5;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Frame extends CommonMethods {
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
	//swich to frame use id,name
		CommonMethods.setup("chrome", jirav_url);
		
		driver.findElement(By.linkText("Others")).click();
		driver.findElement(By.linkText("Iframe")).click();
		
	String mainWindow=	driver.findElement(By.xpath("//h2[text()='IFrame practice']")).getText();
	System.out.println("This text from main window: "+mainWindow);
	Thread.sleep(2000);	
	driver.switchTo().defaultContent();

	}

}
