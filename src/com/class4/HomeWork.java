package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class HomeWork extends CommonMethods  {

public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";		
	
	
	public static void main(String[] args) {
	
		CommonMethods.setup("chrome", url);
		
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();

		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
	List<WebElement>select=driver.findElements(By.xpath("//input[@name=\"optradio\"]"));

		
		for(WebElement web:select) {
			String x=web.getAttribute("value");
			if(x.equals("Female")) {
				web.click();
			}
		}
	
		//driver.findElement(By.linkText("Checkbox Demo")).click();
		
		//WebElement x=driver.findElement(By.xpath("//input[@id=\"isAgeSelected\"]"));
		//System.out.println(x.isSelected());
		//x.click();
		//System.out.println(x.isSelected());
		
		
		//WebElement a =driver.findElement(By.linkText("Multiple Checkbox Demo"));
		//driver.findElement(By.xpath("//input[@id=\"check1\"]")).click();
		
		
		
		
		
		
	}

}
