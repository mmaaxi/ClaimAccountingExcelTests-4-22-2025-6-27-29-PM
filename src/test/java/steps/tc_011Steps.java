package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.tc_011Page;
import static org.junit.Assert.assertTrue;

public class tc_011Steps {

    WebDriver driver;
    tc_011Page page;

    @Given("El usuario ha iniciado sesión y accede a la hoja de movimientos de pago")
    public void el_usuario_ha_iniciado_sesion_y_accede_a_la_hoja_de_movimientos_de_pago() {
        // Setup del webdriver e inicialización de la página
        page = new tc_011Page(driver);
        page.iniciarSesion();
        page.navegarAlMovimientosDePago();
    }

    @When("El usuario revisa la celda correspondiente en la columna 'Monto Acumulado Folio OPC \\(2121)' del registro de pago")
    public void el_usuario_revisa_la_celda_correspondiente_en_la_columna() {
        // Acción de revisar la celda
        page.revisarCeldaFormula();
    }

    @Then("La celda contiene la fórmula actualizada correctamente")
    public void la_celda_contiene_la_formula_actualizada_correctamente() {
        // Verificación de que la fórmula está correcta
        assertTrue(page.verificarFormulaActualizada());
    }

    @Then("La fórmula =Z4+AD5+AE5+AH5+AC5+AB5+AM5 incluye los elementos requeridos")
    public void la_formula_incluye_los_elementos_requeridos() {
        // Verificación de elementos incluidos en la fórmula
        assertTrue(page.verificarElementosFormula());
    }

    @Then("La fórmula funciona conforme a la modificación especificada y los cálculos son correctos")
    public void la_formula_funciona_conforme_a_la_modificacion_especificada() {
        // Verificación de cálculos correctos
        assertTrue(page.verificarCalculos());
    }
}