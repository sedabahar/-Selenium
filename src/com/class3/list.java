package com.class3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class list {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		List<WebElement>list=driver.findElements(By.tagName("a"));
		
		for(WebElement web:list) {
			
			String x=web.getText();
			
			if(!x.isEmpty()) {
				System.out.println(x);
			}
		}
		
		
		
		
		
		
	}

}
