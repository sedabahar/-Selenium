package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		  driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("");
	        driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("Syntax@2");
	        driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
	        	
	        
	        
	    	WebElement x=driver.findElement(By.xpath("//span[@id='spanMessage']"));
	        
	          String a=x.getText();
	        
	        if(a.equals("Username cannot be empty")) {
	        	System.out.println("correct ");
	        }
	        else {
	        	System.out.println("wrong");
	        }
	       
        
        
        
        
	}}
