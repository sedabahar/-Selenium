package com.class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class HomeWork  extends CommonMethods{
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) {
		
		CommonMethods.setup("chrome", jirav_url);
		
		driver.findElement(By.linkText("Input Forms")).click();
		
		driver.findElement(By.linkText("Checkbox Demo")).click();
		driver.findElement(By.xpath("//input[@id=\"isAgeSelected\"]")).click();
		
		boolean x=driver.findElement(By.xpath("//input[@id=\"isAgeSelected\"]")).isDisplayed();
		System.out.println(x);
		if(x) {
			System.out.println("login success");
		}
		else {
			System.out.println("not");
		}
	
		
		//
		
		
		
		
		
		
		
	}

}
