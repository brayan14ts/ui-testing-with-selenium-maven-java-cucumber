package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverUtils;

public class HomePage {
    private final WebDriver driver;

    // Localizadores
    private static final By aProductLocator = By.xpath("//span[contains(text(),'Bicicleta de Spinning VKT0145 pHILCO')]");
    private final By addACartLocator = By.className("button-root-Bhn");
    private static final By goToCheckoutLocator = By.xpath("//span[text()='finalizar compra']");
    By HomeButtonLocator = By.xpath("//img[@alt='logo']");

    // Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Métodos de verificación
    public void clickOnAProduct() {
        DriverUtils.sleep(10000);
        WebElement aProductElement = driver.findElement(aProductLocator);
        aProductElement.click();
    }

    public void clickOnHomeButton() {
        DriverUtils.sleep(5000);
        WebElement HomeButtonElement = driver.findElement(HomeButtonLocator);
        HomeButtonElement.click();
    }

    public void clickOnAddACart() {
        DriverUtils.sleep(5000); // espera de 5 segundos
        WebElement addACartElement = driver.findElement(addACartLocator);
        addACartElement.click();
    }

    public void clickGoToCheckout() {
        DriverUtils.sleep(5000); // espera de 5 segundos
        WebElement goToCheckoutElement = driver.findElement(goToCheckoutLocator);
        goToCheckoutElement.click();
    }
}


