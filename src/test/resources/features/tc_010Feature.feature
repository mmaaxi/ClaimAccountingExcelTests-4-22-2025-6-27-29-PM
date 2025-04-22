Feature: Validate creation of the 'Folio Pre solicitud' column without default values

  Scenario: Verify 'Folio Pre solicitud' column visibility and default values
    Given I am on the application's main page
    When I locate the 'Ramo' column
    Then I verify the column to its right is 'Folio Pre solicitud'
    And I confirm that the 'Folio Pre solicitud' column contains no default values