package com.step.def;

import java.util.List;

import org.junit.Assert;

import com.pages.login_pages;
import com.util.CommonFunction;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register_Steps {
	
	CommonFunction com = new CommonFunction();
	login_pages login= new login_pages();
	
	@Given("^the user enter \"([^\"]*)\" url$")
	public void the_user_enter_url(String arg1) throws Throwable {
		
	}

	@Given("^the user clicks on sign in link on the right corner of wibsite$")
	public void the_user_clicks_on_sign_in_link_on_the_right_corner_of_wibsite() throws Throwable {
		com.click(login.signin2);
	}

	@When("^the user enter valid email  in email address field$")
	public void the_user_enter_valid_email_in_email_address_field(DataTable username) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> list=username.raw();
		com.enterData(login.email,list.get(0).get(0) );
		Thread.sleep(3000);
		login.email.clear();
		com.enterData(login.email,list.get(1).get(0) );
	}

	@When("^the user enter valid password  in password field$")
	public void the_user_enter_valid_password_in_password_field(DataTable password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
		List<List<String>> list=password.raw();
		com.enterData(login.password,list.get(0).get(0) );
	}

	@Then("^the user login succesfully and see \"([^\"]*)\" on left corner$")
	public void the_user_login_succesfully_and_see_on_left_corner(String arg1) throws Throwable {
		boolean flag= login.logo.isDisplayed();
		Assert.assertTrue(flag);
	}

	@When("^the user click on sign out button$")
	public void the_user_click_on_sign_out_button() throws Throwable {
		com.click(login.signout);
	}

	@Then("^the user logout succesfully and see \"([^\"]*)\" on corner$")
	public void the_user_logout_succesfully_and_see_on_corner(String arg1) throws Throwable {
		boolean flag= login.creataccount.isDisplayed();
		Assert.assertTrue(flag);
	}
	
	@When("^the user click on contact us button$")
	public void the_user_click_on_contact_us_button() throws Throwable {
		com.click(login.contacts_as);
	}
	
	@Then("^the user logout succesfully and \"([^\"]*)\" display$")
	public void the_user_logout_succesfully_and_display(String arg1) throws Throwable {
		boolean flag=login.custservicecontacus.isDisplayed();
		Assert.assertTrue(flag);
	}
}
