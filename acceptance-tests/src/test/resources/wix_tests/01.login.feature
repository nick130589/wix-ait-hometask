@Login
Feature: Login. Sign up and login to application

#  Background:
#    Given Basic Authorization reset performed
#    And Authorization with token is enabled

  @SeverityLevel.NORMAL
  @tmsLink=DEMO1
  @ui
  @wix
  @AC1-DEMO1
  Scenario: 01.01.01 Wix Login. Login with email
    Given User open Wix Login page


  @SeverityLevel.NORMAL
  @tmsLink=DEMO1
  @ui
  @sanity
  @AC1-DEMO1
  Scenario: 02.01.01 Google Search. Search Action
    Given I open Google Page
    And Enter search query into text input
    Then Search results returned

  @SeverityLevel.NORMAL
  @tmsLink=DEMO2
  @ui
  @sanity
  @AC1-DEMO2
  Scenario: 02.01.02 Google Search. Verify Footer Element Names
    Given I open Google Page
    And Enter search query into text input
    Then Verify that footer contains elements:
      | Help          |
      | Send feedback |
      | Privacy       |
      | Terms         |