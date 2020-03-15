package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class TableTaskCase extends CommonMethods{

	
	public static void main(String[] args) throws InterruptedException {
		
		setup("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	
		String expectedText="Susan McLaren";
		
	List<WebElement> allrows=driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr"));
	for(WebElement all:allrows)	{
		String x=all.getText();
		boolean display=driver.findElement(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr")).isDisplayed();
		if(display) {
			System.out.println("Susan McLaren is Display");
		}
	}
	driver.findElement(By.xpath("//input[@onclick=\"javascript:__doPostBack('ctl00$MainContent$orderGrid','editOrder$4')\"]")).click();
		
	driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).clear();
   driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys("John David");
	
   driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
   List<WebElement> allrow=driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr"));
		String expected="John David";
   for(WebElement all:allrow)	{
		String y=all.getText();
		
		if(y.contains(expected)) {
			System.out.println("John David is Display");
		}
	}
	
	
}}
