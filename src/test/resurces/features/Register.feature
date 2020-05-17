Feature: 

Background: 
Given the user enter "http://automationpractice.com/index.php" url



Scenario: -1: the user is succefully loged in
Given the user clicks on sign in link on the right corner of wibsite
When  the user enter valid email  in email address field
|khan@gmail.com|
|baidarzai@gmail.com|
And   the user enter valid password  in password field 
|123456789|
And   the user click on sign in button
Then  the user login succesfully and see "your logo" on left corner




Scenario: -2: the user sign out after sign successfuly 
Given the user clicks on sign in link on the right corner of wibsite
When  the user enter valid email  in email address field
|khan@gmail.com|
|baidarzai@gmail.com|
And   the user enter valid password  in password field 
|123456789|
And   the user click on sign in button
And   the user click on sign out button
Then  the user logout succesfully and see "creat an acount" on corner


@smoke
Scenario: -3: the user sign out after sign successfuly 
Given the user clicks on sign in link on the right corner of wibsite
When  the user enter valid email  in email address field
|khan@gmail.com|
|baidarzai@gmail.com|
And   the user enter valid password  in password field 
|123456789|
And   the user click on sign in button
And   the user click on contact us button
Then  the user logout succesfully and "customerservicecontactus" display

