package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    WebDriver driver;

    // Constructor
    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    // Abra la aplicación
    public void abrirAplicacion() {
        driver.get("URL_DE_LA_APLICACION");
    }

    // Acceda al módulo de Excel
    public void accederAModuloDeExcel() {
        driver.findElement(By.id("moduloExcel")).click();
    }

    // Verifique la existencia de la columna 'IVA retenido'
    public boolean verificarExistenciaColumnaIVARetenido() {
        return driver.findElements(By.xpath("//th[text()='IVA retenido']")).size() > 0;
    }

    // Verifique que la columna 'IVA retenido' esté presente
    public boolean verificarColumnaIVARetenidoPresente() {
        return driver.findElement(By.xpath("//th[text()='IVA retenido']")).isDisplayed();
    }

    // Verifique que los cálculos en 'IVA retenido' sean correctos
    public boolean verificarMontosCorrectosIVARetenido() {
        // Lógica de verificación de montos
        // ...
        return true; // Esto debe implementarse con la lógica real para verificar los montos
    }
}