package com.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MercuryTourTask {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://newtours.demoaut.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("seda");
		Thread.sleep(1000);
		driver.findElement(By.name("lastName")).sendKeys("demirkiran");
		Thread.sleep(1000);
		driver.findElement(By.name("phone")).sendKeys("7037281756");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("sedademirkiran@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("address1")).sendKeys("8309 old sonoma place");
		Thread.sleep(1000);
		driver.findElement(By.name("city")).sendKeys("Bristow");
		Thread.sleep(1000);
		driver.findElement(By.name("state")).sendKeys("VA");
		Thread.sleep(1000);
		driver.findElement(By.name("postalCode")).sendKeys("20136");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("baharseda");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("amustafa1");
		Thread.sleep(1000);
		driver.findElement(By.name("confirmPassword")).sendKeys("amustafa1");
		Thread.sleep(1000);
		driver.findElement(By.name("register")).click();
		
		String excep="http://newtours.demoaut.com/";
		String ac=driver.getCurrentUrl();
		
		if(ac.equals(ac)) {
			System.out.println("login successful");
		}
		else {
			System.out.println("try again");
		}
		
		
		
		
	}

}
