package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class OrderPage extends TestBase {

	
	@FindBy(xpath = "//span[contains (text(),'Sales')]")
	public WebElement sales;
	
	@FindBy(xpath = "//span[contains (text(),'Shipments')]")
	public WebElement shipment;
	
	@FindBy(id= "StartDate")
	public WebElement startdate;
	
	
	@FindBy(id = "EndDate")
	public WebElement enddate;
	
	
	public OrderPage() {
		PageFactory.initElements(driver, this);
	}
	
}
