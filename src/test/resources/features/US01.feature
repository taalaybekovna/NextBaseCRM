@wip @Login
Feature:
  US_001 Login Functionality
  Login with correct Username and correct Password to HelpDesk Home page

  @helpdesk13
  Scenario: Login as a helpdesk
  Given I am on "Authorization" Page
    When I input helpdesk correct username
    Then I should navigate to Helpdesk home page
