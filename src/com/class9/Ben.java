package com.class9;



import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.CommonMethods;

public class Ben  extends CommonMethods{

	

	public static void main(String[] args) throws InterruptedException {
	
		
		setup("chrome","http://166.62.36.207/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        
        
        WebDriverWait wait = new WebDriverWait (driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']")));
        driver.findElement(By.xpath("//a[@id='menu_recruitment_viewRecruitmentModule']")).click();
        
        
        String empName = "Shavkat Irmukhamedov";
        List<WebElement> names = driver.findElements(By.id("//table[@id='resultTable']/tbody/tr[1]/td[3]/a"));
        String firstHalfXpath = "//table[@id = 'resultTable']/tbody/tr[";
        String secondHalfXpath = "]/td[3]/a";
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
        for(int i = 1; i<=rows.size(); i++) {
            String name = driver.findElement(By.xpath(firstHalfXpath + i + secondHalfXpath)).getText();
            System.out.println(name);
            if(name.equalsIgnoreCase(empName)) {
                System.out.println("TC passed : Name in the list");
                driver.findElement(By.xpath(firstHalfXpath + i + secondHalfXpath)).click();
            }
        }
        driver.quit();

		
	}}
