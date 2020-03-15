package com.class6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class MultipleWindow  extends CommonMethods{
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/window-popup-modal-demo.html";

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setup("chrome", jirav_url);

		 driver.findElement(By.linkText("Follow On Instagram")).click();
		 driver.findElement(By.linkText("Like us On Facebook")).click();
		 driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		
		//store one window id
		String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
		
	//collects all window id 
		
		Set<String>all=driver.getWindowHandles();
		System.out.println(all.size());
		
		Iterator<String>it=all.iterator();
		
while(it.hasNext()) {
			
			String child=it.next();
			if(!child.equals(mainWindow)) {
				
			driver.switchTo().window(child)	;
			System.out.println(driver.getTitle());
			
			driver.close();
			driver.switchTo().window(mainWindow);
			
			
			}
		}
		
		
		
		
		
}}
