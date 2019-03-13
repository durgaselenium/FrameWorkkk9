package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
WebDriver driver;

//create a constructor	
public LoginPage(WebDriver ldriver)
{
this.driver =ldriver;	
}

@FindBy(name="txtUsername")WebElement uname;
@FindBy(name="txtPassword")WebElement pass;
@FindBy(name="Submit")WebElement btnLogin;
	
public void LoginToHrm(String usernameapplication,String passwordappication)
{
try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	
}	
uname.sendKeys(usernameapplication);	
pass.sendKeys(passwordappication);
btnLogin.click();
}
	
}
