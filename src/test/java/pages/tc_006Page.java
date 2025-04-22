package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {
    WebDriver driver;

    private By columnaRenombrada = By.xpath("//th[text()='Monto Acumulado Folio OPC (2121)']");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAlSistema() {
        driver.get("URL_DE_LA_PAGINA_PRINCIPAL");
    }

    public void buscarColumnaRenombrada() {
        driver.findElement(columnaRenombrada).isDisplayed();
    }

    public boolean isColumnaRenombrada() {
        return driver.findElements(columnaRenombrada).size() > 0;
    }

    public String obtenerNombreColumna() {
        return driver.findElement(columnaRenombrada).getText();
    }
}