package com.salesforce.pages.loginpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	@FindBy(id="username")WebElement username;
	@FindBy(id= "password")WebElement password;
	@FindBy(id="Login")WebElement login;
	

}
