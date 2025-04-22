package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {
    tc_005Page page = new tc_005Page();

    @Given("el usuario está en la página de consulta de la tabla de reservas")
    public void el_usuario_esta_en_la_pagina_de_consulta_de_la_tabla_de_reservas() {
        page.navigateToReservationPage();
    }

    @When("el usuario identifica la columna 'Monto (reserva)'")
    public void el_usuario_identifica_la_columna_Monto_reserva() {
        Assert.assertTrue(page.isReservationAmountColumnPresent());
    }

    @Then("se observa la nueva columna titulada 'Monto acumulado Folio Reserva 5401'")
    public void se_observa_la_nueva_columna() {
        Assert.assertTrue(page.isNewAccumulatedAmountColumnPresent());
    }

    @When("el usuario verifica la fórmula de cálculo de la nueva columna")
    public void el_usuario_verifica_la_formula_de_calculo() {
        Assert.assertTrue(page.isAccumulationFormulaCorrect());
    }

    @Then("la fórmula se calcula correctamente en los registros")
    public void la_formula_se_calcula_correctamente() {
        // This step is validated by the assertion in the previous step
    }
}