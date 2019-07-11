#Author: singh.yashvant@ymail.com
Feature: Flight search mobile
@flightStatus
  Scenario Outline: 
    Given user has launch the emirates app
    And user is logged in as a guest
    And user navigate to flight status screen
    When user enters the <flightNumber> to see the status
    Then user should be displayed with the listing

    Examples: 
      | flightNumber |
      | abc          |
