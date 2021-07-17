
Feature: Demo Home

  Scenario: Launch the Website and go to Demo Home

    Given launch chrome browser
    And user launches seleniumeasy website
    Then verify user is on homepage
    Then quit browser
