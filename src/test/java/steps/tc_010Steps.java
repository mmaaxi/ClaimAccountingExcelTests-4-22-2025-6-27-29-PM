package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_010Page;

public class tc_010Steps {
    WebDriver driver;
    tc_010Page page;

    public tc_010Steps() {
        this.driver = Hook.getDriver();
        this.page = new tc_010Page(driver);
    }
    
    @Given("I am on the application's main page")
    public void iAmOnTheApplicationMainPage() {
        driver.get("https://example.com"); // URL to be replaced with actual application URL
    }

    @When("I locate the 'Ramo' column")
    public void iLocateTheRamoColumn() {
        Assert.assertTrue(page.isRamoColumnVisible());
    }

    @Then("I verify the column to its right is 'Folio Pre solicitud'")
    public void iVerifyTheColumnToItsRightIsFolioPreSolicitud() {
        Assert.assertTrue(page.isFolioPreSolicitudColumnNextToRamo());
    }

    @Then("I confirm that the 'Folio Pre solicitud' column contains no default values")
    public void iConfirmThatTheFolioPreSolicitudColumnContainsNoDefaultValues() {
        Assert.assertTrue(page.isFolioPreSolicitudColumnEmpty());
    }
}