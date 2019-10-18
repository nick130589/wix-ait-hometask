@UserProfile
Feature: User Profile. View user profile

  Background:
    Given User open Wix Login page

    @InDev
    @SeverityLevel.NORMAL
    @tmsLink=DEMO-6
    @ui
    @AC4-DEMO-6
    Scenario: 03.01.01 Wix Login. User profile check
      #When User log in to application
      And User enter 'George' into search field
      Then Member card with name 'George' is displayed
      When User click on member card
      Then Profile of user 'George' is displayed
      And  User role is 'Admin'
