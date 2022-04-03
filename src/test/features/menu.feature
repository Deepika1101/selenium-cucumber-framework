Feature: Menu Selection

  @menu
  Scenario: Hoover Over Menu Option
    Given Iam on the home page "https://www.next.co.uk/"
    When I hoover over the menu option "Women"
    And I clicked the link
    Then I should navigate to the women screen

