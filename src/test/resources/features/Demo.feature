
Feature: Demo Home

  Background: launch browser

  Scenario: Launch the Website and go to Demo Home

    Given user launches seleniumeasy website
    Then verify user is on homepage

  Scenario: Navigate to Selenium Easy Demo - Start Practising

    Given user launches seleniumeasy website
    Then verify user is on homepage
    When user click on "Start Practicing" button
    Then verify basic examples displayed on homepage