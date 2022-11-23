Feature: working on login window

  Scenario Outline: newtours application
    Given user is in newtours application
    When user enters <username> and <password>
    Then user clicks signon Button
    And user navigate to home page
    
   Examples:
   | username | password |
   |  mercury | mercury |
   |swetha|swetha|
