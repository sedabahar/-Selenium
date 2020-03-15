package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class checkboxdemo2 extends CommonMethods {
	
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";	
	

	public static void main(String[] args) {
		CommonMethods.setup("chrome",jirav_url);
		
        driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
		List<WebElement>value=driver.findElements(By.xpath("//input[@name=\"optradio\"]"));
		
		//System.out.println(value.get(0).getAttribute("value"));
		
      for(WebElement x:value) {
	  String text=x.getAttribute("value");

	  
	    if(text.equals("Male")) {
		 x.click();
	     }
	 
  }
		
		
		
		
		
		
	}

}
