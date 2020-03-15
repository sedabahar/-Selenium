package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class AdvancedXPAXH extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		//Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
			//Login to the application by writing xpath based on “parent and child relation”

 setup("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");

 driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
 
 driver.findElement(By.xpath("//form[@id='frmLogin']/div[3]/input")).sendKeys("Hum@nhrm123");
 
 driver.findElement(By.xpath("//form[@id='frmLogin']/div[5]/input")).click();
 
 Thread.sleep(3000);
 
 driver.close();		
		
		
		
		
		
		
		
		
	}

}
