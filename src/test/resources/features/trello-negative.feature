Feature: Trello Negative Scenarios

  Scenario: Create card with invalid list
    When I try to create card with invalid list
    Then I should receive bad request

  Scenario: Delete non existing card
    When I delete invalid card
    Then I should receive not found

  Scenario: Move non existing card
    When I move invalid card
    Then I should receive not found