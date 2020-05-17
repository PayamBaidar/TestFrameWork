//package com.step.def;
//
//import com.pages.LoginPage;
//import com.pages.searchPage;
//import com.util.CommonFunction;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class searchStep {
// 
//	searchPage search=new searchPage();
//	CommonFunction com = new CommonFunction();
//	LoginPage login=new LoginPage();
//	
//	public searchStep() {
//		login.username.sendKeys("admin@yourstore.com");
//		login.password.sendKeys("admin");
//        login.loginbotton.click();
//	}
//	
//	@Given("^the user is on nopCommarce home page$")
//	public void the_user_is_on_nopCommarce_home_page() throws Throwable {
////		search.catalog.getText(); or title
////		search.catalog.findElement(by) who to do assurtion 
//		
//	}
//
//	@When("^the user clicks on catalog$")
//	public void the_user_clicks_on_catalog() throws Throwable {
//
//		search.catalog.click();
//		
//		
//	}
//
//	@When("^the user clicks on products$")
//	public void the_user_clicks_on_products() throws Throwable {
//		search.products.click();
//		
//	}
//
//	@When("^the user enter valid value in Product Name$")
//	public void the_user_enter_valid_value_in_Product_Name() throws Throwable {
//		Thread.sleep(3000);
//		search.productname.sendKeys("computer");
//		
//	}
////
////	@When("^the usre select the category$")
////	public void the_usre_select_the_category() throws Throwable {
////		Thread.sleep(300);
////		CommonFunction.selectDropdownValue(search.category, "Books");
//		
//	}
//
//	@When("^the usre select search botton$")
//	public void the_usre_select_search_botton() throws Throwable {
//		search.search.click();
//		
//	}
//
//	@When("^the usre   search button$")
//	public void the_usre_search_button() throws Throwable {
//	
//		search.search.click();
//	}
//
//	@When("^the usre select the manufaturer$")
//	public void the_usre_select_the_manufaturer() throws Throwable {
//		
//		CommonFunction.selectDropdownValue(search.manufactur, "Apple");
//	}
//	
//	
//	@When("^the usre select the vendor$")
//	public void the_usre_select_the_vendor() throws Throwable {
//		CommonFunction.selectDropdownValue(search.vendor, "Vendor 1");
//		
//	}
//
//	@When("^the user select Warehouse$")
//	public void the_user_select_Warehouse() throws Throwable {
//		CommonFunction.selectDropdownValue(search.warehous, "Warehouse 1 (New York)");
//
//	}
//
//	@When("^the user select Product type$")
//	public void the_user_select_Product_type() throws Throwable {
//		CommonFunction.selectDropdownValue(search.producttype, "Simple");
//	}
//
//	@When("^the user select Published$")
//	public void the_user_select_Published() throws Throwable {
//		CommonFunction.selectDropdownValue(search.published, "Published only");
//	
//	}
//	
//	@Then("^the user clicks on the search button$")
//	public void the_user_clicks_on_the_search_button() throws Throwable {
//		search.searchproducts.click();
//	}
//}
