package com.class5;

import org.openqa.selenium.By;

import com.utils.CommonMethods;

public class FrameTaskCase extends CommonMethods{
public static String url="https://www.toolsqa.com/iframe-practice-page";
	public static void main(String[] args) {
	
		CommonMethods.setup("chrome", url);

		driver.findElement(By.linkText("HOME")).click();
		
	}

}
