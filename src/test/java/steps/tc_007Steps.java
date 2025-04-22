import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_007Steps {
    WebDriver driver;
    tc_007Page excelPage;

    @Given("estoy en la hoja de cálculo con la información de impuestos")
    public void abrirHojaDeCalculo() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        excelPage = new tc_007Page(driver);
        driver.get("url/to/excel"); // Reemplazar con la URL correcta
    }

    @When("reviso el Excel para localizar la columna titulada 'IVA 0%'")
    public void revisarExcelParaColumna() {
        excelPage.localizarColumnaIVA0();
    }

    @Then("la columna 'IVA 0%' aparece en la ubicación especificada según el documento")
    public void verificarColumnaEnUbicacion() {
        assertTrue(excelPage.verificarColumnaEnUbicacion());
        driver.quit();
    }

    @Then("los valores en la columna 'IVA 0%' son representativos de la tasa 0% de IVA")
    public void verificarValoresColumnaIVA0() {
        assertTrue(excelPage.verificarValoresColumna());
        driver.quit();
    }
}