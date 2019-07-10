#Author: singh.yashvant@ymail.com
Feature: Flight Search

  @flightsearch @return
  Scenario Outline: User should be able to search the flight
    Given user is on URL "https://www.emirates.com/ae/english/" of emirates website
    When user selects <departure> as country of departure
    Examples: 
      | departure | arrival | departingDate | arrivalingDate | numberOfPax | class         |
      | DXB       | BOM     | 25 Jul 19     | 30 Jul 19      |           1 | Economy Class |
      
    #And user selects <arrival> as country of arrival
    #And user selects <departingDate> as departing date
    #And user selects <arrivalingDate> as departing date
    #And user selects <numberOfPax> as number of passenger
    #And user selects <class> as class of travel
    #And user click on search flights button
    #Then user should be able to see the flight results

      
      
      #Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
#
      #
