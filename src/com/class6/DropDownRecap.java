package com.class6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class DropDownRecap extends CommonMethods {
	
	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods .setup("chrome", "https://www.ebay.com");	
		
		
		
	WebElement web=driver.findElement(By.cssSelector("select#gh-cat"));
	
	
	
	Select sel=new Select(web);
	
	
	List<WebElement>all=sel.getOptions();
	
	//validate each options is clickable();
	//validate use can select "Music"
	//for(WebElement we:all) {
		//we.click();
		Thread.sleep(2000);
		//sel.selectByVisibleText("music");
		//boolean isSelected=false;
		for(WebElement we:all) {
			String x=we.getText();
			if(x.equals("music")) {
				sel.selectByVisibleText(x);
				//isSelected=true;
				we.click();
				break;
			}
			
			
			
			
			
	}
	
	
	
	
	
	
	
	
	

}}
