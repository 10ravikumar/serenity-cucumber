#Author: Ravi kumar

@add
Feature: Check the calculator add functionality.


  @addOfTwoNumber
  Scenario:  Add two positive numbers
    Given I have a Calculator
    When I add 1 and 1
    Then the sum should be 2
