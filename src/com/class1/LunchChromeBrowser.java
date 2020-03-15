package com.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		//System.out.println(driver.getTitle());
		//Thread.sleep(1000);
		driver.navigate().to("http://www.syntaxtchs.com");
		//driver.navigate().to("http://www.facebook.com");
		driver.navigate().forward();
		
		//driver.close();
		

	}

}
