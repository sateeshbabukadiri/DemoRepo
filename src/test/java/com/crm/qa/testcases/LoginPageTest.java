package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.pages.HomePage;
import com.crm.pages.LoginPage;
import com.crm.qa.base.TestBase;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	public LoginPageTest() {
		super();
		
	}

	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginpage = new LoginPage();
		
	}
	//@Test(priority = 1)
	public void loginpagetest() {
		String title = loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		}
	//@Test(priority = 2)
	public void crmLogoImagetest() throws InterruptedException {
		boolean  flag = loginpage.validateCRMImage();
		Assert.assertTrue(flag);
	}
	
		@Test (priority = 3)
		public void logintest() {
		loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		HomePage homePage = new HomePage();
		String VH = homePage.validateHomePageTitle();
		Assert.assertEquals(VH, "sateesh k");
	
		
	}
//	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
