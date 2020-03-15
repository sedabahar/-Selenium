package com.class1;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.Ebay.com");
		String title=driver.getTitle();
		String ebayActual="Ebay.com";
		
		if(title.equals(ebayActual)) {
			System.out.println("You are on right page");
		}else {
			System.out.println("keep searching");
		}
		

	}

}
