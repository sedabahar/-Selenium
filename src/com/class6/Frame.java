package com.class6;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class Frame extends CommonMethods {
	public static final String jirav_url="http://jiravm.centralus.cloudapp.azure.com:8081/index.html";

	public static void main(String[] args) throws InterruptedException {
		
CommonMethods.setup("chrome", jirav_url);

//driver.switchTo().frame("FrameOne");
//eger exception ciksaydi yazilir sadece name
boolean x =driver.findElement(By.xpath("//h3[text()='Syntax Technologies']")).isDisplayed();

if(x) {
	System.out.println("passed");
}

else {
	System.out.println("failed");
}

		
		
		
	}
}
