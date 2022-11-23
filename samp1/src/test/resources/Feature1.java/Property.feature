Feature: working on pageobjects

  Scenario Outline: newtours web application
    Given user is in newtours web application
    When user needs to enters username and password
    Then user click on submit
    And user takes screenshot and close the page
