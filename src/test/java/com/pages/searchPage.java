package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class searchPage extends TestBase{
	

	@FindBy(xpath="(//span[contains (text(),'Catalog')])[1]")
	public WebElement catalog;
	
	
	@FindBy(xpath = "//span[contains (text(),'Products')]")
	public WebElement products;
	
	
	@FindBy(xpath = "//input[@id = 'SearchProductName']")
	public WebElement productname;
	
	@FindBy(xpath = "//select[@name='SearchCategoryId']")
	public WebElement category;
	
	@FindBy(id = "SearchIncludeSubCategories")
	public WebElement search;
	
	@FindBy(id = "SearchManufacturerId")
	public WebElement manufactur;	
	
	@FindBy(xpath = "//select[@name='SearchVendorId']")
	public WebElement vendor;
	
	@FindBy(xpath = "//select[@name='SearchWarehouseId']")
	public WebElement warehous;
	
	@FindBy(xpath = "//select[@name='SearchProductTypeId']")
	public WebElement producttype;
	
	@FindBy(xpath = "//select[@name='SearchPublishedId']")
	public WebElement published;
	
	@FindBy(id = "search-products")
	public WebElement searchproducts;
	
	
	public searchPage () {
		
		PageFactory.initElements(driver, this);
	}
	
	
	
}
