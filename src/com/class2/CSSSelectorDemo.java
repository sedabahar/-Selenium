package com.class2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

	public static void main(String[] args) {
		//no slash required and no @ 
		// ( ^ ) means starts with
		// $ ends with demek
		//name='txtname'------> input[name$='name']
		//* meand contains demek
		System.setProperty("wendriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		
		
		
		
		
	}

}
