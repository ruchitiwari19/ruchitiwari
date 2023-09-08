package com.Prac.genericpage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {
	


	public static WebDriver driver;
	public Properties locator;
	public Properties configure;
	public Properties testdata;
	
	public MasterPage() throws Exception {
		File loc = new File("C:\\Users\\ruchi\\eclipse-workspace\\PracTest\\src\\Properties File\\Locators.properties");
		FileInputStream ip = new FileInputStream(loc);
		locator = new Properties();
		locator.load(ip);
		
		File config = new File("C:\\Users\\ruchi\\eclipse-workspace\\PracTest\\src\\Properties File\\Configuration.properties");
		FileInputStream con = new FileInputStream(config);
		configure = new Properties();
		configure.load(con);
		
		File test = new File("C:\\Users\\ruchi\\eclipse-workspace\\PracTest\\src\\Properties File\\TestData.properties");
		FileInputStream tes = new FileInputStream(test);
		testdata = new Properties();
		testdata.load(tes);
		
		if(configure.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else if(configure.getProperty("browser").equalsIgnoreCase("edge")) {
			//WebDriverManager.edgeDriver().setup();
		driver = new EdgeDriver();
		}else if(configure.getProperty("browser").equalsIgnoreCase("FireFox")) {
			//WebDriverManager.geckoDriver().setup();
			driver = new FirefoxDriver();
			
		}else {
			System.out.println("no broswer details");
		}
		
	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(configure.getProperty("URL"));
		
		
		
		
		
		
	}

}
