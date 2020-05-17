package com.step.def;


import com.pages.login_pages;
import com.util.CommonFunction;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class login_automation {
	
	login_pages login = new login_pages();
	
	CommonFunction com = new CommonFunction();
	
	
	

	@Given("^the user click on sign in link$")
	public void the_user_click_on_sign_in_link() throws Throwable {
		com.click(login.signin1);

	}

	@When("^the user donot enter any data$")
	public void the_user_donot_enter_any_data() throws Throwable {
	}

	@When("^the user click on create Account link$")
	public void the_user_click_on_create_Account_link() throws Throwable {
		com.click(login.creataccount);
	}

	@Then("^\"([^\"]*)\" should be displayed$")
	public void should_be_displayed(String arg1) throws Throwable {
		
		boolean flag=login.errormessage_createaccount.isDisplayed();
		Assert.assertTrue(flag);
	}
		
		@Given("^the user click on sign in link on the right corner of wibsite$")
		public void the_user_click_on_sign_in_link_on_the_right_corner_of_wibsite() throws Throwable {
			com.click(login.signin2);
		}

		@When("^the user enter invalid email in email address field$")
		public void the_user_enter_invalid_email_in_email_address_field() throws Throwable {
			com.enterData(login.email, "khan@gmail.com");
		}

		@When("^the user enter invalid password in password field$")
		public void the_user_enter_invalid_password_in_password_field() throws Throwable {
			com.enterData(login.password, "123456");
		}

		@When("^the user click on sign in button$")
		public void the_user_click_on_sign_in_button() throws Throwable {
			com.click(login.signin2);
		}

		@Then("^the following error message displays \"([^\"]*)\"$")
		public void the_following_error_message_displays(String arg1) throws Throwable {
			boolean flag= login.authentication_error.isDisplayed();
			Assert.assertTrue(flag);
		}

		


}
