package com.class8;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class EMPLOOYEEDELETE  extends CommonMethods{

	  public static void main(String[] args) throws InterruptedException {
	       
		 
		  setup("chrome", "http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
		  driver.findElement(By.id("txtUsername")).sendKeys("admin");
		  driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		  driver.findElement(By.id("btnLogin")).click();
		
		//varify employee added picture element al.getText();
		  //sonra gercek isimle karsilastir if ile
		
		
		
		
	  }

}
