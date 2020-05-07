package com.step.def;

import org.junit.Assert;

import com.pages.LoginPage;
import com.pages.OrderPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class OrderStep {

	LoginPage login= new LoginPage();
	OrderPage orderpage= new OrderPage();
	
	public OrderStep() {
		login.username.sendKeys("admin@yourstore.com");
		login.password.sendKeys("admin");
        login.loginbotton.click();
	}
	
	
	@Given("^the user is on nopCommerce page$")
	public void the_user_is_on_nopCommerce_page() throws Throwable {
		
	   String actualText=login.dashboardPage.getText();
		
		Assert.assertEquals(actualText, "Dashboard");
	
	
	}

	@When("^the user clicks on Sales button$")
	public void the_user_clicks_on_Sales_button() throws Throwable {
		orderpage.sales.click();
		
	}

	@When("^the user click on Shipments$")
	public void the_user_click_on_Shipments() throws Throwable {
		orderpage.shipment.click();
	}

	@When("^the user select start date$")
	public void the_user_select_start_date() throws Throwable {
		orderpage.startdate.sendKeys("04/23/2020");
	}

	@When("^the user select end date$")
	public void the_user_select_end_date() throws Throwable {
	
		orderpage.enddate.sendKeys("05/25/2020");
	}

	
	
}
