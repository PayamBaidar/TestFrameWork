package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;
public class login_pages extends TestBase{

	
	
	@FindBy(xpath = " //a[@class='login']")
	public WebElement signin1;
	
	@FindBy(id = "email_create")
	public WebElement createmail;
	
	@FindBy(id = "email")
	public WebElement email;
	
	@FindBy(id = "passwd")
	public WebElement password;
	
	@FindBy(xpath="//span[contains(.,'Create an account')]")
	public WebElement creataccount;
	
	@FindBy(xpath="//button[@id='SubmitLogin']")
	public WebElement signin2;
	
	@FindBy(xpath="//li[contains(.,'Invalid email address.')]")
	public WebElement errormessage_createaccount;
	
	@FindBy(xpath = "//li[contains(.,'Authentication failed.')]")
	public WebElement authentication_error;
	
	@FindBy(xpath = "//input[@id='id_gender1']")
	public WebElement mrbutton;
	
	@FindBy(xpath = "//input[@id='customer_firstname']")
	public WebElement firstname;
	
	@FindBy(id = "customer_firstname")
	public WebElement lastname;
	
	@FindBy(xpath = "//input[@id='passwd']")
	public WebElement creatpswd;
	
	@FindBy(xpath = "//select[@id='days']")
	public WebElement days;
	
	@FindBy(xpath = "//select[@id='months']")
	public WebElement months;
	
	@FindBy(xpath = "//select[@id='years']")
	public WebElement years;
	
	@FindBy(xpath = "//input[@id='address1']")
	public WebElement address;
	
	@FindBy(xpath = "//input[@id='phone']")
	public WebElement phone;
	
	@FindBy(xpath = "//input[@id='city']")
	public WebElement city;
	
	
	
	 
	
	
	public login_pages() {

		PageFactory.initElements(driver, this);
	
	}
	
	
}
