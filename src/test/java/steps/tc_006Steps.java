package steps;

import org.openqa.selenium.WebDriver;
import pages.tc_006Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page page;

    public tc_006Steps() {
        page = new tc_006Page(driver);
    }

    @Given("el usuario está en la página principal del sistema")
    public void el_usuario_esta_en_la_pagina_principal_del_sistema() {
        page.navegarAlSistema();
    }

    @When("el usuario busca la columna anteriormente denominada 'Monto Acumulado Folio OPC'")
    public void el_usuario_busca_la_columna_antes_denom_monto_acumulado_folio_opc() {
        page.buscarColumnaRenombrada();
    }

    @Then("la columna ha sido renombrada")
    public void la_columna_ha_sido_renombrada() {
        Assert.assertTrue(page.isColumnaRenombrada());
    }

    @Then("el nombre de la columna se muestra correctamente como 'Monto Acumulado Folio OPC (2121)'")
    public void el_nombre_de_la_columna_se_muestra_correctamente() {
        Assert.assertEquals("Monto Acumulado Folio OPC (2121)", page.obtenerNombreColumna());
    }
}