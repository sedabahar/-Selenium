package com.class9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class Airplane  extends CommonMethods {

	 public static void main(String[] args) throws InterruptedException {
				  
		setup("chrome","https://www.aa.com/homePage.do");		 
		
		//driver.findElement(By.linkText("From airport look up")).click();
		//driver.findElement(By.xpath("//input[@class='icon icon-search']")).click();
		
		
		Thread.sleep(2000);
	//driver.findElement(By.id("airportLookupDialogButton0")).click();
		
driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger']")).click();

boolean flag=false;
String month=driver.findElement(By.xpath("//div[contains(@class,'ui-corner-left')]/div/span")).getText();
System.out.println(month);	
while(!flag) {
	
	if(month.equals("March 2020")) {
		List<WebElement>allMonth=driver.findElements(By.xpath("//div[contains(@class,'ui-corner-left')]/following-sibling::table"));
		for(WebElement all:allMonth) {
			String days=all.getText();
			if(days.equals("14")) {
				all.click();
				flag=true;
				break;
			}
		
		}	
	}else {
				driver.findElement(By.xpath("//a[@title='Next']")).click();
			}
		
	}

	
	
	
	
	
	
	

	}

}
