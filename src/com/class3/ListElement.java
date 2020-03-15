package com.class3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListElement {

	public static void main(String[] args) throws Exception {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
	    WebDriver driver=new ChromeDriver();
		
		driver.get("http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("sohilaryan");;
		driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Syntax@12");;
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
		
		
	List<WebElement> obj=driver.findElements(By.tagName("a"));
		
		for(WebElement x:obj) {
		
			String str=x.getText();
		
			System.out.println(str);
			
		}
		
		
		
		
	}

}
