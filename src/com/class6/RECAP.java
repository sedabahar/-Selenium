package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class RECAP extends CommonMethods {
	public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		 CommonMethods .setup("chrome",url );
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//handle group of radio of check box
List<WebElement> allCheckBox=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
		for(WebElement web:allCheckBox) {
			
			String text=web.getAttribute("value");
			System.out.println("Text from a check box "+text);
			if(text.equals("Option-2")) {
				web.click();
				}
		}
	
		//WebElement x=driver.findElement(By.xpath("//input[@class='cb1-element']"));
		//Select select=new Select(x);
	//select.selectByVisibleText("Option 2");
		
		
		
		
		
		
	}

}
