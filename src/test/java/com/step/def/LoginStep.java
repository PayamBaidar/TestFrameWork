package com.step.def;

import org.junit.Assert;

import com.pages.LoginPage;
import com.util.CommonFunction;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
    
	CommonFunction com = new CommonFunction();
	LoginPage login = new LoginPage();
	
	@Given("^the user is on \"([^\"]*)\"$")
	public void the_user_is_on(String url) throws Throwable {
		
//		login.username.sendKeys("admin@yourstore.com");
	}
	
	@Given("^the user enter valid value in \"([^\"]*)\" and \"([^\"]*)\" field$")
	public void the_user_enter_valid_value_in_and_field(String username, String password, DataTable arg3) throws Throwable {
			login.username.sendKeys("admin@yourstore.com");
			login.password.sendKeys("admin");
	}
	
	@When("^the user click login button$")
	public void the_user_click_login_button() throws Throwable {
		login.loginbotton.click();
	
	}

	@Then("^the user nopCommerce home page$")
	public void the_user_nopCommerce_home_page() throws Throwable {
		
		String actualText=login.dashboardPage.getText();
		
		Assert.assertEquals(actualText, "Dashboard");
	}


	
}
