
Feature: Data Driven Testing Using Examples Keyword

  Background:

    Given launch browser
    Given user launches seleniumeasy website
    Then verify user is on homepage
    When user click on "Start Practicing" button
    Then verify basic examples displayed on homepage
    When user click on "Simple Form Demo"
    Then verify user is on Simple Form Demo section

  Scenario Outline: Input Text and click Show Message then Verify Text in Simple Form

    Given Single Input Field section is displayed
    Then enter "<message>" in Enter Message textbox
    And click on show message
    Then verify "<message>"

    Examples:

    |message|
    |Hello World|
    |This is keyword driven test1|

  Scenario Outline: Input number a, number b and click Get Total then Verify Text in Simple Form

    Given Two Input Field section is displayed
    And enter "<number a>" in "Enter a" textbox
    And enter "<number b>" in "Enter b" textbox
    When click on show message
    Then verify Total "<number a>" + "<number b>"

    Examples:

      |number a|number b|
      |2|3|
