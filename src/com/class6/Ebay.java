package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class Ebay  extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods .setup("chrome", "https://www.ebay.com");	
	WebElement web=driver.findElement(By.xpath("//select[@class=\"gh-sb \"]"));
		
		Select sel=new Select(web);
		
		String x=web.getText();
		System.out.println(x);
		sel.selectByVisibleText("Musical Instruments & Gear");
		web.click();
		
		driver.findElement(By.xpath("//input[@class=\"btn btn-prim gh-spr\"]")).click();
		
		System.out.println("--------->Second Way<----------");
		
	
	
		
		
		
	}
		

}
