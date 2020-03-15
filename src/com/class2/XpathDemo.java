package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");	
	driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("sedademirkiran.gmail.com");;
	driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Amustafa1");
	driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
	String ex="https://www.facebook.com";
	String cur=driver.getCurrentUrl();
	if(ex.equals(cur)) {
		System.out.println("succesfull");
	}
	else {
		System.out.println("try again");
	}
		
		
		
	}

}
