package com.class5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class DropDown extends CommonMethods{
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setup("chrome",jirav_url);
		//if tagname start with select use -----> Select s=new Select()
		//s.selectbyValue ve s.selectbyVisiableText same "Friday"
		//but s.selectIndex(1)
		//how to get count of the dropdown items?
		
		//List<WebElement>options=s.getOptions();
		//System.out.println(options.size());
		//----->This will give you the number of the items in dd
		
		CommonMethods.setup("chrome",jirav_url);
		//driver.manage().window().fullscreen();

		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
	
		driver.findElement(By.linkText("Checkbox Demo")).click();

Thread.sleep(2000);
WebElement x= driver.findElement(By.xpath("//input[@id=\"isAgeSelected\"]"));
		
		
		//System.out.println(x.isSelected());
		x.click();
		
		if(!x.isSelected()) {
			x.click();
		}
		
		List<WebElement>button=driver.findElements(By.xpath("//input[@class='cb1-element']"));
		
	//driver.findElement(By.xpath("//input[@value='Option-1']")).click();
		
		button.get(0).click();
		String r=button.get(2).getAttribute("value");
		System.out.println(r);
	

		
		
		
		
		
	}

}
