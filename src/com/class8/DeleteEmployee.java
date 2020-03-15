package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class DeleteEmployee extends CommonMethods{

	  public static void main(String[] args) throws InterruptedException {
	       
		 
		  setup("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		  driver.findElement(By.id("txtUsername")).sendKeys("admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		  driver.findElement(By.id("btnLogin")).click();
		  WebDriverWait wait=new WebDriverWait(driver,15);
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//b[text()=\"PIM\"]")));
		
		 
		  driver.findElement(By.id("menu_pim_addEmployee")).click();
		  driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		  
			
		 
		  List<WebElement>rows=driver.findElements(By.xpath("//table[@class='table hover']/tbody/tr"));
		  Thread.sleep(2000);
		  
		  String id=driver.findElement(By.xpath("//input[@name='personal[txtEmployeeId]']")).getAttribute("value");
		  		for(int j=1;j<rows.size();j++){
		  			
		  			String text=rows.get(j).getText();
		  		
		  			if(text.contains(id)) {
		  			
		  			System.out.println("Pass");
		  			
		  				rows.get(j).findElement(By.tagName("input")).click();
		  				
		  		driver.findElement(By.xpath("//input[@id=\"btnDelete\"]")).click();
		  		driver.findElement(By.xpath("//input[@id=\"dialogDeleteBtn\"]")).click();
		  		break;
		  			}
		 
		  		driver.findElement(By.xpath("//li//a[@href='javascript:submitPage']")).click();
		  }		
		 
		  	

}}
