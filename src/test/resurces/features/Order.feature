Feature:

Background:

 #Given the user is on "ure"
 
 Scenario: valid user is trying to order an item 
Given the user is on nopCommerce page
When the user clicks on Sales button
And  the user click on Shipments
 And the user select start date
 And the user select end date