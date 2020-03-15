package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDown  extends CommonMethods {

	public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";	
	
	
	public static void main(String[] args) {

		CommonMethods.setup("chrome", url);
		
		  driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		driver.findElement(By.linkText("Select Dropdown List")).click();
   WebElement x=driver.findElement(By.id("select-demo"));

       Select s=new Select(x); 
		//s.selectByIndex(4);
       
       s.selectByVisibleText("Tuesday");
       System.out.println("***************************************************");
       List<WebElement>option=s.getOptions();
       
       System.out.println(option.size());
       
       System.out.println("***************************************************");
       //you can not deselect with single but you can desele ct with multiple
  WebElement list=driver.findElement(By.xpath("//select[@id=\"multi-select\"]"));
   Select se=new Select(list);
   se.selectByVisibleText("New Jersey");    
       
     driver.findElement(By.xpath("//button[@id=\"printAll\"]")).click(); 
       
       
       
	}

}
