@wip @Login
Feature:
  US_001 Login Functionality
  Login with correct Username and correct Password to HelpDesk Home page

  Background:
    Given I am on Authorization Page


  @helpdesk13
  Scenario: Login as a helpdesk

    When I input helpdesk correct username
    Then I should navigate to Helpdesk home page

    @helpdesk14
    Scenario: Login as a helpdesk2
    When I input helpdesk correct username and password
    Then I should navigate to Helpdesk home page
