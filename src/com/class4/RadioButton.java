package com.class4;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class RadioButton extends CommonMethods {

	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) {
	
		CommonMethods.setup("chrome",jirav_url);
		
		driver.findElement(By.xpath("//a[text()='Input Forms']")).click();
		
		driver.findElement(By.linkText("Radio Buttons Demo")).click();
		
	
 List<WebElement>button=driver.findElements(By.xpath("//input[@name=\"optradio\"]"));
 
		for(int i=0; i<button.size();i++){
			
		    button.get(i).click();
		    
		   boolean isSelected=button.get(i).isSelected();
		   System.out.println(isSelected);
		   
		   if(!isSelected) {
			   
			   button.get(i).click();
		   }
		    
		}
		
		
		
		
		
		
		

	}

}
