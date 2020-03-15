package com.class7;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.FluentWait;

import com.utils.CommonMethods;

public class FluentWaitDemo extends CommonMethods{

	public static void main(String[] args) {
		
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(30));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
		
		
		
	}

}
