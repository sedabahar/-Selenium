package MYProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.utils.CommonMethods;

public class change  extends CommonMethods {

	public static void main(String[] args) throws InterruptedException {
		setup("chrome","http://166.62.36.207/Syntax_HRM/symfony/web/index.php/pim/addEmployee");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Syntax@123");
        driver.findElement(By.id("btnLogin")).click();
        
        
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Kuzey");
        Thread.sleep(2000);
        driver.findElement(By.id("lastName")).sendKeys("Demirkiran");
        
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sidenav\"]/li[2]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(2000);
      driver.findElement(By.id("contact_street1")).sendKeys("Old sonoma Place");
      Thread.sleep(1000);
      driver.findElement(By.id("contact_city")).sendKeys("Bristow");
      Thread.sleep(1000);
      
      
      
      WebElement a=driver.findElement(By.id("contact_state"));
     
      Select sel=new Select(a);
      sel.selectByVisibleText("Virginia");
    
      Thread.sleep(2000);
      
      
      
      
      driver.findElement(By.id("contact_province")).sendKeys("Virginia");
      Thread.sleep(1000);
      driver.findElement(By.id("contact_emp_zipcode")).sendKeys("20136");
      Thread.sleep(1000);
      
      
      WebElement x=driver.findElement(By.id("contact_country"));
     
      Select select=new Select(x);
      select.selectByVisibleText("United States");
      Thread.sleep(1000);
      
      
      
      
      
      driver.findElement(By.id("contact_emp_hm_telephone")).sendKeys("7034093185");
      Thread.sleep(1000);
      driver.findElement(By.id("contact_emp_mobile")).sendKeys("7034093180");
      Thread.sleep(1000);
      driver.findElement(By.id("contact_emp_work_telephone")).sendKeys("7034093182");
     
     // driver.findElement(By.id("contact_emp_work_email")).sendKeys("admin2020@example.com");
      //Thread.sleep(1000);
      //driver.findElement(By.id("contact_emp_oth_email")).sendKeys("admin2020@example.com");
      Thread.sleep(1000);
      driver.findElement(By.id("btnSave")).submit();
      
      
      
      
  
        
        
        ////a[text()="Contact Details"]
	}

}
