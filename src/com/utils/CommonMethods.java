package com.utils;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CommonMethods {


	public static WebDriver driver;
	public static void setup(String browser, String url) {
		
		/**
		 * Use this method in need of opening browser and target url
		 * 
		 * 
		 * @param browser The desired browser
		 * @param url The desired url
		 */
		
		
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			 driver=new ChromeDriver();
			  driver.get(url);
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.chrome.driver", "drivers/geckodriver");
			 driver=new FirefoxDriver();
			 driver.get(url);
		}
		else {
			System.out.println("Browser not supported");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		
		
		
		
		
	}
	/**
	 * This Alert will accept the alert
	 * 
	 * @throws will throw NoAlertPresentException if alert is not present
	 * 
	 */
	
		
		public static void AcceptAlert() {
			
			try{
				Alert alert=driver.switchTo().alert();
				alert.accept();
			}catch(NoAlertPresentException e) {
				System.out.println("Alert is not present");
			}
		}
		
		/**
		 * This method will method scroll page up
		 * @param pixel
		 */
		
		public static void scrollDown(int pixel) {
			JavascriptExecutor js=(JavascriptExecutor )driver;
			js.executeScript("window.scrollBy(0,"+ pixel + ")");
		}
		
		
		/**
		 * This method will method scroll page up
		 * @param pixel
		 */
		public static void scrollUp(int pixel) {
			JavascriptExecutor js=(JavascriptExecutor )driver;
			js.executeScript("window.scrollBy(0,-"+pixel+")");
		}
		
		
		/**
		 * This method will click on the element using JSExecutor
		 * @param element
		 */
		public static void jsClick(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor )driver;
			js.executeScript("arguments[0].click();",element);
		}
		/**
		 * This method will scroll until until specified element
		 * @param element
		 */
		
		public static void scrollIntolElement(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor )driver;
			js.executeScript("arguments[0].scrollIntoView(true)",element);
		}
		
		/**
		 * This Alert will dismiss the alert
		 * 
		 * @throws will throw NoAlertPresentException if alert is not present
		 * 
		 */
		
       public static void dismissAlert() {
			
			try{
				Alert alert=driver.switchTo().alert();
				alert.dismiss();
			}catch(NoAlertPresentException e) {
				System.out.println("Alert is not present");
			}
		}
		
       
       /**
		 * This method will get a text from the alert
		 * 
		 * @return text of the alert
		 * @throws will throw NoAlertPresentException if alert is not present
		 */
		
		
		public static String getAlertText() {
			String alertText = null;
			try{
				Alert alert=driver.switchTo().alert();
				alertText=alert.getText();
			}catch(NoAlertPresentException e) {
				System.out.println("Alert is not present");
			}
			return alertText;
			
			
			
			
		}
		/**
		 * This method will switch to the frame
		 * @param nameORid
		 */
		
		
	       public static void switchToFrame(String nameORid) {
				
				try{
					driver.switchTo().frame(nameORid);
					
				}catch(NoSuchFrameException e) {
					System.out.println("Frame is not present");
				}
			}
			
	       
	       
	       
	       
	       /**
			 * This method will switch to the frame
			 * @param elemet
			 */
	       public static void switchToFrame(WebElement elemet) {
				
				try{
					driver.switchTo().frame(elemet);
					
				}catch(NoSuchFrameException e) {
					System.out.println("Frame is not present");
				}
			}
			
	       
	       
	       
	       
		
	       /**
			 * This method will switch to the frame
			 * @param index
			 */
	       public static void switchToFrame(int index) {
				
				try{
					driver.switchTo().frame(index);
					
				}catch(NoSuchFrameException e) {
					System.out.println("Frame is not present");
				}
			}
			
		
		
		// commond+o yaz ne var gor----> to see all method within the class
	    

			public static void takeScreenshot(String fileName) {
			TakesScreenshot ts=(TakesScreenshot)driver;
				File file=ts.getScreenshotAs(OutputType.FILE);
				
				try {
					  FileUtils.copyFile(file, new File("ScreenShots/HRMS/"+fileName+".pg"));
				} catch (IOException e) {
					System.out.println("Cannot take a screenshot");
				}
			}
	
	

}
