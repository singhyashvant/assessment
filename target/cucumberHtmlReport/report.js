$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("webScenario.feature");
formatter.feature({
  "line": 3,
  "name": "Flight search",
  "description": "",
  "id": "flight-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to search the flight",
  "description": "",
  "id": "flight-search;user-should-be-able-to-search-the-flight",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@flightsearch"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on URL \"https://www.emirates.com/ae/english/\" of emirates website",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user selects the departure",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.emirates.com/ae/english/",
      "offset": 16
    }
  ],
  "location": "HomePageSteps.user_is_on_URL_of_emirates_website(String)"
});
formatter.result({
  "duration": 13721237688,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_selects_the_departure()"
});
formatter.result({
  "duration": 1219456,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stepDefinitions.HomePageSteps.user_selects_the_departure(HomePageSteps.java:20)\n\tat ✽.When user selects the departure(webScenario.feature:7)\n",
  "status": "pending"
});
});