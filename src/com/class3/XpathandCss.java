package com.class3;

public class XpathandCss {

	public static void main(String[] args) {
		//xpath --> Absolute xpath always starts with one slash (/) and it ca go only in forward direction
		//      /html/head/body/header
			// xpath--> //tagName[@attribute='value']
			//ccs
			//tagName[attribute='value']
			//xpath functions
			//1.
			//tagName[starts-with (@Attribute,'valueOfNameAtt')]
			// input[starts-with(@id,'sing']
			//2.
			//input [contains(@for,'inputText')]
			// if we cant woork with xpath andd ccs we use xpathFunctioal
			//css Functions
			//  start with cssFunctions ^ -->  div [id^='freeText']
			//End with Functions is $ -->div[role$='box']
	       // div[class*='slide fade']
		// how to find  text with using contain
			//h3[contains(text(),'welcome')]
	}

}
