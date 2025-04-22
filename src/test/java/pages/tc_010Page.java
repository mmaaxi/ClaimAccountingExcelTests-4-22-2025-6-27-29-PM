package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {
    WebDriver driver;

    By ramoColumn = By.xpath("//th[text()='Ramo']");
    By folioPreSolicitudColumn = By.xpath("//th[text()='Folio Pre solicitud']");
    By folioPreSolicitudCells = By.xpath("//td[count(//th[text()='Ramo']/preceding-sibling::th)+1]");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isRamoColumnVisible() {
        return driver.findElement(ramoColumn).isDisplayed();
    }

    public boolean isFolioPreSolicitudColumnNextToRamo() {
        WebElement ramoColumnElement = driver.findElement(ramoColumn);
        WebElement folioPreSolicitudColumnElement = driver.findElement(folioPreSolicitudColumn);

        return ramoColumnElement.findElement(By.xpath("following-sibling::th[1]")).equals(folioPreSolicitudColumnElement);
    }

    public boolean isFolioPreSolicitudColumnEmpty() {
        for (WebElement cell : driver.findElements(folioPreSolicitudCells)) {
            if (!cell.getText().isEmpty()) {
                return false;
            }
        }
        return true;
    }
}