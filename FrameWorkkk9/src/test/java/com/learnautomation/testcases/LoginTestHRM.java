package com.learnautomation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.BrowserFactory;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class LoginTestHRM extends BaseClass{

@Test
public void loginTestHrm()
{
 logger = report.createTest("Login To OrangeHRM");
LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
 logger.info("Starting Application");

//loginpage.LoginToHrm("Admin", "admin123");
loginpage.LoginToHrm(excel.getStringData("login",0,0),excel.getStringData("Login",0,1));
 logger.pass("Success");
  
Helper.capturedScreenshots(driver);
}
		
}
