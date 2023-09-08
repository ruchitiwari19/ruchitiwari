package com.practtest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.practtest.pages.LoginPage;

public class LoginTest {
	
    @Test
	public void loginTest() throws Exception {
		LoginPage ip = new LoginPage();
		ip.enterusername();
		ip.enterpass();
		ip.login();
		ip.shop();
		ip.cart();
		ip.checkout();
		ip.enterFname();
		ip.enterLname();
		ip.zip();
		ip.cont();
		ip.fIN();
		Assert.assertEquals( ip.gettext(),"Your order has been dispatched, and will arrive just as fast as the pony can get there!");
		
	}

}
