package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_004Page;

public class tc_004Steps {

    tc_004Page estadoPage = new tc_004Page();

    @Given("I open the Excel file with the records")
    public void openExcelFile() {
        estadoPage.openExcelFile();
    }

    @When("I review the existing records in the 'estado' column")
    public void reviewEstadoColumn() {
        estadoPage.reviewEstadoColumn();
    }

    @Then("The values in the 'estado' column should be modified according to the specifications")
    public void verifyEstadoModifications() {
        estadoPage.verifyEstadoModifications();
    }

    @When("I compare the updates against the criteria defined in HU Sabana Contable_V3")
    public void compareUpdatesToCriteria() {
        estadoPage.compareUpdatesToCriteria();
    }

    @Then("The updated data should meet the established requirements")
    public void validateUpdatedData() {
        estadoPage.validateUpdatedData();
    }
}