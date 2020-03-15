package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RaidoButton extends CommonMethods {

	public static final String Syntax_Practice_Url="http://166.62.36.207/syntaxpractice/index.html";
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setup("chrome", Syntax_Practice_Url);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		//driver.manage().window().fullscreen();
	WebElement x=driver.findElement(By.xpath("//input[@value=\"Male\" and @name=\"optradio\"]"));
		//x.click();
		System.out.println(x.isSelected());
		x.click();
		System.out.println(x.isSelected());
		//use name for group of an object
		
		List<WebElement> button=driver.findElements(By.xpath("//input[@name=\"optradio\"]"));
		
		for(int i=0; i<button.size();i++) {
			button.get(i).click();
			
			
			boolean isSelected=button.get(i).isSelected();
			System.out.println(isSelected);
			
			if(!isSelected) {
				button.get(i).click();
			}
			
			
		}
		
		
		
		
		
		
	}

}
