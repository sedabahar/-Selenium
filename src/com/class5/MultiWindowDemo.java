package com.class5;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class MultiWindowDemo  extends CommonMethods{

	public static void main(String[] args) throws InterruptedException {
		
		CommonMethods.setup("chrome", "https://accounts.google.com/signup");
		Thread.sleep(2000);
		System.out.println("Title of the main window "+driver.getTitle());
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allWindowsID=driver.getWindowHandles();
		System.out.println("How many windows current opened :"+allWindowsID.size());
		
		Iterator<String> it=allWindowsID.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		
		driver.switchTo().window(childWindow);
		System.out.println("Title of the childWindow is "+driver.getTitle());
		
		
	}

}
