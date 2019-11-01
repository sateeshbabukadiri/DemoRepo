package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;


public class HomePage extends TestBase{
	//span[@class="user-display"]

	@FindBy(xpath = "//*[@class = 'user-display']")
	WebElement user;
	// Intializing the page objects
	public HomePage()
	{
		 PageFactory.initElements(driver, this);
	}
			
	
public String validateHomePageTitle() 
{
	user.isDisplayed();
	System.out.println(user);
	return user.getText();
}
	
}

