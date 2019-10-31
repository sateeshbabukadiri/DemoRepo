package com.crm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;


public class HomePage extends TestBase{

	@FindBy(xpath = "//*[@class = 'user-display']")
	WebElement user;
	String a = user.getText();
		
	}
	
	

