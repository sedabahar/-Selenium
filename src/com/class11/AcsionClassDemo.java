package com.class11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class AcsionClassDemo extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		
		/*navigate to the hrms
		 * enter uid and pwd
		 * click on login btn using JSexecuter
		 * 
		 */

		 setup("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth");

		 driver.findElement(By.xpath("//div[@id='divUsername']/input")).sendKeys("Admin");
		 
		 driver.findElement(By.xpath("//form[@id='frmLogin']/div[3]/input")).sendKeys("Hum@nhrm123");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement button=driver.findElement(By.id("btnLogin"));
		js.executeScript("arguments[0].style.backgroundColor='Blue'",button);//color
		js.executeScript("arguments[0].click;", button);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,22050)");//scroll
		Thread.sleep(3000);
		
		//driver.quit();
		
		
		
		
		
		
		
	}

}
