package com.class8;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.utils.CommonMethods;
import com.utils.Constands;

public class TaseCase extends CommonMethods{

	public static void main(String[] args) {
		
		setup("chrome",Constands.SYNTAX_PRACTICE_URL);
		//navigate to the table we need
		
		
		//driver.findElement(By.linkText("Table")).click();
		driver.findElement(By.xpath("//a[text()='Table']")).click();
		driver.findElement(By.linkText("Table Data Search")).click();
	
		//Get number of rows from the table
		List<WebElement>rows=driver.findElements(By.xpath("//table[class='table']/tbody/tr/th"));
		System.out.println("Number of rows :"+rows.size());		
		
		//Get number of cols from the table
		List<WebElement>cols=driver.findElements(By.xpath("//table[class='table']/thead[2]/tr/th"));
		System.out.println("Number of cols :"+cols.size());	
		
		  System.out.println("Printing colunms header --------");
		    
		    Iterator<WebElement>it=cols.iterator();
		    while(it.hasNext()) {
		    	String colsData=it.next().getText();
		    	System.out.println(colsData);
		    }
		
		    System.out.println("Printing row data--------");
			
		    for(WebElement row:rows) {
		    	
		    	String rowText=row.getText();
		    	System.out.println(rowText);
		    	
		    }
		    System.out.println("Printing data  cell by cell using advanced for loop--------");
		    /*xpatch ("//table[@class='table']/tbody/tr/td"));
		     * 
		     *1. //table[@class='table']- table element
		     *2. /tbody - from table going inside tbody 
		     *3. tr / from tbody going into rows  (not specific rows )
		     *4. /td - going into table data  ----> cell
		     */
			  
List<WebElement>cells=driver.findElements(By.xpath("//table[@class='table']/tbody/tr/td"));

for(WebElement cell:cells) {
	
	String cellData=cell.getText();
	System.out.println(cellData);
	
}
System.out.println("Printing data  cell by cell using advanced for loop--------");    
		    
for(int i=1; i<rows.size();i++) {
	for(int a=1; a<cols.size();a++) {
		
		String cellText=driver.findElement(By.xpath("//table[@class='table']/tbody/tr["+i+"]/td["+a+"]")).getText();
	
		
		
	}
}




		    
	}

}
