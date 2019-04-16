Feature: Registration functionality scenarios

  Scenario: Verify wheather the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | Shofi              |
      | LastName  | Ullah              |
      | Email     | ullah.ss@gmail.com |
      | Telephone | 7185550123         |
      | Password  | jj187ten           |
    And I select the privacy policy
    And I click on continue button
    Then I should see that the User Account has been successfully created