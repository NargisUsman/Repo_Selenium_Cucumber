Feature: Search

  Scenario: Verify user selection from autosuggestion appears on Search page.
    # I am on Landing Page
    When I enter 'york' in search
      And I enter 'Lake George, New York, United States of America' from autosuggestion
      And Click search button
    Then I verify search header contains text selected from autosuggestion
      And I verify text under 'Destination, property or landmark' is same as selecetd from autosuggestion

  Scenario: Verify the cheapest hotels is less than $100
    When I enter 'york' in search
     And I enter 'Lake George, New York, United States of America' from autosuggestion
     And I select 2 in children dropdown
     And I enter Child 1 age '4'
     And I enter Child 2 age '1'
     And Click search button
     And I sort the result by Prices 'low to high'
    Then I print the lowest price and the hotel name in Console
     And I verify the lowest price is less than 100
