package com.class8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Employee  extends CommonMethods{

	  public static void main(String[] args) throws InterruptedException {
		  
		  setup("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		  driver.findElement(By.id("txtUsername")).sendKeys("admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		  driver.findElement(By.id("btnLogin")).click();
		
		  WebDriverWait wait =new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[text()=\"PIM\"]")));
			 driver.findElement(By.xpath("//b[text()=\"PIM\"]")).click();
			 Thread.sleep(3000);
			  driver.findElement(By.id("menu_pim_addEmployee")).click();
			
			//Adding a new Employee
		        driver.findElement(By.id("menu_pim_addEmployee")).click();
		        driver.findElement(By.id("firstName")).sendKeys("Bartu");
		        driver.findElement(By.id("lastName")).sendKeys("Berke");
		        
		        String x=driver.findElement(By.id("employeeId")).getAttribute("value");
			
		        driver.findElement(By.id("btnSave")).click();
		        Thread.sleep(2000);
		        driver.findElement(By.id("menu_pim_viewEmployeeList")).click();  
		      
		   List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']//tbody/tr"));
	            
		    for(int i=1;i<rows.size();i++) {
		    	
		    	
		    	
		WebElement hepsi = driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr["+(i)+"]/td[2]"));
	    String eIDRow = hepsi.getText();
	    
		   
		    	if(eIDRow.equals(x)) {

	        
		    		driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr["+i+"]/td[1]")).click();
		    		   driver.findElement(By.id("btnDelete")).submit();
	                   System.out.println("The employee with id " +x+ " is deleted.");
	              
	                   break;
		    	
		    	 
		    }
		 	   }
		        
		    driver.findElement(By.xpath("//a[text()='Next']")).click();
		        
		        
			
			
		
		
		
		
	        
	        
	        
}}
