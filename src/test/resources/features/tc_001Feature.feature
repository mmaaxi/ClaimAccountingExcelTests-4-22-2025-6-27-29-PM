Feature: Export and Generation of Claim Accounting Report Excel

  Scenario: Export Claim Accounting Report to Excel
    Given the user navigates to the Claim module
    When the user selects "Claim Accounting Report" from Report Code
    Then the export Excel interface is displayed
    When the user performs actions "Submit", "View Log", "Add Folio", and "Download Excel"
    Then the Excel is exported correctly with base structure