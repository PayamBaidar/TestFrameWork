@Smoke
Feature: sign in feature



  Scenario: Create New Account verification
    Given the user click on sign in link
    When the user donot enter any data
    And the user click on create Account link
    Then "1.Invalid email address." should be displayed
    

    Scenario: Create Already registered user verification
    Given the user click on sign in link on the right corner of wibsite
    When the user enter invalid email in email address field 
    And the user enter invalid password in password field
    And the user click on sign in button
    Then the following error message displays "1. An email address required."
    
    



