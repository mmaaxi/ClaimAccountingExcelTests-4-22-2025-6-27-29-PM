package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;
import org.junit.Assert;

public class tc_003Steps {
    tc_003Page page = new tc_003Page();

    @Given("Estoy en la hoja de Excel")
    public void estoyEnLaHojaDeExcel() {
        page.abrirHojaDeExcel();
    }

    @When("Localizo la posición inmediatamente a la derecha de la columna 'i'")
    public void localizoLaPosicionDerecha() {
        page.localizarColumnaDerecha();
    }

    @Then("Se identifica una nueva columna en la posición correcta")
    public void seIdentificaNuevaColumna() {
        Assert.assertTrue(page.esNuevaColumnaIdentificada());
    }

    @Then("Verifico que el título de la columna sea 'Estado Código'")
    public void verificoTituloColumna() {
        Assert.assertTrue(page.esTituloColumnaCorrecto());
    }
}