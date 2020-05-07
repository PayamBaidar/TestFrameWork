$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resurces/features/login_automation.feature");
formatter.feature({
  "line": 1,
  "name": "sign in feature",
  "description": "",
  "id": "sign-in-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 15497155900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Create New Account verification",
  "description": "",
  "id": "sign-in-feature;create-new-account-verification",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "the user click on sign in link",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "the user donot enter any data",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user click on create Account link",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "\"1.Invalid email address.\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "login_automation.the_user_click_on_sign_in_link()"
});
formatter.result({
  "duration": 1462813600,
  "status": "passed"
});
formatter.match({
  "location": "login_automation.the_user_donot_enter_any_data()"
});
formatter.result({
  "duration": 59700,
  "status": "passed"
});
formatter.match({
  "location": "login_automation.the_user_click_on_create_Account_link()"
});
formatter.result({
  "duration": 167698100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1.Invalid email address.",
      "offset": 1
    }
  ],
  "location": "login_automation.should_be_displayed(String)"
});
formatter.result({
  "duration": 488137600,
  "status": "passed"
});
formatter.after({
  "duration": 31600,
  "status": "passed"
});
});