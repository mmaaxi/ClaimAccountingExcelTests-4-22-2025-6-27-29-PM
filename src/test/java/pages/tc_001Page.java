package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {

    WebDriver driver;

    private By reportCodeDropdown = By.id("reportCodeDropdown");
    private By exportExcelButton = By.id("exportExcelButton");

    private By submitButton = By.id("submitButton");
    private By viewLogButton = By.id("viewLogButton");
    private By addFolioButton = By.id("addFolioButton");
    private By downloadExcelButton = By.id("downloadExcelButton");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToClaimModule() {
        // Code to navigate to the Claim module
    }

    public void selectReportCode(String reportCode) {
        // Code to select Claim Accounting Report from Report Code dropdown
    }

    public void verifyExportInterfaceDisplayed() {
        // Code to verify export Excel interface is displayed
    }

    public void submitReport() {
        // Code to click on Submit button
    }

    public void viewLogReport() {
        // Code to click on View Log button
    }

    public void addFolio() {
        // Code to click on Add Folio button
    }

    public void downloadExcelFile() {
        // Code to click on Download Excel button
    }

    public void verifyExcelExportedCorrectly() {
        // Code to verify Excel file is exported correctly
    }
}