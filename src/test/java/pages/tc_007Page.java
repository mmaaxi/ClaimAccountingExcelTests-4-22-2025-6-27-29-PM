import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {
    WebDriver driver;

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean localizarColumnaIVA0() {
        // Localizar la columna 'IVA 0%' en el Excel cargado
        WebElement columnaIVA0 = driver.findElement(By.xpath("//th[contains(text(), 'IVA 0%')]"));
        return (columnaIVA0 != null);
    }

    public boolean verificarColumnaEnUbicacion() {
        // Verificar que la columna 'IVA 0%' esté en la ubicación esperada
        WebElement columnaIVA0 = driver.findElement(By.xpath("//th[contains(text(), 'IVA 0%')]"));
        // Lógica para verificar la ubicación, por ejemplo: columna especificada
        return columnaIVA0.getLocation().getX() == expectedXPosition; // Reemplazar expectedXPosition con el valor correcto
    }

    public boolean verificarValoresColumna() {
        // Verificar que todos los valores en la columna 'IVA 0%' representan la tasa 0%
        WebElement valoresColumna = driver.findElement(By.xpath("//td[contains(@data-title, 'IVA 0%')]"));
        return valoresColumna.getText().equals("0%"); // Adaptar la lógica de verificación
    }
}