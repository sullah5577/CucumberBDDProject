Feature: Registration functionality scenarios

  @Register @One
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

  @Register @Two
  Scenario: Verify whether the user is not allowed to register on skipping mandatory fields
    Given I launch the application
    And I navigate to Account Registration page
    When I click on continue button
    Then I should see that the User Account is not created
    And I should see the error messages informing the user to fill the mandatory fields

  @Register @Three
  Scenario: Verify whether the user is able to register into the application by opting for Newsletter subscription
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | Shofi              |
      | LastName  | Ullah              |
      | Email     | ullah.ss@gmail.com |
      | Telephone | 7185550123         |
      | Password  | jj187ten           |
    And I subscribe to Newsletter
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created