package com.crm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;
public class LoginPage extends TestBase {
// page factory or Object repository
	
	@FindBy(xpath= "//a[contains(@href, 'https://ui.freecrm.com\')]" )
	WebElement Loginbtn;
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	

	
	@FindBy(xpath= "//*[@class='ui fluid large blue submit button']")
     WebElement LoginButton;

//	@FindBy(xpath= "//a[contains(@href,'https://register.freecrm.com/register/')]")	
	//WebElement SignupButton;
	
	@FindBy(xpath= "//*[name()='image' and @*='/images/cogtiny1.jpg']")	
	WebElement CRMlogo;
	
	
	
	// Intializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	//Actions
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
			}
	
	public boolean validateCRMImage()
		{
		return CRMlogo.isDisplayed();
		} 
	public HomePage login(String un, String pwd) {
		Loginbtn.click();
		username.sendKeys(un);
		password.sendKeys(pwd);
		LoginButton.click();
		return new HomePage();
	}

}
