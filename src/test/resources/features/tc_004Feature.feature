Feature: Validate update of the 'estado' column

  Scenario: Check and validate updates on the 'estado' column
    Given I open the Excel file with the records
    When I review the existing records in the 'estado' column
    Then The values in the 'estado' column should be modified according to the specifications
    And I compare the updates against the criteria defined in HU Sabana Contable_V3
    Then The updated data should meet the established requirements