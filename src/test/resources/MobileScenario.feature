#Author: singh.yashvant@ymail.com
#Date: 13/07/2019
Feature: Flight status mobile

  @flightStatus
  Scenario Outline: [Mobile Assessment] User should be able to see the flight status
    Given user has launch the emirates app
    And user navigate to flight status screen
    When user enters the <flightNumber> to see the status
    Then user should be displayed with the listing

    Examples: 
      | flightNumber |
      |          123 |
