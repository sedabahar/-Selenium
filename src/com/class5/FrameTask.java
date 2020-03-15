package com.class5;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class FrameTask extends CommonMethods {

	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
	//swich to frame use id,name
		CommonMethods.setup("chrome", jirav_url);
		
		driver.findElement(By.linkText("Others")).click();

		driver.findElement(By.linkText("Iframe")).click();
		
		
		  driver.switchTo().frame("FrameOne");
		  
		  
      driver.findElement(By.linkText("Home")).click();
      
      
      
    driver.switchTo().defaultContent();
      
      Thread.sleep(2000);
      
      
      driver.switchTo().frame("FrameTwo");
    
		  
   boolean logoDisplayed=driver.findElement(By.xpath("//img[@alt='Syntax Technologies']")).isDisplayed();
    
		System.out.println("Syntax logo displayed?: "+logoDisplayed);
		
	
		
		
		
		
		
		
		
	}

}
