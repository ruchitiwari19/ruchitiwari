package com.practtest.pages;

import com.Prac.genericpage.CommonMethods;

public class LoginPage extends CommonMethods{

	public LoginPage() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void enterusername() {
		enterdata("Username","Username");
	}
	public void enterpass() {
		enterdata("password","Password");
	}
	public void login() {
		click("login");
	}
	
	public void shop() {
		click("item1");
	}
	public void cart() {
		click("cart");
	
	}
	
	public void checkout() {
		click("checkout");
	}
	public void enterFname() {
		enterdata("Fname", "Fname");
	}
	public void enterLname() {
		enterdata("Lname", "Lname");
	}
	public void zip() {
		enterdata("Zcode","Zcode");
	}
	public void cont() {
		click("Continue");
	}
	public void fIN() {
		click("Finish");
	}
	
	public String gettext() {
		String t = getwebtext("completeText");
		return t;
	}

}
