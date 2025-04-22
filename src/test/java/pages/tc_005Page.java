package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class tc_005Page {
    WebDriver driver;
    WebDriverWait wait;

    By reservationAmountColumn = By.xpath("//th[contains(text(),'Monto (reserva)')]");
    By accumulatedAmountColumn = By.xpath("//th[contains(text(),'Monto acumulado Folio Reserva 5401')]");
    By reservationRows = By.xpath("//tr");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        PageFactory.initElements(driver, this);
    }

    public void navigateToReservationPage() {
        // Implement navigation step to reach the reservation page
        driver.get("URL_DE_LA_PAGINA_DE_RESERVAS");
    }

    public boolean isReservationAmountColumnPresent() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(reservationAmountColumn));
            return driver.findElement(reservationAmountColumn).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isNewAccumulatedAmountColumnPresent() {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(accumulatedAmountColumn));
            return driver.findElement(accumulatedAmountColumn).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public boolean isAccumulationFormulaCorrect() {
        List<WebElement> rows = driver.findElements(reservationRows);
        double previousAccumulatedAmount = 0;

        for (WebElement row : rows) {
            try {
                double currentReservationAmount = Double.parseDouble(row.findElement(By.xpath(".//td[POSITION_OF_RESERVATION_AMOUNT_COLUMN]")).getText());
                double expectedAccumulatedAmount = previousAccumulatedAmount + currentReservationAmount;
                double actualAccumulatedAmount = Double.parseDouble(row.findElement(By.xpath(".//td[POSITION_OF_ACCUMULATED_AMOUNT_COLUMN]")).getText());

                if (Math.abs(expectedAccumulatedAmount - actualAccumulatedAmount) > 0.01) {
                    return false;
                }

                previousAccumulatedAmount = actualAccumulatedAmount;
            } catch (Exception e) {
                // Log error if needed
                return false;
            }
        }
        return true;
    }
}