package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginPage extends TestBase {
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "Email")
	public WebElement username;
	
	
	@FindBy(id = "Password")
	public WebElement password;
	
	@FindBy(xpath = "//input[@class = 'button-1 login-button']")
	public WebElement loginbotton;
	
	
	@FindBy(xpath = "//h1[contains(.,'Dashboard')]")
	public WebElement dashboardPage;
	
	 

}
