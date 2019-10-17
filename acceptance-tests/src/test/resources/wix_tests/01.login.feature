@Login
Feature: Login. Sign up and login to application

#  Background:
#    Given Basic Authorization reset performed
#    And Authorization with token is enabled

  @SeverityLevel.NORMAL
  @tmsLink=DEMO1
  @ui
  @sanity
  @AC1-DEMO1
  Scenario: 01.01.01 Login to application by using Facebook
    #Given User login to Anadarko environment
    Given User is on the Task Accountability page
    Then Task Accountability page is opened on filter 'All'
    And Tasks in the grid are sorted by column 'Rig-On Date' by 'asc'

  @SeverityLevel.NORMAL
  @tmsLink=DEMO2
  @ui
  @sanity
  @AC1-DEMO2
  Scenario: 01.01.02 Login to application by using email signup
    Given User is on the Task Accountability page
    Then Task Accountability page is opened on filter 'All'
    Then Task Accountability grid columns have names:
      | Project Team    |
      | Group Name      |
      | Well Number     |
      | Well Name       |
      | Completion Name |
      | Discipline      |
      | Task Name       |
      | Rig-On Date     |
      | Completed       |
