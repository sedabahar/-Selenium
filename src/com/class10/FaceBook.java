package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class FaceBook extends CommonMethods{

	public static void main(String[] args) {
setup("chrome","https://www.facebook.com");	
		
WebElement all=driver.findElement(By.xpath("//select[@name='birthday_month']"));
Select select=new Select(all);
select.selectByVisibleText("May");	

	List<WebElement>all1=driver.findElements(By.xpath("//label[@class='_58mt']"));
	all1.get(0).click();
		
		
	}

}
