$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("register.feature");
formatter.feature({
  "line": 1,
  "name": "Registration functionality scenarios",
  "description": "",
  "id": "registration-functionality-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2295358175,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Verify wheather the user is able to register into the application by providing all the fields",
  "description": "",
  "id": "registration-functionality-scenarios;verify-wheather-the-user-is-able-to-register-into-the-application-by-providing-all-the-fields",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I launch the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I navigate to Account Registration page",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I provide all the below valid details",
  "rows": [
    {
      "cells": [
        "FirstName",
        "Shofi"
      ],
      "line": 7
    },
    {
      "cells": [
        "LastName",
        "Ullah"
      ],
      "line": 8
    },
    {
      "cells": [
        "Email",
        "ullah.ss@gmail.com"
      ],
      "line": 9
    },
    {
      "cells": [
        "Telephone",
        "7185550123"
      ],
      "line": 10
    },
    {
      "cells": [
        "Password",
        "jj187ten"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I select the privacy policy",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on continue button",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I should see that the User Account has been successfully created",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.i_launch_the_application()"
});
formatter.result({
  "duration": 2680043527,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_navigate_to_Account_Registration_page()"
});
formatter.result({
  "duration": 1382993603,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_provide_all_the_below_valid_details(DataTable)"
});
formatter.result({
  "duration": 766543971,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_select_the_privacy_policy()"
});
formatter.result({
  "duration": 125905191,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_click_on_continue_button()"
});
formatter.result({
  "duration": 480374164,
  "status": "passed"
});
formatter.match({
  "location": "Register.i_should_see_that_the_User_Account_has_been_successfully_created()"
});
formatter.result({
  "duration": 64570527,
  "status": "passed"
});
formatter.after({
  "duration": 75145098,
  "status": "passed"
});
});