package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("sohilaryan");
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Syntax@12");
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		
		
		
		WebElement logo=driver.findElement(By.xpath("//*[@id=\"branding\"]/a[1]"));
		
		if(logo.isDisplayed()) {
			System.out.println("correct");
		}
		
		
	}

}
