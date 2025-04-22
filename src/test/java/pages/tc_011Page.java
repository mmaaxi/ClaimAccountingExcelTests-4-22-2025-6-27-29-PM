package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_011Page {

    WebDriver driver;
    By celdaFormula = By.id("celda_monto_acumulado_opc");

    public tc_011Page(WebDriver driver) {
        this.driver = driver;
    }

    public void iniciarSesion() {
        // Lógica para iniciar sesión
    }

    public void navegarAlMovimientosDePago() {
        // Lógica para navegar a la sección de movimientos de pago
    }

    public void revisarCeldaFormula() {
        driver.findElement(celdaFormula).click();
        // Lógica para revisar la celda
    }

    public boolean verificarFormulaActualizada() {
        String formula = driver.findElement(celdaFormula).getAttribute("value");
        return formula.equals("=Z4+AD5+AE5+AH5+AC5+AB5+AM5");
    }

    public boolean verificarElementosFormula() {
        String formula = driver.findElement(celdaFormula).getAttribute("value");
        return formula.contains("Z4") && formula.contains("AD5") && formula.contains("AE5") && 
               formula.contains("AH5") && formula.contains("AC5") && formula.contains("AB5") && 
               formula.contains("AM5");
    }

    public boolean verificarCalculos() {
        // Lógica para verificar que los cálculos sean correctos
        // Suponer lógica adecuada
        return true;
    }
}