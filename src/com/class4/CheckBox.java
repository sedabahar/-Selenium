package com.class4;


import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class CheckBox extends CommonMethods {
	

	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
	
		CommonMethods.setup("chrome",jirav_url);
		//driver.manage().window().fullscreen();
	
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
	
		driver.findElement(By.linkText("Checkbox Demo")).click();
	
	WebElement x= driver.findElement(By.xpath("//input[@id=\"isAgeSelected\"]"));
		
		System.out.println(x.isSelected());
		x.click();
		System.out.println(x.isSelected());
		
		if(!x.isSelected()) {
			x.click();
		}
	//storing the group of check box	
	List<WebElement>button=driver.findElements(By.xpath("//input[@class=\"cb1-element\"]"));
		
	if(!button.isEmpty()) {
		
		Iterator<WebElement>it=button.iterator();
		
		Thread.sleep(2000);
		
		while(it.hasNext()) {
			it.next().click();
		}
	}
		else {
		System.out.println("List is Empty check your xPath");	
		
	}
	
		
	
	
	
	
	
	
	
		
}}
