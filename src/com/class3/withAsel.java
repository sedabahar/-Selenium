package com.class3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withAsel {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://toolsqa.com/automation-practice-form/");
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("seda");
		driver.findElement(By.xpath("//input[@id=\"lastname\"]")).sendKeys("demirkiran");
		driver.findElement(By.xpath("//input[@id=\"sex-1\"]")).click();
		
		driver.findElement(By.xpath("//input[@id=\"datepicker\"]")).sendKeys("12/28/2019");
		
		//driver.findElement(By.xpath("//input[@type=\"radio\"]")).click();
		List<WebElement>radio=driver.findElements(By.xpath("//input[@type=\"radio\"]"));
		radio.get(1).click();
		System.out.println(".....................");
		String x=radio.get(1).getAttribute("value");
		System.out.println(x);
		System.out.println(".....................");
		radio.get(4).click();
		
		/*for(int i=0; i<radio.size();i++) {
			if(x.equalsIgnoreCase("female")) {
				radio.get(i).click();
				break;
			}
		}*/
	
	
	WebElement chbox=driver.findElement(By.xpath("//input[@value=\"Automation Tester\"]"));
		if(! chbox.isSelected()) {
			 chbox.click();
		}
		
		
		
		
		
		
		
	}

}
