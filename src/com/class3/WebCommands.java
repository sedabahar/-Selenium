package com.class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebCommands {
	public static final String URL="http://166.62.36.207/humanresources/symfony/web/index.php/auth/login";
	
		
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			WebDriver driver =new ChromeDriver();
			driver.get(URL);
		WebElement username=driver.findElement(By.xpath("//input[@id='txtUsername']"));
			username.sendKeys("Admin");
			//it will clear the text box or text area
			username.clear();
			Thread.sleep(2000);
			username.sendKeys("helen");
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("helen123");
			driver.findElement(By.xpath("//input[@type='submit']")).click();
			WebElement errorMessage=driver.findElement(By.xpath("//span[@id='spanMessage']"));
			System.out.println(errorMessage.isDisplayed());//checking if error message is displayed
			String errorMsg=errorMessage.getText();//get visible text from error message
			//System.out.println(errorMsg);
			if(errorMessage.isDisplayed())
			{
				String message=errorMessage.getText();
				if(message.equals("Invalid credentials"))//compare the text with expected
				{
					System.out.println("Correct error message is displayed");
				}else
				{
					System.err.println("Incorrect message is displayed");
				}
			}
		}
	}