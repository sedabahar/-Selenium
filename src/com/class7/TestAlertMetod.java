package com.class7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class TestAlertMetod extends CommonMethods{
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/window-popup-modal-demo.html";

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setup("chrome", jirav_url);
		
		driver.findElement(By.linkText("Alerts & Modals")).click();

		driver.findElement(By.linkText("Javascript Alerts")).click();
			
		driver.findElement(By.xpath("//button[@onclick=\"myAlertFunction()\"]")).click();
		
		String getAlertText=getAlertText();
		System.out.println(getAlertText);
		
		AcceptAlert();
	    
		Thread.sleep(2000);
		
		
		
	}

}
