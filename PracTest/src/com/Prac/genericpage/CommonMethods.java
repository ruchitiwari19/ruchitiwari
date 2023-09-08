package com.Prac.genericpage;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods extends MasterPage{

	public CommonMethods() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	//get webelement text
	public String getwebtext(String xpathkey) {
		String text = driver.findElement(By.xpath(locator.getProperty(xpathkey))).getText();
		return text;
	}
//click method
	public void click(String xpathkey) {
		
		driver.findElement(By.xpath(locator.getProperty(xpathkey))).click();

	}
	//enterdata
	public void enterdata(String xpathkey, String testkey) {
		driver.findElement(By.xpath(locator.getProperty(xpathkey))).sendKeys(testdata.getProperty(testkey));
		
	}
	
	
	
	
	
	

}
