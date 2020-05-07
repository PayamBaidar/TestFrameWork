Feature: 

Background: 

Given the user is on "https://admin-demo.nopcommerce.com/admin/"

@regression
  Scenario: login with valid value
    Given the user enter valid value in "username" and "password" field
    |username | <"admin@yourstore.com1"> |
		|password | <"admin1">|    
    When  the user click login button
    Then the user nopCommerce home page
    


@smoke
  Scenario: the searching botton
    Given the user is on nopCommarce home page
    When  the user clicks on catalog
    And   the user clicks on products
    And   the user enter valid value in Product Name
    And   the usre select the category
    And   the usre   search button
    And   the usre select the manufaturer
    And   the usre select the vendor
    And   the user select Warehouse	
    And   the user select Product type
    And   the user select Published	
    Then  the user clicks on the search button
    
    

