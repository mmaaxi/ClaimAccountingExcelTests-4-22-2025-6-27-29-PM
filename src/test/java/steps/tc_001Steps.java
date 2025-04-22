package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver;
    tc_001Page claimAccountingReportPage;

    public tc_001Steps() {
        this.driver = Hooks.getDriver();
        claimAccountingReportPage = new tc_001Page(driver);
    }

    @Given("the user navigates to the Claim module")
    public void navigateToClaimModule() {
        claimAccountingReportPage.navigateToClaimModule();
    }

    @When("the user selects {string} from Report Code")
    public void selectReportCode(String reportCode) {
        claimAccountingReportPage.selectReportCode(reportCode);
    }

    @Then("the export Excel interface is displayed")
    public void verifyExportExcelInterface() {
        claimAccountingReportPage.verifyExportInterfaceDisplayed();
    }

    @When("the user performs actions {string}, {string}, {string}, and {string}")
    public void performExportActions(String submit, String viewLog, String addFolio, String downloadExcel) {
        claimAccountingReportPage.submitReport();
        claimAccountingReportPage.viewLogReport();
        claimAccountingReportPage.addFolio();
        claimAccountingReportPage.downloadExcelFile();
    }

    @Then("the Excel is exported correctly with base structure")
    public void verifyExcelExport() {
        claimAccountingReportPage.verifyExcelExportedCorrectly();
    }
}