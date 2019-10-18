@Login
Feature: Login. Sign up/login to application

  Background:
    Given User open Wix Login page

    @SeverityLevel.NORMAL
    @tmsLink=DEMO-1
    @ui
    @wix
    @AC1-DEMO-1
    Scenario: 01.01.01 Wix Login. Login with email
      When User log in to application
      Then User see home screen with list of members
