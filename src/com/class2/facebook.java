package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("sedademirkiran@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Amustafa1");
		driver.findElement(By.id("loginbutton")).click();
		
		
		String ex="https://www.facebook.com";
		String ac=driver.getCurrentUrl();
		
		if(ex.equals(ac)) {
			System.out.println("login successfull");
		}
		else {
			System.out.println("try again");
		}
		
		

	}

}
