package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class ben   extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		setup("chrome","https://www.aa.com/homePage.do");	
		
		driver.findElement(By.id("aa-leavingOn")).click();
		boolean flag=false;
		while(!flag) {
			
			WebElement m=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));	
		String al=m.getText();
	
		
		if(al.equals("May")) {
			
	List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
			Thread.sleep(1000);
	for(WebElement days:cells) {
		
		String day=days.getText();
		
		if(day.equals("12")) {
			Thread.sleep(1000);
			days.click();
			flag=true;
			break;
		}
	}break;
		}
		
		else{
			driver.findElement(By.xpath("//a[@title='Next']")).click();
		}
		
		}
		

	}

}
