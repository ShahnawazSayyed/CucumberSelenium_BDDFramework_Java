
Feature: Demo Home

  Scenario: Launch the Website and go to Demo Home

    Given launch browser
    And user launches seleniumeasy website
    Then verify user is on homepage
    Then quit browser

    Scenario: Navigate to Selenium Easy Demo - Start Practising

      Given launch browser
      And user launches seleniumeasy website
      Then verify user is on homepage
      When user click on "Start Practicing" button
      Then verify basic examples displayed on homepage
      Then quit browser