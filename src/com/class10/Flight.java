package com.class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;

public class Flight  extends CommonMethods {

		 /*TC 1: Table headers and rows verification
			Open chrome browser
			Go to “https://www.aa.com/homePage.do”
			Enter From and To
			Select departure as May 14 of 2020
			Select arrival as November 8 of 2020
			Verify “Choose flights” text is displayed
			Take s screenshot of the results
			Close browser
		 */
		public static void main(String[] args) throws InterruptedException {
			CommonMethods.setup("chrome", "https://www.aa.com/homePage.do");
			driver.manage().window().maximize();
			//driver.findElement(By.id("reservationFlightSearchForm.originAirport")).clear();
			//driver.findElement(By.id("reservationFlightSearchForm.originAirport")).sendKeys("hous");
			Thread.sleep(1000);
		/*	driver.findElement(By.linkText("HOU - Houston Hobby, TX")).click();
			driver.findElement(By.id("reservationFlightSearchForm.destinationAirport")).sendKeys("atla");
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[text()='ATL - Atlanta Hartsfield Jackson, GA']")).click();
			driver.findElement(By.id("aa-leavingOn")).click();
			
			
			
			for(int i=0;i<12;i++) {
				WebElement m=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
				String depart=m.getText();
				if(depart.equals("May")) {
List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
					for (WebElement cell:cells){
						if (cell.getText().equals("14")){
							Thread.sleep(1000);
						cell.click();
						System.out.println("14 clicked");
						break;
						}
					}break;
					
					}else{
					driver.findElement(By.xpath("//a[@title='Next']")).click();
				}
			}
			
			
			
			
			
			driver.findElement(By.id("aa-returningFrom")).click();
			for(int i=0;i<12;i++) {
				WebElement m=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
				String depart=m.getText();
				if(depart.equals("November")) {
					List <WebElement> cells=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
					for (WebElement cell:cells){
						if (cell.getText().equals("8")){
							Thread.sleep(1000);
						cell.click();
						System.out.println("8 clicked");
						Thread.sleep(1000);
						break;
						}
					}break;
					}else{
					driver.findElement(By.xpath("//a[@title='Next']")).click();
				}
			}
			driver.findElement(By.id("flightSearchForm.button.reSubmit")).click();
			String title=driver.getTitle();
			if(title.equals("Choose flights")){
				System.out.println("Title displayed");
			}*/
			//TakesScreenshot ts=(TakesScreenshot)driver;
			//File screen =ts.getScreenshotAs(OutputType.FILE);
			//try {
			//FileUtils.copyFile(screen, new File("ScreenShots/shot/aatask.png"));
			//}catch(IOException e) {
			//	e.printStackTrace();
			//}
			//	driver.close();
	}

}
