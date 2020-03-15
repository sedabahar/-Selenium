package com.class7;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;
import com.utils.Constands;

public class ExplacitWaitDemo  extends CommonMethods {
	/*Navigate page
	 * click on other select dynamic data loading
	 * click get new user
	 * verify/validate the First Name element isDisplay()
	 */
	
	public static void main(String[] args) throws InterruptedException {
	
	setup("chrome",Constands.SYNTAX_PRACTICE_URL);
	
	driver.findElement(By.linkText("Others")).click();
	driver.findElement(By.linkText("Dynamic Data Loading")).click();
	driver.findElement(By.id("save")).click();
	
	//wait driver wait to wait ----->wait for specific element to appear on the
	//it will wait until expected condition is met or the specific time
	
	
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//p[starts-with(text(),'First Name ')]")));		
			
boolean displayed=driver.findElement(By.xpath("//p[starts-with(text(),'First Name ')]")).isDisplayed();
	if(displayed) {
		System.out.println("Pass");
	}
	else {
		System.out.println("Failed");
	}
	
	
	
	

	
	
	
}}
