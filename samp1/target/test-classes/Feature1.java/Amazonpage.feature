Feature: working on amazon page

  Scenario: amazon web application
    Given user is in amazon page
    When user captures the link and navigates back
    Then get the title and url of the page
    And store them in excel sheet and capture the screenshot
    And close the browser
