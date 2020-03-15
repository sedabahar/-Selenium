package com.class4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class ChexkBOXandRADIObox extends CommonMethods{

	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
	
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
		
for(int i=0;i<button.size();i++) {
	String take=button.get(i).getAttribute("value");
	System.out.println(take);
}
		
		button.get(0).click();
		String r=button.get(2).getAttribute("value");
		System.out.println(r);

}}
