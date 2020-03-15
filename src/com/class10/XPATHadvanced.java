package com.class10;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class XPATHadvanced extends CommonMethods{

	public static void main(String[] args) {
		// Navigate to “http://166.62.36.207/humanresources/symfony/web/index.php/auth”
		//Login to the application by writing xpath based on “following and preceding siblings”

		 setup("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");
		
		 driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
			driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input")).sendKeys("Hum@nhrm123");
			driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
			
		
	}

}
