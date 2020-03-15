package com.class8;



import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constands;

public class WebTableDemo extends CommonMethods{

	public static void main(String[] args) {
		
		setup("chrome",Constands.SYNTAX_PRACTICE_URL);
		//navigate to the table we need
		
		
		//driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.xpath("//a[text()='Table']")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
	
		//find how many rows of data table has
		
	List<WebElement>rows=driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr"));	
	System.out.println("Number of rows in the table is :"+rows.size());	

	
    System.out.println("Printing row data --------");
    
    Iterator<WebElement>it=rows.iterator();
    while(it.hasNext()) {
    	String rowData=it.next().getText();
    	System.out.println(rowData);
    }
	
    
	//Number of Columns
	List<WebElement>cols=driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));	
	System.out.println("Number of cols in the table is :"+cols.size());	
	
    System.out.println("Printing Columns headers--------");
	
    for(WebElement col:cols) {
    	
    	String header=col.getText();
    	System.out.println(header);
    	
    }

	
   
	
	
	
	
	

	}

}
