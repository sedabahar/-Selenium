package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class example  extends CommonMethods {
	public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";	
	public static void main(String[] args) {
		
		CommonMethods.setup("chrome", url);
		   driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
			driver.findElement(By.linkText("Select Dropdown List")).click();
			
			WebElement x=driver.findElement(By.id("select-demo"));
			
			Select s=new Select(x);
			s.selectByVisibleText("Monday");

		WebElement web=driver.findElement(By.id("multi-select"));
	System.out.println("first way.............................................");
		Select se=new Select(web);
		se.selectByVisibleText("New Jersey");	
		System.out.println("second way.............................................");
List<WebElement >list=se.getOptions();
		
		for(WebElement el:list) {
			String str=el.getText();
		
			if(str.equals("New Jersey")) {
				el.click();
			}
		}
		

		driver.findElement(By.xpath("//button[@id=\"printAll\"]")).click();
			
	


}}
