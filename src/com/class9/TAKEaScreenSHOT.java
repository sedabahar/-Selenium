package com.class9;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class TAKEaScreenSHOT  extends CommonMethods{

	  public static void main(String[] args) throws InterruptedException {
		  
		  CommonMethods .setup("chrome", "https://www.ebay.com");	
			
			
			
			WebElement web=driver.findElement(By.cssSelector("select#gh-cat"));
			
			
			
			Select sel=new Select(web);
			sel.selectByVisibleText("Books");
			driver.findElement(By.xpath("//input[@id=\"gh-btn\"]")).click();
			
			
			//List<WebElement>driver.findElements(By.cssSelector("select#gh-cat"));
			//System.out.println(option);
			//String x=web.getText()	;
			//System.out.println(x);
			
			
			Thread.sleep(5000);
			TakesScreenshot ts=(TakesScreenshot)driver;
			File screen=ts.getScreenshotAs(OutputType.FILE);
			try {
			
		    FileUtils.copyFile(screen, new File("screenshots/HRMS/Ebay.pg"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
				
				Thread.sleep(5000);
				
				//driver.quit();
				
				
				
				
		  
		  
		  
		  
	}

}
