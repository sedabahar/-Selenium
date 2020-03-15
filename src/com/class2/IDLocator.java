package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IDLocator {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		 
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 
		 Thread.sleep(3000);
		 
		driver.findElement(By.name("email")).sendKeys("sedademirkiran.gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Amustafa1");
		driver.findElement(By.id("loginbutton")).click();
		
		
		String act="https://www.facebook.com";
		String except=driver.getCurrentUrl();
		
		if(act.equals(except)) {
			System.out.println("login successful");
		}else {
			System.out.println("try again");
		}
		
		
	}

}
