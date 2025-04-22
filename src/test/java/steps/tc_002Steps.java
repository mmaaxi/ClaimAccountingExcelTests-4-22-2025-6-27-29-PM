import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class tc_002Steps {

    private tc_002Page page;

    @Given("el usuario ha abierto el archivo Excel exportado")
    public void abrir_excel_exportado() {
        page = new tc_002Page();
        page.abrirExcelExportado();
    }

    @When("el usuario localiza la Columna C")
    public void localizar_columna_c() {
        page.localizarColumnaC();
    }

    @Then("se observa la fórmula =CONCATENATE(D2,'_','H2','_','U2','_','O2','_','E2') aplicada")
    public void verificar_formula_concatenacion() {
        Assert.assertTrue(page.verificarFormulaConcatenacion());
    }

    @Then("la llave se forma concatenando No. Siniestro, No. De autorización, status, tipo de mov, no. De movimiento")
    public void verificar_llave_formacion() {
        Assert.assertTrue(page.verificarLlaveFormacion());
    }

    @Then("la llave se muestra correctamente en cada registro")
    public void verificar_llave_correcta_en_registros() {
        Assert.assertTrue(page.verificarLlaveCorrectaEnRegistros());
    }
}