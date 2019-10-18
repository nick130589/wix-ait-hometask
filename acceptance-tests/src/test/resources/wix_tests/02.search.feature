@Search
Feature: Search. Search for user

  Background:
    Given User open Wix Login page

    @SeverityLevel.NORMAL
    @tmsLink=DEMO-5
    @ui
    @wix
    @AC5-DEMO-5
    Scenario: 02.01.01 Wix Login. Find user by his name
      When User log in to application
      When User enter 'George' into search field
      And User wait for 3 seconds
      Then Member card with name 'George' is displayed
