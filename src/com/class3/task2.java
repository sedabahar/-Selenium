package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task2 {
	public static  String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

	WebDriver driver =new ChromeDriver();
	driver.get(URL);
WebElement username=	driver.findElement(By.xpath("//input[@id='txtUsername']"));
	username.sendKeys("Admin");
	//driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("helen123");
	driver.findElement(By.id("txtPassword")).sendKeys("");
	driver.findElement(By.className("button")).click();
	
	WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
	
	if(errorMessage.isDisplayed())//"//span[@id='spanMessage']"
	{
		String message=errorMessage.getText();
		
		System.out.println("....................");
		System.out.println(message);
		System.out.println("....................");
		if(message.equals("Password cannot be empty"))//compare the text with expected
		{
			System.out.println("Correct error message is displayed");
		}else
		{
			System.err.println("Incorrect message is displayed");
		}
	}

	
	
	
	
	
	
	
	
	

	}

}
