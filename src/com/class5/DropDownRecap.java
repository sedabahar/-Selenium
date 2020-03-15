package com.class5;

import com.utils.CommonMethods;

public class DropDownRecap extends CommonMethods {
	
	public static void setUp(String browser,String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver.get(url);
		}
		else if(browser.equalsIgnoreCase("fairfox")) {
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver.get(url);
		}
		else {
			System.out.println("Browser not supported");
		}
		
	}

	public static void main(String[] args) {

		
		
		
		
		
	}

}
