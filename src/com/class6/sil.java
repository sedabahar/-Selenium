package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class sil extends CommonMethods {
	public static final String url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		 CommonMethods .setup("chrome",url );
		// driver.manage().window().fullscreen();
		driver.findElement(By.linkText("Input Forms")).click();
		driver.findElement(By.linkText("Checkbox Demo")).click();
		Thread.sleep(2000);
	
		List<WebElement>all=driver.findElements(By.xpath("//input[@class=\"cb1-element\"]"));
		
		for(WebElement web:all) {
			String x=web.getAttribute("value");
			System.out.println("All attribute : "+x);
			if(x.equals("Option-4")) {
				web.click();
				break;
			}
		}
		
		
		
		
		

	}

}
