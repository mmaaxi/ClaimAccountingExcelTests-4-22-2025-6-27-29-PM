package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {

    tc_009Page ivaRetenidoPage = new tc_009Page();

    @Given("la aplicación está abierta y se ha accedido al módulo de Excel")
    public void abrirAplicacionYAccederAModuloDeExcel() {
        ivaRetenidoPage.abrirAplicacion();
        ivaRetenidoPage.accederAModuloDeExcel();
    }

    @When("identifico la existencia de la columna 'IVA retenido'")
    public void identificarExistenciaColumnaIVARetenido() {
        Assert.assertTrue(ivaRetenidoPage.verificarExistenciaColumnaIVARetenido());
    }

    @Then("la columna 'IVA retenido' está presente en el Excel")
    public void verificarColumnaIVARetenidoPresente() {
        Assert.assertTrue(ivaRetenidoPage.verificarColumnaIVARetenidoPresente());
    }

    @Then("verifico que los montos en 'IVA retenido' son correctos")
    public void verificarMontosEsCorrecto() {
        Assert.assertTrue(ivaRetenidoPage.verificarMontosCorrectosIVARetenido());
    }
}