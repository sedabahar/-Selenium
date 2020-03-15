package com.class6;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class RecapMultipleWindow  extends CommonMethods{
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/window-popup-modal-demo.html";

	public static void main(String[] args) throws InterruptedException {

		CommonMethods.setup("chrome", jirav_url);
		//get windowHandles();
		//Identify parent child
		//switch
		String mainWindow=driver.getWindowHandle();
		System.out.println(mainWindow);
     driver.findElement(By.linkText("Follow On Instagram")).click();
	
	Set<String> allWindows=driver.getWindowHandles();
	Iterator<String> it=allWindows.iterator();
	
	String parent=it.next();//return first element 
	System.out.println("parentTitle ----->"+parent);
	System.out.println("------------------------------------------");
	String child=it.next();
	System.out.println("childTitle ----->"+child);
	
	driver.switchTo().window(child);
	
	String childTitle=driver.getTitle();
	System.out.println(childTitle);
	
	
	driver.switchTo().window(parent);
	String parentTitle=driver.getTitle();
	System.out.println(parentTitle);
	
	
	
	
	
	}
}
