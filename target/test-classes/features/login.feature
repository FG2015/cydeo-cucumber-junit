
Feature: Library app login feature

  As a user I should be able to log in with correct credentials, and dashboard should be displayed.

  Accounts are:Librarian ,student, admin.

  Scenario: Login as Librarian
    When user enters Librarian user name
    And  user enters librarian password
    Then  user should see the dashboard

    Scenario: Login as Student
      When user enters student user name
      And user enters Student password
      Then user should see the dashboard


