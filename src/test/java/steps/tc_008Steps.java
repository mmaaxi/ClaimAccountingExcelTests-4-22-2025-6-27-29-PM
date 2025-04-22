package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_008Page;
import org.junit.Assert;

public class tc_008Steps {
    tc_008Page page = new tc_008Page();

    @Given("La aplicación se encuentra abierta")
    public void laAplicacionSeEncuentraAbierta() {
        page.iniciarAplicacion();
    }

    @When("Localizo la columna 'IVA exento' en el Excel")
    public void localizoLaColumnaIVAExentoEnElExcel() {
        page.localizarColumnaIvaExento();
    }

    @Then("La columna 'IVA exento' se encuentra correctamente insertada")
    public void laColumnaIVAExentoSeEncuentraCorrectamenteInsertada() {
        Assert.assertTrue(page.esColumnaIvaExentoInsertada());
    }

    @When("Verifico que los montos aplicables al IVA exento se registran de acuerdo a la especificación")
    public void verificoLosMontosAplicablesAlIVAExento() {
        page.verificarMontosIvaExento();
    }

    @Then("Los datos de la columna cumplen con los criterios del IVA exento")
    public void losDatosDeLaColumnaCumplenConLosCriteriosDelIVAExento() {
        Assert.assertTrue(page.cumpleCriteriosIvaExento());
    }
}