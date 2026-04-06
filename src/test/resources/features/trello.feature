Feature: Trello Card Management

  Scenario: Create move and delete card

    Given I have a valid Trello board
    And I use To Do list
    When I create a card in To Do
    And I move card to Doing
    And I move card to Done
    Then I delete the card
    And operation should be successful