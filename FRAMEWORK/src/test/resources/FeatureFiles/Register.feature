Feature: Registration functionality scenario

  @Register @1
  Scenario: Verify whether the User is able to register into the Application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | Ravi                  |
      | LastName  | Kiran                 |
      | Email     | Ravi.kiran@gmail.com1 |
      | Telephone |            9212345678 |
      | Password  | rkiran                |
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created

  @Register @2
  Scenario: Verify whether the User is not allowed to register on skipping mandatory fields
    Given I launch the application
    And I navigate to Account Registration page
    When I click on Continue button without providing anything into the mandatory fields
    Then I should see that the User Account should not be created
    And I should see the error messages informing the user to fill the mandatory fields

  @Register @3
  Scenario: Verify whether the User is able to regsiter into the Application along with Newsletter subscription
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
      | FirstName | Ravi                  |
      | LastName  | Kiran                 |
      | Email     | ravi.kiran1@gmail.com |
      | Telephone |            9243812312 |
      | Password  | rkiran                |
    And I subscribe to Newsletter
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created
 
 @Register @4
  Scenario: Verify whether the User is able to register into the Application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide the below duplicate details into the fields
      | FirstName | Ravi                  |
      | LastName  | Kiran                 |
      | Email     | ravi.kiran1@gmail.com |
      | Telephone |            9243812312 |
      | Password  | rkiran                |
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see the warning message " Warning: E-Mail Address is already registered!"
