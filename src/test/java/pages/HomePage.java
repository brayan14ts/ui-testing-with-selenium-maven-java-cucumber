package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private static WebDriver driver;

    // Localizadores
    private final By welcomeMessage = By.xpath("//span[contains(text(),'¡HOLA')]");

    // Constructor
    public HomePage(WebDriver driver) {
        HomePage.driver = driver;
    }

    // Métodos de verificación
    public static boolean isWelcomeMessageDisplayed(String welcomeMessage) {
        WebElement element = driver.findElement(By.xpath("//span[contains(text(),'" + welcomeMessage + "')]"));
        return element.isDisplayed();
    }
}
