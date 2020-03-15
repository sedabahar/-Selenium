package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class DinamicTableDemo extends CommonMethods {
	
	/*Navigate WebOrgers
	 * Login into WebOrgers
	 * click check box next to Bob Feather
	 */
	
	public static void main(String[] args) throws InterruptedException {
	
		setup("chrome","http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
	driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
	driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
	driver.findElement(By.id("ctl00_MainContent_login_button")).click();
	Thread.sleep(2000);
	String expectedText="Bob Feather";
	
	List<WebElement> allrows=driver.findElements(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr"));
	for(int i=1;i<allrows.size()-1;i++) {
		String x=allrows.get(i).getText();
		//System.out.println(x);
		if(x.contains(expectedText)) {
	driver.findElement(By.xpath("//table[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr["+(i+1)+"]/td[1]")).click();
		}
		
	}
	
	
	

}}
