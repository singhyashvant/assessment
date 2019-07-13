#Author: singh.yashvant@ymail.com
#Date: 13/07/2019
Feature: Flight Search Web

  @flightsearch @return
  Scenario Outline: [Web Assessment] User should be able to search the flight
    Given user is on URL "https://www.emirates.com/ae/english/" of emirates website
    When user selects <departure> as country of departure
    And user selects <arrival> as country of arrival
    And user selects <departingDate> as departing date
    And user selects <arrivalingDate> as departing date
    And user click on search flights button
    Then user should be able to see the flight results

    Examples: 
      | departure | arrival | departingDate | arrivalingDate |
      | DXB       | BOM     |       1662019 |        1862019 |

  @oneway
  Scenario Outline: User should be able to search the flight
    Given user is on URL "https://www.emirates.com/ae/english/" of emirates website
    When user selects <departure> as country of departure
    And user selects <arrival> as country of arrival
    And user selects <departingDate> as departing date
    And user is making a one way journey
    And user click on search flights button
    Then user should be able to see the flight results

    Examples: 
      | departure | arrival | departingDate |
      | DXB       | BOM     |       1662019 |
