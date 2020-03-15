package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpInstegram {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name=\"emailOrPhone\"]")).sendKeys("5starbeststore@gmail.com");
		driver.findElement(By.xpath("//input[@name=\"fullName\"]")).sendKeys("seda demirkiran");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("sedademirkiran8");
		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("amustafa1");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		String expec="https://www.instagram.com";
		String ac=driver.getCurrentUrl();
		
		if(expec.equals(ac)) {
			System.out.println("login successful");
		}
		else {
			System.out.println("Not successful");
		}

		
		
		
	}

}
