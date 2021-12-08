Feature: Adding Numbers

  Scenario: Adding two numbers
    Given a is 10
    And b is 20
    When I add a and b
    Then the total should be 30