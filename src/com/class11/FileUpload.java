package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class FileUpload extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
	setup("chrome","https://the-internet.herokuapp.com/upload")	;
	driver.findElement(By.id("file-upload")).sendKeys("/Users/mustafademirkiran/Desktop/unix.txt");
	   //driver.findElement(By.id("file-upload")).sendKeys("/Users/shugofa/Desktop/FileForPractice.png");
       
       //clicking on upload button
       
       driver.findElement(By.id("file-submit")).click();
       WebElement uploaded = driver.findElement(By.xpath("//div[@id='uploaded-files']/preceding-sibling::h3"));
       if (uploaded.isDisplayed()) {
           System.out.println("File successfully uploaded");
       }else {
           System.out.println("File is not uploaded");
       }
       Thread.sleep(5000);
       driver.quit();
   
		

	}

}
