$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login functinality scenarios",
  "description": "",
  "id": "login-functinality-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2219924407,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Verify that the User is not able to login without providing credentials",
  "description": "",
  "id": "login-functinality-scenarios;verify-that-the-user-is-not-able-to-login-without-providing-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Login"
    },
    {
      "line": 17,
      "name": "@Three"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I navigate to Account Login page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I login to the application using Username \"\" and Password \"\"",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "I should see an error message informing the User about invalid credentials",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launch_the_application()"
});
formatter.result({
  "duration": 2580807437,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_navigate_to_account_login_page()"
});
formatter.result({
  "duration": 1035017219,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 43
    },
    {
      "val": "",
      "offset": 59
    }
  ],
  "location": "Login.i_login_to_the_application_using_username_something_and_password_something(String,String)"
});
formatter.result({
  "duration": 494647997,
  "status": "passed"
});
formatter.match({
  "location": "Login.i_should_see_an_error_message_informing_the_user_about_invalid_credentials()"
});
formatter.result({
  "duration": 47240628,
  "status": "passed"
});
formatter.after({
  "duration": 74750823,
  "status": "passed"
});
});